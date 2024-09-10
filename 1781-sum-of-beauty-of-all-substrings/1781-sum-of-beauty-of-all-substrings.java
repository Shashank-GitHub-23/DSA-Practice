class Solution {
    public int beauty(HashMap<Character, Integer> hm){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for(int i : hm.values() ){
            if(i>0){
                maxi = Math.max(maxi, i);
                mini = Math.min(mini, i);
            }
        }
        return maxi-mini;
    }
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;
        for(int i=0; i<n; i++){
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j=i; j<n; j++){
                char ch = s.charAt(j);
                int val = map.getOrDefault(ch, 0);
                map.put(ch, val+1);

                sum += beauty(map);
            }
        }
        return sum;
    }
}