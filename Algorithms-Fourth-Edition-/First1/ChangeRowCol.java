import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
/**
 * 1.1.13
 */
public class ChangeRowCol{
    public static void main(String[] args){
        int r = 5, c = 6;//row, column
        int[][] a = new int[r][c];
        int[][] b = new int[c][r];
        a = MatrixInitial(r, c);
        printMatrix(a);
        b = changeRowCol(a);
        printMatrix(b);
    }
    public static void printMatrix(int[][] a){
        int i = a.length;
        int j  =a[0].length;
        for(int p=0;p<i;p++){
            for(int q=0;q<j;q++){
                StdOut.print(a[p][q]+"\t");
            }
            StdOut.println();
            
        }
        StdOut.println("-----------------------------------");
    }
    public static int[][] MatrixInitial(int r, int c){
        int[][] matrix = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = StdRandom.uniform(0,100);
            }
        }
        return matrix;
    }
    public static int[][] changeRowCol(int[][] a){
        int i = a.length;
        int j  =a[0].length;
        int[][] b =new int[i][j];
        for(int p=0;p<i;p++){
            for(int q=0;q<j;q++){
                b[q][p] = a[p][q];
            }
        }
        return b;
    }
}