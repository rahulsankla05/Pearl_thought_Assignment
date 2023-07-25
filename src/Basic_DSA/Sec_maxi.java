package Basic_DSA;

public class Sec_maxi {
    public static void main(String[] args) {
        int[] ans ={2,1,2,3,6};
        System.out.println("Second Maximum Element " + solve(ans));
    }
    public static int solve(int[] A){
        int idx = 0;  // to get the index of biggest number//
        for(int i=1;i<A.length;i++){
            if(A[i]>A[idx]){
                idx=i;   // idx of biggest element present in Array A//
            }
        }

        int sec_maxi =-1;
        for(int i=0;i<A.length;i++){
            if(A[i]!=A[idx]){
                sec_maxi = Math.max(sec_maxi,A[i]);
            }
        }return sec_maxi;
    }
}
