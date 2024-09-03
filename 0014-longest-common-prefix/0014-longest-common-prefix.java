class Solution {
    public String Common(String s1, String s2){
      StringBuilder sb = new StringBuilder();  
      int n = Math.min(s1.length(), s2.length());

      for(int i=0; i<n; i++){
        if(s1.charAt(i) == s2.charAt(i)){
            sb.append(s1.charAt(i));
        }else{
            break;
        }
      }
      return sb.toString();
    }
    public String longestCommonPrefix(String[] arr) {
       String ans = arr[0];

        for(int i=1; i<arr.length; i++){
            ans = Common(ans, arr[i]);
        }
        return ans;
    }
}