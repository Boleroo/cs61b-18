public class fib {
    /** Returns the nth fibonacci number using recursion.
     * @param n the nth index
     */
    public static int fib(int n){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

    /** Returns the nth fibonacci number in 5 lines(more efficient) */
    public static int fib2(int n, int k, int f0, int f1){
        if(k==n){
            return f0;
        }
        return fib2(n, k+1, f1, f1+f0);
    }
    public static void main(String[] args) {
        System.out.println(fib(Integer.parseInt(args[0])));
        System.out.println(fib2(Integer.parseInt(args[0]), 1, 0, 1));
    }
}
