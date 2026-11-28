class Solution {
    public int lengthOfLastWord(String s) {
        String[]si=s.split(" ");
        return si[si.length-1].length();
    }
}