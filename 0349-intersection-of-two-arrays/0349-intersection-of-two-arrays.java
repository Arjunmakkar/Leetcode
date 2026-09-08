class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> map = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num))map.add(num);
        }
        int[] result = new int[map.size()];
        int i=0;
        for(int num:map){
            result[i++]=num;
        }
        return result;
    }
}