//array input and output

import java.util.*;

public class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];

        //input numbefrs in araray
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }

        //search x
        System.out.println("enetr the value of x");

        int x=sc.nextInt();
        
        //output

        for(int i=0;i<size;i++){
            if(numbers[i]==x){
                System.out.println("x found at : "+i);
            }
            
        }
    }
}