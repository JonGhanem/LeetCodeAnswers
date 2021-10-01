/* Given a string s, 
reverse the order of characters in each word within a sentence while still preserving whitespace and
 initial word order. 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc" */


public String reverseWords(String s) {
        if(s.length() == 1) return s;
        char[] ch = s.toCharArray();
        int start = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(ch[i] == ' '){
                reverseWord(ch, start, i-1);
                start = i+1;  
            }
        }
        reverseWord(ch, start, s.length()-1);
        return new String(ch);
    }

    	public void reverseWord(char[] ch , int start, int end){
		char temp = 'a';
		while(start < end){
			temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
	}