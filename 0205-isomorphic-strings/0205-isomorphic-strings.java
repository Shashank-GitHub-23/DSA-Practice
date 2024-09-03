class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sTOt = new HashMap<>();
        HashMap<Character, Character> tTOs = new HashMap<>();
        int n = s.length();

        for(int i=0; i<n; i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            
            if(sTOt.containsKey(s1) == false){
                sTOt.put(s1, t1);
            }
            if(tTOs.containsKey(t1) == false){
                tTOs.put(t1, s1);
            }
            if(sTOt.get(s1) != t1 || tTOs.get(t1) != s1){
                return false;
            }
        }
        return true;
    }
}