import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.11
 */
public class TwoDBoo{
    public TwoDBoo(){
    }
    public static void main(String[] args){
        boolean[][] a = TwoDBooaInitial();
        printColumn();
        printTwoDBoo(a);
    }
    public static boolean[][] TwoDBooaInitial(){
        boolean[][] a = new boolean[10][10];
        for(int p=0;p<10;p++){
            for(int q=0;q<10;q++){
                double temp = StdRandom.uniform(0,100);
                if(temp%2==0)
                    a[p][q] =true;
                else
                    a[p][q] =false;
            }
        }
        return a;
    }
    
    public static void printColumn(){
        for(int a=0;a<11;a++){
            System.out.print(a+"\t");
        }
        System.out.println();
    }
    public static void printTwoDBoo(boolean[][] a){
        for(int i=1;i<11;i++){
           System.out.print(i+" ");
           for(int j=0;j<10;j++){
               if(a[i-1][j]==true)
                   System.out.print("\t"+"*");
               else if(a[i-1][j]==false){
                   System.out.print("\t"+" ");
               }
           }
           System.out.println();
        }
    }
    
}
