class Solution {
    public int myAtoi(String s) {
        s = s.trim(); // removed white spaces
        int n= s.length();
        if( n == 0) return 0;

        long ans = 0;
        boolean negative = false;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(i==0){
              if(ch == '-'){
                negative = true;
                continue;
              }
              else if( ch == '+'){
                continue;
              }
            }

            if(ch >= '0' && ch<='9'){
                ans = ans*10 + (ch-'0');
                long check = -ans;
                if(negative && check < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
                }
                if(!negative && ans > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
                }
                
                
            }else{
                break;
            }    
        }
        if(negative == true){
            ans = -ans;
        }
        return (int)ans;
    }
}