public  class Ejercicio1 {
  public static void main(String[] args){

  System.out.println("Porfavor escriba el día de la semana que desee y le dire la arignatura que le toca");
  
   String dia;
   
  dia = (System.console().readLine());
  
  dia.toLowerCase();
  
  switch(dia) {
    case "lunes":
      System.out.println("sistemas informaticos");
      break;
    case "martes":
      System.out.println("Programación");
      break;
    case "miércoles":
      System.out.println("Entorno de desarrollo");
      break;
    case "jueves":
      System.out.println("Base de datos");
      break;
    case "viernes":
      System.out.println("Lenguaje de marcas");
      break;
    default:
   }
  }
}
