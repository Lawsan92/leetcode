class Solution {
    public int fib(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        // return fib(n - 1) + fib(n-2);
        // f(3) = f(2) + f(1) => 1 + 1 => 2
        int i = 1; // f(1)
        int j = 0; // f(0)
        int sum = i + j; // f(2): 1
        while (n > 2) { // 3
            sum = sum + i; // f(3): 1 + 1 => 2 | f(5): 3 + 2 => 5
            i = sum - i;  // f(2): 2 - 1 => 1 | f(4): 5 - 2 => 3
            n--;
        }
        return sum;
    }
}

/*

f(1) = 1

f(2) = f(1) + f(0) => 1 + 0 => 1

f(3) = f(2) + f(1) => 1 + 1 => 2

f(4) = f(3) + f(2) => 2 + 1 => 3

f(5) = f(4) + f(3) => 3 + 2 => 5

f(6) = f(5) + f(4) => 5 + 3 => 8

 */