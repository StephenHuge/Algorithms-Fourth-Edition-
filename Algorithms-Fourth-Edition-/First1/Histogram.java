import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 *1.1.15 
 * 
 */
public class Histogram{
    public static void main(String[] args){
       
        int[] a = histogramInitial(10);
       int[] b = histogram(a, 15);
       printArray(a);
       printArray(b);
    }
    public static int[] histogramInitial(int len){
        int[] a = new int[len];
        for(int p=0;p<len;p++){
            a[p] = StdRandom.uniform(0,20);
        }
        return a;
    }
    public static int[] histogram(int[] a, int m){
        int[] b = new int[m];
        for(int i=0;i<a.length;i++){
            if(a[i]<m){
                int temp = a[i];
                b[temp]++;
            }
           
        }
        return b;
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            StdOut.print(a[i]+"\t");
        }
        StdOut.println("----------------");
    }
}