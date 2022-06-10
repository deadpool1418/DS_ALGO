class Solution {
    
    public void find(int ind, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ans){
        if(ind == candidates.length) {
            if(target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(candidates[ind] <= target) {
            ds.add(candidates[ind]);
            find(ind, candidates, target-candidates[ind], ds, ans);
            ds.remove(ds.size() - 1);
        }
        find(ind+1, candidates, target, ds, ans);
        
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        find(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}