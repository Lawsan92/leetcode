class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs[0].equals("") || strs.length == 1) { return strs[0];}
        String prefix = "";
        int j = 0;
        int matches = 0;
        for (int i = 0; i < strs.length; i++) {
            boolean outOfBounds = j == strs[0].length() || j == strs[i].length();
            if (outOfBounds) {break;}
            char curChar = strs[0].charAt(j);
            String curStr = strs[i];
            if(curStr.charAt(j) == curChar) {
                matches += 1;
            }
            if (matches == strs.length) {
                prefix += curChar;
                j += 1;
                matches = 0;
                i = -1;
            }
        }
        
        return prefix;
    }
}

    /*
      |        |
    ["flower","flow","flight"]
    
    // compare char[0] of string[0] to char[0] of string [1]
      // if they match
        // loop to the next string in the array
      // otherwise
        // break the loop

   
    
    
     */