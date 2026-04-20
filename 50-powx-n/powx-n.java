class Solution {
    public double myPow(double x, int n) {
        long num = n;
        if (num < 0) {
            x = 1 / x;
            num = -num;
        }

        double result = 1;
        double currentProduct = x;

        while (num > 0) {
            if (num % 2 == 1) {
                result = result * currentProduct;
            }
            currentProduct = currentProduct * currentProduct;
            num = num / 2;
        }

        return result;
    }
}
