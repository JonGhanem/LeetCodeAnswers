/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/    


    public void moveZeroes(int[] nums) {
        int i = 0, length = nums.length;
        while(i < length){
            if(nums[i] == 0){
                swapLeft(nums, i , nums.length -1);
                length--;
            } else{
                i++;
            }
        }
    }
    
    public void swapLeft(int[] nums , int start, int end){
        for(int i = start; i< end ; i++){
            nums[i] = nums[i+1];
        }
        nums[end] = 0 ;
    }