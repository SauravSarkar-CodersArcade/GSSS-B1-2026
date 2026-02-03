public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 100;
        boolean[] prime = new boolean[n+1];
        for (int i=2; i<=n; i++){
            prime[i] = true; // Initially all are prime
        }
        for (int i=2; i*i <=n; i++){
            if(prime[i]){
                for (int j= i*i; j<=n; j+=i){
                    prime[j] = false; // cancel the multiples
                }
            }
        }
        // Print the remaining prime numbers
        for (int i=2; i<=n; i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
        }
    }
}
