package Pattern_;

public class Pattern5 {

    static  void pattern5(int n){

        for(int i=0; i<2*n; i++ ){
            int c=i>n ? 2*n-i : i;
            for(int j=0; j<c; j++){

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
