package Basic_DSA;

public class Main {
    public static void main(String[] args) {
        boolean male = false;
        int age = 30;
        if( male )
            if( age < 20 )
                System.out.println("Boy");
            else
                System.out.println("Man");

        else
        if( age < 20 )
            System.out.println("Girl");
        else
            System.out.println("Woman");
// output : Woman  coz male was false initially //

//        System.out.println(1+1+1+1+1 == 5);
    }
}