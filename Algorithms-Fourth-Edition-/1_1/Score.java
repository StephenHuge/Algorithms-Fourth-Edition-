import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.21
 * 
 * 
 */
public class Score{
    public static void main(String[] args){
        String[] s = getData();
         printData(s);
    }
    public static String[] getData(){
        String[] data = new String[4];
        String name = StdIn.readString();
        data[0] = name;
        double d1 = StdIn.readInt();
        data[1] = String.valueOf(d1);
        double d2 = StdIn.readInt();
        data[2] = String.valueOf(d2);
        data[3] = String.valueOf(d1/d2);
       return data;
    }

    public static void printData(String[] data){
        for(int i=0; i<data.length; i++){
            StdOut.printf(data[i] + "|"+"\t");
        }
        StdOut.printf("-----------------------------");        
    }
}