class Solution {
    public int fib(int n) {
        
        if (n == 0 || n == 1) {
            return n;
        }
        int i = 1;
        int j = 0;
        int sum = i + j;
        while (n > 2) {
            sum = sum + i;
            i = sum - i;
            n--;
        }
        return sum;
    }
}