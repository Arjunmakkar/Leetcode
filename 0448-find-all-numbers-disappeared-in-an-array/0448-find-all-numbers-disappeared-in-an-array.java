class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numset = new HashSet<>();
        for(int num : nums){
            numset.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 1;i<=nums.length;i++){
            if(!numset.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}