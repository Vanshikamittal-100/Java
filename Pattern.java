public class Pattern{
    public static void main(String[] args) {
        /*int n=4;
        int m=5;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=m;j++){
            System.out.print("*");
           }
           System.out.println();
        }*/



        /*int n=4;
        int m=5;
        for(int i=1;i<=n;i++)
        {
           for(int j=1;j<=m;j++){
            if(i==1 || i==n || j==1 ||j==m){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
        }*/


        /*int n=4;
        int m=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++){
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }*/


        int n=4;
        int m=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(j<=5-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    



    }
}