package Pattern_;

public class Pattern2 {

    static void pattern2( int n){

        for(int i=0; i<=n; i++){
            for(int j=0; j<i;  j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {

        Pattern2  obj1=new Pattern2();
        obj1.pattern2(5);

    }
}
