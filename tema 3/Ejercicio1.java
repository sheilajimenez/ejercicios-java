import java.util.Scanner;

public class Ejercicio1{
  public static void main(String[] args){
   int numero1;
   int numero2;
   
   Scanner s = new Scanner(System.in);
   
   System.out.println("Introduces primer numero");
   numero1 = Integer.parseInt(s.nextLine()); 
   System.out.println("Introduces segundo numero");
   numero2 = Integer.parseInt(s.nextLine()); 
  
   int m = numero1 * numero2;
   
   System.out.println("Resultados: " + m );
  }
  
}
