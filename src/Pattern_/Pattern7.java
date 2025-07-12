package Pattern_;

public class Pattern7 {

        public  static void pattern7(int n ){

            for(int i=0; i<n; i++){



                for(int k=0; k<i; k++) {
                    System.out.print(" ");

                }
                for(int k=0; k<2*(n-i)-1; k++){
                    System.out.print("*");
                }

                    System.out.println();






            }
        }



        public static void main(String[] args) {
            Pattern7 obj1=new Pattern7();
            obj1.pattern7(5);


        }
    }




