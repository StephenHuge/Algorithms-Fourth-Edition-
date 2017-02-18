import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.20
 * 
 * 
 */
public class LittleTest3{
    public static void main(String[] args){
        double a = lnN(5);
        StdOut.print(a);
    }
    public static double lnN(int n){        
        if(n>1)
            return Math.log(n) + lnN(n-1);
        else
            return 0;  
    }
}