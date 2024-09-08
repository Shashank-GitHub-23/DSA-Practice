class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }
            if(s.charAt(i) == ')'){
                st.pop();
            }
            max = Math.max(st.size(), max);
        }
        return max;
    }
}