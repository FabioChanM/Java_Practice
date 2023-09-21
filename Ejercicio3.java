import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] agrs){
      double decuento1 = 4.5;
      double descuento2 = 4;
      double total = 0;

      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la cantidad de bolillos");
      int cantidad_bolillos = sc.nextInt();
      if (cantidad_bolillos >= 50 &&  cantidad_bolillos <= 99){
        total = cantidad_bolillos *decuento1;
      }
      else if (cantidad_bolillos >= 100 ){
        total = cantidad_bolillos* descuento2;
      }
      else{
        total = cantidad_bolillos * 5;
      }
      sc.close();
      System.out.println("El total a pagar es: " + total);
}
}
