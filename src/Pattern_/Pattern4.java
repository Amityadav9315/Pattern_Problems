package Pattern_;

public class Pattern4 {

    static void pattern4( int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;  j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }



    }

    public static void main(String[] args) {

        Pattern4  obj1=new Pattern4();
        obj1.pattern4(5);

    }
}
