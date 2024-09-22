class Solution {
    public String CleanString(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if( Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public boolean isPalindrome(String s) {
       String str =  CleanString(s).toLowerCase();
       return isPalindromeHelper(str, 0, str.length()-1);
    }
    public boolean isPalindromeHelper(String s, int start, int end) {
        if(start >= end){
            return true;
        }

        if(s.charAt(start) != s.charAt(end) ) return false;

        return isPalindromeHelper( s, start+1, end-1);
    }


}