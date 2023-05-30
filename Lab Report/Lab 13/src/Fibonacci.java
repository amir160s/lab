public class Fibonacci {
    int n;
    public Fibonacci(int n)
    {
        this.n=n;
    }
    public int fib(int n)
    {
        if(n<=1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
}
