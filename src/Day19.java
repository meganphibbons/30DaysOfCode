class Day19 implements Day19Support {
    public int divisorSum(int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}