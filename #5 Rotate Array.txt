//Given an array, rotate the array to the right by k steps, where k is non-negative.

//first approach
    public void rotate(int[] nums, int k) {
		if(nums.length == 0)return;
		k %= nums.length;
		reverse(nums, 0, nums.length-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, nums.length-1);
	}
	
	public void reverse(int[]nums , int start, int end){
		int temp = 0;
		while(start < end){
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
	

//second approach 
    public void rotate(int[] nums, int k) {
        int[] rotatedArray = new int[nums.length];
        int index = 0;
        int arrayLength = nums.length;
        for(int i = 0 ; i < arrayLength ; i++){
            if(i+k >= arrayLength){
                index = i+k-arrayLength;
                rotatedArray[index] = nums[i];
            } else {
                index = i+k;
                rotatedArray[index] = nums[i];
            }
        }
        nums = rotatedArray;
    }