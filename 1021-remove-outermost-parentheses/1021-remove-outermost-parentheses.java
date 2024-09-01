class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder("");
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i=0; i<n; i++){
            if(st.isEmpty()){
            st.push(s.charAt(i));
            }
            else{
               if(s.charAt(i) == '('){
                st.push(s.charAt(i));
                sb.append(s.charAt(i));
               }
               if(s.charAt(i) == ')' && st.size() == 1){
                st.pop();
               }
               if(s.charAt(i) == ')' && st.size() > 1){
                st.pop();
                sb.append(s.charAt(i));
               }

            }
        }
        return sb.toString();
    }
}