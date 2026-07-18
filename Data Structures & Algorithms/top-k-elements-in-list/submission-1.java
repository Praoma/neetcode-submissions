class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> freq[] = new ArrayList[nums.length+1];
        for(int i=0; i<=nums.length; i++){
            freq[i] = new ArrayList<>();
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int curr = entry.getKey();
            int count = entry.getValue();

            freq[count].add(curr);
        }

        int res[] = new int[k];
        int j = 0;
        for(int i=nums.length; i>0; i--){
            for(int curr: freq[i]){
                if(j == k) return res;
                res[j++] = curr;
            }
        }

        return res;
    }
}
