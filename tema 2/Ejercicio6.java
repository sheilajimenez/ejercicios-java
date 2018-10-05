public class Ejercicio6 {
  public static void main(String[] args){

    int baseImponible;
    int totalFactura;
    int iva;
    int total;
    
    totalFactura = 150;
    iva = 21;
    baseImponible = (150 * 21)/100 ;
    total = baseImponible - totalFactura;
    
    System.out.println("El total de la factura sin IVA es: " + total + " euros");
  }
 } 
