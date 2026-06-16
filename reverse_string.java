import java.io.*;
import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A SENTENCE TO REVERSE:");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            sb.append(words[i]);
            if(i > 0){
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());
        scanner.close();
    }
}
        
        
