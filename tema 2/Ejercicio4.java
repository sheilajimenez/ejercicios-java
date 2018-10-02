import java.util.Scanner;

public class Ejercicio4 {
 public static void main(String[] args){


  Scanner s = new Scanner(System.in);

  double pesetas = 166.386;
  

  System.out.println("Introduces el valor que desea covertir");
  
  double valor = s.nextDouble();
  
  int resultadoPtas = (int)(valor * pesetas);
  
 }
}
