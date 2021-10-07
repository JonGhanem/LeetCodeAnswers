/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false
*/

     public boolean checkInclusion(String s1, String s2) {
	    if(s1.length() > s2.length()) return false;
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        
        for(int i = 0; i < s1.length(); i++){
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }
        for(int i = s1.length() ; i < s2.length() ; i++){
			if(Arrays.equals(arr1, arr2)) return true;
			arr2[s2.charAt(i - s1.length()) - 'a']--;
			arr2[s2.charAt(i) - 'a']++;
        }
		return Arrays.equals(arr1, arr2);

    }