import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args){

  
    Scanner s = new Scanner(System.in);
  
    double pesetasEuro = 166.386;
  
    System.out.println("Introduces el valor que desea covertir");
  
    double valor = Double.parseDouble(s.nextLine());
  
    int resultadoEuros = (int)(valor / pesetasEuro);
  
    System.out.println("Resustado " + resultadoEuros);
  }
} 
