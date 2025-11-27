public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        
        int n = Integer.parseInt(args[0]);

        
        boolean[] isPrime = new boolean[n + 1];
        int i = 2;
        while (i <= n) {
            isPrime[i] = true;
            i++;
        }
        int p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                int multiple = 2 * p;
                while (multiple <= n) {
                    isPrime[multiple] = false;
                    multiple += p;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + n + ":");
        int count = 0;
        int num = 2;
        while (num <= n) {
            if (isPrime[num]) {
                System.out.println(num);
                count++;
            }
            num++;
        }

       
        int percent = (100 * count) / n;
        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + percent + "% are primes)");
    }
}
    
