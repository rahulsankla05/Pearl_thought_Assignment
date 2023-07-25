package Basic_DSA;

public class Pascal_Triangle {
    public static void main(String[] args) {
        pattern(3);
    }
    public static void pattern(int n){
        for(int row=0;row<n;row++){
            int val_print =1;
            for(int col=0; col<=row;col++){
                System.out.print(val_print + " ");
                val_print=val_print * (row-col)/(col+1);        // main logic of pascal triangle //
            }
            System.out.println();
        }
    }
}
