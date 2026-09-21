import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(int[] candidates, int target, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // Target reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Target exceeded
        if (target < 0) {
            return;
        }

        // Try all possible numbers
        for (int i = index; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // We pass i, not i + 1
            // because the same number can be used again
            backtrack(candidates,
                      target - candidates[i],
                      i,
                      current,
                      result);

            // Undo choice
            current.remove(current.size() - 1);
        }
    }
}