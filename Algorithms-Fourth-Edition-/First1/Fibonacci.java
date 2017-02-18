import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
  *1.1.19 
  * 
  */
public class Fibonacci{
    public static long F(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n-1) + F(n-2);
    }
    public static long G(int n){
        long f = 0;
        long g = 1;
        long[] b =  new long[n];
        for(int i=0; i<n; i++){
          //  StdOut.println(i+" "+f);
            f = f + g;
            g = f - g;
           keepIt(b, i, f);
        }
        printArray(b);
        return f;
    }
    public static void keepIt(long[] a, int po,long f){
        a[po] = f;
        if(po>a.length-1) {
            StdOut.print("ArrayOutofIndexError");
            return;
        }
    }
      public static void printArray(long[] a){
        for(int i=0;i<a.length;i++){
            StdOut.print(a[i]+"\t");
            if(i>1 && i%10==0)
                StdOut.println();
        }
        //StdOut.println("----------------");
    }
    public static void main(String[] args){
      //  for(int n=0; n<100; n++)
       // StdOut.println(n+" "+F(n));
        long a = G(50);
    }
}