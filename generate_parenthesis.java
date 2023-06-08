public class Solution {
	public List<String> generateParenthesis(int n){
		List<String> ans = new ArrayList<String>();
		helperFunc(ans, "", 0, 0, n);
		return ans;
	}
	
	public void helperFunc(List<String> list, String curr, int open, int close, int n){
		if(curr.length() == 2 * n){
			list.add(curr);
			return;
		}
		
		if(open < n) helperFunc(list, curr + '(', open + 1, close, n);
		if(close < open) helperFunc(list, curr + ')', open, close + 1, n);
	}
}
