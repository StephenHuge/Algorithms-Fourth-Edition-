import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LittleTest1{
    public static void main(String[] args){
        int a = lg(277);
        StdOut.println(a);

    }
    /**
     * 1.1.14
     * 
     */
     public static int lg(int n){
            int temp = n;
            int i = 0;
            while(temp>=2){
                temp = temp/2;
                ++i;
            }
            return i;
        }
}