class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        int n = nums2.length;
        //traverse array from back
        for(int i=n-1; i>=0; i--){
            //pop element if small, No need of small element just like a small poll
            while(!st.isEmpty() && nums2[i] > st.peek()){
                st.pop();
            }
            
            if(st.isEmpty()){
                map.put(nums2[i], -1); //no greater element found
            }else{
                map.put(nums2[i], st.peek()); //greater element found
            }
            st.push(nums2[i]); //push in stack to maintain greater element order
        }

        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
           ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}