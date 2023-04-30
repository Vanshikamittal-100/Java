// strings - non-primiive type

import java.util.*;
import java.util.logging.StreamHandler;

public class Strings{
    public static void main(String args[]) {
        //Scanner sc=new Scanner(System.in);
        //String name=sc.nextLine();
        //System.out.println("your name is : "+ name );

        //reverse a string

        /*System.out.println("enetr the string ");
        String str=sc.nextLine();
        String nstr=" ";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("reversed word is: "+nstr);*/


        //reverse a string using string builder


        String input="hello for geeks";
        StringBuilder input1=new StringBuilder( );

        input1.append(input);
        input1.reverse();
        System.out.println(input1);


        
    }
}