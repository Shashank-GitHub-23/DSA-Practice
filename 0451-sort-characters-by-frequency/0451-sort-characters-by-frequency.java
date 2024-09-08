class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            int value = hm.getOrDefault(ch, 0);
            hm.put(ch, value+1);
        }

        ArrayList<Character> li = new ArrayList(hm.keySet());
        // sort in decending order
        li.sort((ob1, ob2) -> hm.get(ob2) - hm.get(ob1));
        for(char ch : li){
            for(int i=0; i<hm.get(ch); i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}