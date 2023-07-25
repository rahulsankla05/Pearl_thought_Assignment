package Basic_DSA;

public class Equilibrium_index {
    public static void main(String[] args) {
        int[] A={-7,1,5,2,-4,3,0};
        int n =A.length;
//        System.out.println(eqm(A,p));

        int count=0;
        for(int i=0;i<n;i++){
            int left=0;
            for(int k=0;k<i;k++){
                left+=A[i];
            }
            int ryt =0;
            for(int k=i+1;k<n;k++){
                ryt+=A[i];
            }
            if(left == ryt){
                System.out.print(" " + i + " ");
                count++ ;
            }
        }
        System.out.println("Number of equilibrium index(s): " + count);
    }
}
