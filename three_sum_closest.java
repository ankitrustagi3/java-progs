class Solution {
	public int threeSumClosest(int[] nums, int target){
		int close = Integer.MAX_VALUE;
		int j;

		for(int i = 0; i < nums.length - 2; i++){
			// Two pointer solution with j and k
			j = i + 1;
			k = nums.length - 1;

			while(j < k) {
				int sum = nums[i] + nums[j] + nums[k];

				if(sum == target) return target;

				else if(sum < target) j++;
				else k--;

				int diff = Math.abs(sum - target);

				if(diff < close){
					close = diff;
				}	

			}		
		}
		return close;
	}
}
