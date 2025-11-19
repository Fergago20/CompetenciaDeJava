// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.ArrayList;

class Main {
   
   public static int sumatoria(int [] arreglo){
       int suma = 0;
       
       for (int i=0; i <arreglo.length; i ++){
           suma = suma + arreglo[i];
       }
       return suma;
   }
    
    public static void main(String[] args) {
        
        int [] arreglo = {5,5,8,9,10};
        System.out.print(sumatoria(arreglo));
    }
}