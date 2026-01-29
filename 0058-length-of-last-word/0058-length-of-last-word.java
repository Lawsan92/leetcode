class Solution {
    public int lengthOfLastWord(String s) {
        
        
        // start ar the end of the string and iterate backwards
        // when you reach a non whitespace character
          // start counting characters
          // exit the loop by returning the count
        
        String tracker = "";
        int lwlen = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (tracker.length() > 1 && tracker.charAt(tracker.length() - 1) == 'w' && tracker.charAt(tracker.length() - 2) == 'c') {
                return lwlen;
            }
            if (s.charAt(i) == (' ')) {
                tracker += 'w';
            } else {
                lwlen++;
                tracker += 'c';
            }
        }
        return lwlen;
    }
}