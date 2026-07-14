class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            String wordString = new String(word);
            if (map.containsKey(wordString)) {
                List<String> current = map.get(wordString);
                current.add(strs[i]);
                map.put(wordString, current);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(wordString, newList);
            }
        }
        return new ArrayList<>(new ArrayList<>(map.values()));
    }
}