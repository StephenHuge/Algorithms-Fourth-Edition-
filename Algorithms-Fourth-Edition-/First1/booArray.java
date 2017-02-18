import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.30
 * 
 * 
 */
public class booArray{
    public static void main(String[] args){
        int k = StdIn.readInt();
        boolean[][] a = buildArray(k);
        inflateArray(a);
        printArray(a);
    }
    public static boolean[][] buildArray(int n){
        boolean[][] a = new boolean[n][n];
        return a;
    }
    public static void printArray(boolean[][] a){
        int i = a.length;        
        for(int p=0;p<i;p++){
            for(int q=0;q<i;q++){
                StdOut.print(a[p][q]+"\t");
            }
            StdOut.println(); 
        }
        StdOut.println("-----------------------------------");
    }
    public static void inflateArray(boolean[][] a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(gcd(i, j)==1)
                    a[i][j] = true;
                else
                    a[i][j] = false;
            }
        }
    }
     public static int gcd(int p, int q){
        if(q==0 || p==0) return 1;
        int r = p % q;
        if(r==0) return q;
        return gcd(q, r);
    }    
     
    
    
}