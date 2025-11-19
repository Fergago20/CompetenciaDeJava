// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.List;
import java.util.ArrayList;

class Main {
   
   public static int sumArray(int[] arr){
       int suma = 0;
       
       for (int i=0; i <arr.length; i ++){
           suma = suma + arr[i];
       }
       return suma;
   }
    
    public static void main(String[] args) {
        
        int [] arreglo = {5,5,8,9,10};
        System.out.print(sumArray(arreglo));
    }
}