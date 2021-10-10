/*
Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

The distance between two adjacent cells is 1.

Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
Output: [[0,0,0],[0,1,0],[1,2,1]]
*/   


   public int[][] updateMatrix(int[][] mat) {
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                } else {
                  mat[i][j] = -1;  
                }
            }
        }
        
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};   
        int step = 0, counter = 0;
        while(!q.isEmpty()){
            int size = q.size();
            counter++;
            for(int k = 0; k < size; k++){
                int[] temp = q.poll();
                for(int[] dir : dirs){
                    int x = temp[0] + dir[0],
                        y = temp[1] + dir[1];
                    if(x >= 0 && x < mat.length && y >= 0 && y < mat[0].length){
                        if(mat[x][y] == -1){
                            mat[x][y] = counter;
                            q.add(new int[]{x,y});
                        }
                        
                    }
                }         
            }
            step++;
        }
        
        return mat;
    }