// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A WORD TO CONVERT");
        String sentence = scanner.nextLine();
        String uppercase = sentence.toUpperCase();
        String lowercase = sentence.toLowerCase();
        System.out.println("The uppercase word is "+uppercase);
        System.out.println("The lowercase word is " + lowercase);
    }
}
     
        
        
