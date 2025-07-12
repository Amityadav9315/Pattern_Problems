package Pattern_;

public class Pattern5 {

    static  void pattern5(int n){

        for(int i=0; i<2*n-1; i++ ){
            for(int j=0; j<i; j++){

                System.out.print("* ");


            }

            System.out.println();
        }



    }

    public static void main(String[] args) {

         Pattern5 obj1=new Pattern5();
        obj1.pattern5(5);
    }
}
