import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.18
 * 
 * 
 */
public class LittleTest2{
    public static void main(String[] args){
//        String a = eR1(6);
//        System.out.println(a);
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int ab = mystery(a, b);
        //int ac = mystery(3, 11);
        System.out.println(ab);
    //    System.out.println(ac);
    }
    
    public static String eR1(int n){
        if(n<=0) 
            return " ";
        return eR1(n-3) + n + eR1(n-2) + n;
    }
    
    public static int mystery(int a, int b){
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a*a, b/2);
        return mystery(a*a, b/2) * a;
    }
}