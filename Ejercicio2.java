// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Main {
   
   public static int countVowels(String text){
       
       int largo = text.length();
       
       int contador =0;
       for (int i = 0; i < largo; i++){
           char c = text.charAt(i);
           if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
           }
       }
       return contador;
       
   }
    
    public static void main(String[] args) {
        
        int contador = countVowels("Fernando");
        System.out.print(contador);
    }
}