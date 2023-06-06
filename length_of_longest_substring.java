class Solution {
	public int lengthOfLongestSubstring(String s){
		Set<Character> set = new HashSet<>();
		int max = 0;
		int left = 0;

		for(int index = 0; index < s.length(); index++){
			//If the set does not contain the character
			while(!set.add(s.charAt(index))){
				set.remove(s.charAt(left++));
			}
			max = Math.max(max, index - left + 1);
		}
		return max;
	}
}
