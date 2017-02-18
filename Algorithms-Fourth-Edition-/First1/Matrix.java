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
public class Matrix{
    /**
     *vectors mutiply 
     */
    public static double dot(double[] x, double[] y){
        double s = 0;
        if(x.length!=y.length){
            StdOut.println("Arrays' lengths are not equal");
            return -1;
        }else{
            for(int i=0; i<x.length; i++){
                s += x[i]*y[i];
            }
            StdOut.println("s="+s);
        }
        return s;
    }
    /**
     *matrixs mutiply 
     */
    public static double[][] mult(double[][] a, double[][] b){
        int i = a.length;
        int j  =a[0].length;
        int m = b.length;
        int n = b[0].length;        
        if(j!=m){
            StdOut.println("Number of the first matrix's row is not equal to that "
                                +"of the second one's column.");
            return null;
        }else{
            double[][] c = new double[i][n];
            for(int p=0; p<i; p++){
                for(int q=0; q<n; q++){
                    for(int t=0; t<j; t++){
                        c[p][q] += a[p][t] * b[t][q];
                    }
                }
            }
            return c;
        }
    }

    /**
     *matrix transforms to matrix* 
     */
    public static double[][] transpose(double[][] a){
        int i = a.length;
        int j  =a[0].length;
        double[][] b = new double[i][j];
        for(int p=0;p<i;p++){
            for(int q=0;q<j;q++){
                b[q][p] = a[p][q];
            }
        }
        return b;
    }
    /**
     * matrix mutiplies vector 
     */
    public static double[] mult(double[][] a, double[] x){
        int i = a.length;
        int j = a[0].length;
        int k = x.length;
        if(j!=k){
            StdOut.println("Number of the matrix's row is not equal to length "
                                +"of the vector.");
            return null;
        }else{
            double[] c = new double[i];
             for(int p=0; p<i; p++){
                    for(int t=0; t<k; t++){
                        c[p] += a[p][t] * x[t];
                    }
             }
            return c;
        }
    }
    /**
     *vector mutiplies matrix 
     */
    public static double[] mult(double[] y, double[][] a){
        int k = y.length;
        int i = a.length;
        int j = a[0].length;
        double[] c = new double[k];
        for(int p=0; p<i; p++){
            for(int t=0; t<k; t++){
                c[p] += y[t] * a[t][p];
            }
        }
        return c;
    }
}