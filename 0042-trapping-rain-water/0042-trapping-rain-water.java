class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int[] prefixArr = new int[n];
        int[] suffixArr = new int[n];

        prefixArr[0] = arr[0];
        for(int i=1; i<n; i++){
            prefixArr[i] = Math.max(arr[i], prefixArr[i-1]);
        }

        suffixArr[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            suffixArr[i] = Math.max(arr[i], suffixArr[i+1]);
        }
        
        int totalWater = 0;
        for(int i=0; i<n; i++){
           int leftMost = prefixArr[i];
           int rightMost = suffixArr[i];
           totalWater += Math.min(leftMost, rightMost) - arr[i];
        }
        return totalWater;
    }
}