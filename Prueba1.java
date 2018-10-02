public class Prueba1{
  public static void main(String[] args){

   int a;
   int b;
   
   Scanner s = new Scanner(System.in);
   
   System.out.println("Introduces dos numero y te dire si el primero es mayor o igual que el segundo, dale a enter para comenzar");
   
   System.out.println("Introduces el primer numero");
   a = Integer.parseInt(s.nextLine()); 
   System.out.println("Introduces segundo numero");
   b = Integer.parseInt(s.nextLine()); 
  
   int m = a * b;
   
   System.out.println("Resultados: "  );
  }
  
}
