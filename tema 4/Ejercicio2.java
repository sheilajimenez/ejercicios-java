public  class Ejercicio2 {
  public static void main(String[] args){

  System.out.println("Porfavor introduzca una hora del dia entre (5 - 21 h):");
    int hora = Integer.parseInt(System.console().readLine());
  
     if ((hora>=6)&&(hora<=12)){
      System.out.println("¡Buenos dias!");
    } else if ((hora>=13 )&&(hora<=20)) {
      System.out.println("¡Buenas tardes!");
    } else if ((hora>=21)&&(hora<=5)) {
      System.out.println("¡Buenas noches!");
    }
  }
 }

