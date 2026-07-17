class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> bucket = new HashMap<>();

        for (String curr : strs) {

            String key = generalize(curr);

                if (!bucket.containsKey(key)) {
                        bucket.put(key, new ArrayList<>());
                            }

                                bucket.get(key).add(curr);
                                }

                                return new ArrayList<>(bucket.values());
    }
    static String generalize(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
