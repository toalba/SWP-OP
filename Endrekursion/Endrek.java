package Endrekursion;

public class Endrek {
    // Beispiel an der tollen Fibonacci Reihe
    public static int fibog(int nummer) {
        return fibo(0,1,nummer-1);
        
    }
    private static int fibo(int x1,int x2, int n){
        if (n<0) return 0;
        if (n==0) return x2;
        return fibo(x2, x1+x2, n-1);
    }
    public static void main(String[] args) {
        System.out.println(fibog(6));
    }
}