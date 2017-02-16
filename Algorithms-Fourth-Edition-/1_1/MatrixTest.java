import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.33
 * 
 * 
 */
public class MatrixTest{
    public static void main(String[] args){
       //DotTest();
       //mult1Test();
       //transposeTest();
       //mult2Test();
        mult3Test();
    }
    public static void mult3Test(){
        double[] a = ArrayInitial(3);
        double[][] b = MatrixInitial(3, 3);
        double[] c = Matrix.mult(a, b);
        printArray(a);
        printArray(b);
        StdOut.println("The answer is:");
        printArray(c);
    }
    public static void mult2Test(){
        double[][] a = MatrixInitial(3, 3);
        double[] b = ArrayInitial(3);
        double[] c = Matrix.mult(a, b);
        printArray(a);
        printArray(b);
        StdOut.println("The answer is:");
        printArray(c);
    }
    public static void transposeTest(){
        double[][] a = MatrixInitial(5, 5);
        double[][] b = Matrix.transpose(a);
        printArray(a);
        StdOut.println("The answer is:");
        printArray(b);
    }
    public static void mult1Test(){
        double[][] a1 = MatrixInitial(6, 4);
        double[][] a2 = MatrixInitial(4, 3);
        double[][] c = Matrix.mult(a1, a2);
        printArray(a1);
        printArray(a2);
        printArray(c);
    }
    public static void DotTest(){
        double[] a = ArrayInitial(5);
        double[] b = ArrayInitial(5);
        Matrix.dot(a, b);
        printArray(a);
        printArray(b); 
    }
    public static double[] ArrayInitial(int k){
        double[] a = new double[k];
        for(int i=0; i<k; i++){
            double temp = StdRandom.uniform(0,5);
            a[i] = temp;
        }
        return a;
    }
    
    public static double[][] MatrixInitial(int r, int c){
        double[][] matrix = new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = StdRandom.uniform(0,10);
            }
        }
        return matrix;
    }
    public static void printArray(double[] a){
        int i = a.length;        
        for(int p=0;p<i;p++){
            StdOut.print(a[p]+"\t");
        }
        StdOut.println("\n"+"-----------------------------------");
    }
     public static void printArray(double[][] a){
         if(a==null){
             StdOut.println("Matrix is null.");
             return;
         }
        int i = a.length;        
        int j = a[0].length;
        for(int p=0;p<i;p++){
            for(int q=0;q<j;q++){
                StdOut.print(a[p][q]+"\t");
            }
            StdOut.println(); 
        }
        StdOut.println("-----------------------------------");
    }
}
