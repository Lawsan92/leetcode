class Solution {
    public int romanToInt(String s) {

        // create numeral map
        Map<Character, Integer> numeralMap = new HashMap<>(); 
        numeralMap.put('I', 1);
        numeralMap.put('V', 5);
        numeralMap.put('X', 10);
        numeralMap.put('L', 50);
        numeralMap.put('C', 100);
        numeralMap.put('D', 500);
        numeralMap.put('M', 1000);

        int base10 = 0;

        for (int i = 0; i < s.length(); i++) {
            char curNumeral = s.charAt(i);
            int curNum = numeralMap.get(curNumeral);
            // bounds check
            if (i + 1 < s.length()) {
                Character nextNumeral = s.charAt(i + 1);
                int nextNum = numeralMap.get(nextNumeral);
                if (curNum < nextNum) {
                    base10 += nextNum - curNum;
                    i += 1;
                } else {
                    base10 += curNum;
                }
            } else {
                base10 += curNum;
            }
        }

        /*
        
        - get input string
        - start mapping to numbers, one character at a time using roman number map
        - keep adding new number to total

        e.g. DCLXXXXIII (693)
        |
        DCLXXXXIII -> 500
        
         |
        DCLXXXXIII -> 500 + 100

          |
        DCLXXXXIII -> 500 + 100 + 50 ....

         */
        return base10;
    }
}