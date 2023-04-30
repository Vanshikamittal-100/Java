import java.util.*;
public class Bits{
    public static void main(String[] args) {


        // get bit

        /*int n=5;
        int pos=3;
        int bitMask=1<<pos;
        
        if((bitMask & n)==0){
            System.out.println("bit was zero");
        
            
        }
        else{
            System.out.println("bit was one");
        }*/
        
        // set bits

        /*int n=5;
        int pos=1;
        int bitMask=1<<pos;

        int number= bitMask | n;
        System.out.println(number);*/

        //clear bit

        /*int n=5;
        int pos=2;
        int bitMask=1<<pos;
        int notBitMask=~(bitMask);
        int number=notBitMask & n;
        System.out.println(number);*/

        //update bit

        int n=5;
        int pos=1;
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int bitMask=1<<pos;

        if(oper==1){
            //set bit
            int number=bitMask|n;
            System.out.println(number);

        }
        else{
            //clear
            int notBitMask=~(bitMask);
            int newnumber=notBitMask & n;
            System.out.println(newnumber);
            
        }



    
    }

}