import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ThreeEquals{
    public static void main(String[] args){
        double[] a = new double[3];
        for(int i=0;i<3;i++){
            a[i] = StdIn.readDouble();
        }
    }
  /*  
   * //try to use  iteration,but failed,sigh.
   public boolean Compare(int[] a){
        int i = 0, j = 1;
        if(a[i]==a[j])
            return Compar
        
    
    }
    public boolean Contrast(int a[i], a[j]){
        
        if(a[i]==a[j])
            return Contrast(a[++i], a[++j]);
    }*/
  
    
//        for(int j=1;j<3;j++){
//            if(a[0]==a[j])
//                
//            StdOut.printf("not equal");
//            return;
//            
//            if(a[0]==a[1]){
//            if(a[1]==a[2]){
//                StdOut.printf("equal");
//                return;
//            }            
//        }
//        StdOut.printf("not equal");
//        return;
}