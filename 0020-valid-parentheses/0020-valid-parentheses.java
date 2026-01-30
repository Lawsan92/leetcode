class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            boolean openingBracket = (bracket == '(') || (bracket == '{') || (bracket == '[');
            boolean closingBracket = (bracket == ')') || (bracket == '}' )|| (bracket == ']'); 
            if (openingBracket) {
                stack.push(bracket);
            };
            if(closingBracket) {
                if (stack.isEmpty()) return false;
                char poppedBracket = stack.pop();
                if (
                    (bracket == ')' && poppedBracket != '(') || 
                    (bracket == ']' && poppedBracket != '[') || 
                    (bracket == '}' && poppedBracket != '{')
                ) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}