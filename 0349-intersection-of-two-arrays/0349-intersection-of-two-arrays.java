class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet(); 
        HashSet<Integer> res = new HashSet(); 
    
        for(int itr = 0; itr < nums1.length; itr++){
            set.add(nums1[itr]);
        }
    
        for(int itr = 0; itr < nums2.length; itr++){
            if(set.contains(nums2[itr])) res.add(nums2[itr]);
        }
    
        int[] arr = new int[res.size()];        
        int jtr = 0;
        for (int itr : res)  
            arr[jtr++] = itr; 
    
        return arr;
    }
}