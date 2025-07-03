class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result;
        if (s.isEmpty()) {
            result = 0;
            return result;
        } else {
            result = 1;
        }
        int middleResult = 1;
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            for (int j = (i + 1) ; j < s.length(); j++) {
                char next = s.charAt(j);
                if (!s.substring(i ,j).contains(String.valueOf(next))) {
                    middleResult ++;
                } else {
                    break;
                }
            }
            if (middleResult > result) {
                result = middleResult;
            }
            middleResult = 1;
        }
        return result;
    }
}