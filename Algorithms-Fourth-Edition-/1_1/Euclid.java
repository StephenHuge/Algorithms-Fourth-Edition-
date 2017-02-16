import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.24
 * 
 * 
 */
public class Euclid{
    public static void main(String[] args){
        int p = StdIn.readInt();
        int q = StdIn.readInt();
        gcd(p, q);
    }
    
    public static int gcd(int p, int q){
        //StdOut.println(p+", "+q);
        if(q==0) {
            StdOut.println(p);
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }    
}