package Pattern_;

public class Pattern6 {

    public  static void pattern6(int n ){

        for(int i=0; i<n; i++){

            for(int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();





            }
        }



    public static void main(String[] args) {

         Pattern6 obj1=new Pattern6();
         obj1.pattern6(5);


    }
}
