class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for(String word : words){
            if(checkRow(word.toLowerCase(), row1) || checkRow(word.toLowerCase(), row2) || checkRow(word.toLowerCase(), row3)){
                result.add(word);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public boolean checkRow(String word, String row){
        for(char ch : word.toCharArray()){
            if(row.indexOf(ch) == -1 ){
                return false;
            }
        }
        return true;
    }
}