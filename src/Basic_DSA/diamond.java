package Basic_DSA;// Diamond Pattern in Java
// Thanks RS for this simple and Amazing Code//

public class diamond {
        public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        int star =1 ,space =n/2;     // it's observed in 1st row: space is n/2 and  star=1  //
        for(int row=1;row<=n;row++){
//        while(row<=n){
//            int spc=1;
//            while(spc<=space){

            for(int spc=1;spc <=space;spc++){
                System.out.print(" ");
//                spc++ ;
            }

//            int str=1;
//            while(str<=star){
            for(int str=1;str <= star;str++){
                System.out.print("*");
//                str++;
            }
// Mirror Image below & above the n/2 th row so the main logic is: //
            if(row<=n/2){
                star+=2;
                space-=1;
            }else{
                star-=2;
                space+=1;
            }
//            row++;     // use with while loop
            System.out.println();
        }
    }
}
