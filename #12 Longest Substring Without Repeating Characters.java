/* 
Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/

    public int lengthOfLongestSubstring(String s) {
        int max = 0, start = 0, end = 0;
        HashSet<Character> set = new HashSet<Character>();
        
        while(end < s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                max = Math.max(set.size(), max);
                end++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }