import java.util.Scanner;

public class Ejercicio11{
  public static void main(String[] args){

  
    Scanner s = new Scanner(System.in);
  
    double equivalencia = 1024;
  
    System.out.println("Introduces el valor que desea covertir");
  
    double valor = Double.parseDouble(s.nextLine());
  
    double kb = (double)(valor / equivalencia);
  
 
  System.out.println("Resustado :" + kb);
  
  
 }
}
