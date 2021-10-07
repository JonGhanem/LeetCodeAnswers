/*Given a sorted array of distinct integers and a target value, 
return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.*/

    int start=0;
        int end=nums.length-1;
        
        if(target>nums[end]){
            return end+1;
        }
        
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid])return mid;
            else if(target>nums[mid])start=mid+1;
            else end=mid-1;
        }
		
        return start;
    }