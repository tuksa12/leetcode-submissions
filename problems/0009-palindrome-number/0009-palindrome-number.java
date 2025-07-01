class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String palindrom = "";
        for(int i = num.length()-1; i >= 0; i--) {
            palindrom += num.charAt(i);
        }
        return (num.equals(palindrom));
    }
}