class Solution {
    
    public void find(int ind, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ans){
        if(target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind; i<candidates.length; i++) {
            if(i > ind && candidates[i] == candidates[i-1]) continue;
            if(candidates[i] > target) break;
            
            ds.add(candidates[i]);
            find(i+1, candidates, target-candidates[i], ds, ans);
            ds.remove(ds.size() - 1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        find(0, candidates, target, new ArrayList<>(), ans);
        return ans;
    }
}