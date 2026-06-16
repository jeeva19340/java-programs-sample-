// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
       Scanner scanner = new Scanner(System.in);
       String sentence = scanner.nextLine();
       char letter = scanner.nextLine().charAt(0);
       int count=0;
       for(int i=0;i< sentence.length();i++){
           if(sentence.charAt(i) == letter){
               count++;
           }
       }
       System.out.println("Found" +count+"times");
       
    }
}
     
        
        
