import java.util.Scanner;

public class Ejercicio5 {
 public static void main(String[] args){


  Scanner s = new Scanner(System.in);

  double pesetas = 166.386;
  

  System.out.println("Introduces el valor que desea covertir");
  
  double valor = s.nextDouble();
  
  int resultadoEuros = (int)(valor / pesetas);
  
  System.out.println("El resultado es :" + resultadoEuros);
  
 }
}
