public class Ejercicio5 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println("Lunes  Martes  Miercoles  Jueves  Viernes");
    System.out.println("-----------------------------------------");
    System.out.printf(rojo + "SINF" + "PRO     EED        EED     SINF");
    System.out.printf(rojo + "SINF" + "PRO     EED        EED     SINF");
    System.out.printf(rojo + "SINF" + "PRO     LM         EED     SINF");
    System.out.printf(verde + "FOL" + "BBDD    PROG       BBDD    LM");
    System.out.printf(verde + "FOL" + "BBDD    PROG       BBDD    LM");
    System.out.printf(verde + "FOL" +  "BBDD    PROG       BBDD    LM");
  }
}
