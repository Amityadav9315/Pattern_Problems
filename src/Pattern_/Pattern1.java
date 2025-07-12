package Pattern_;

public class Pattern1 {

    static void pattern1( int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n;  j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {

          Pattern1  obj1=new Pattern1();
          obj1.pattern1(5);

    }
}
