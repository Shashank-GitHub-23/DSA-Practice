class Solution {
    public int pivotIndex(int[] arr) {
        int n = arr.length;
        int totalSum = 0;
        for(int num : arr){
            totalSum+=num;
        }
        int leftSum = 0;
        int rightSum = totalSum;

        for(int i=0; i<n; i++){
            rightSum -= arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }


}