package demo;
public class LeetCode1823 {
    int solve(int n, int k){
        // Base Case // Corner Case // Edge Case
        if(n == 1){
            return 0;
        }
        return (solve(n-1, k) + k) % n;
    }
    int findWinner(int n, int k){
        int winner = solve(n,k) + 1; // This is for 1-based answer
        return winner;
    }
    public static void main(String[] args) {
        LeetCode1823 o = new LeetCode1823();
        System.out.println(o.findWinner(5,2));
        System.out.println(o.findWinner(6,5));
    }
}
