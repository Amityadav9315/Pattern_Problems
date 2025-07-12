package Pattern_;

public class Pattern3 {

    static void pattern3( int n){

        for(int i=5; i>0; i--){
            for(int j=0; j<i;  j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {

        Pattern3  obj1=new Pattern3();
        obj1.pattern3(5);

    }
}
