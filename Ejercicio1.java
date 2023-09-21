import java.util.Scanner;

public class Ejercicio1{
  public static void main(String[] agrs){
    double ventas [] = new double [2];
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese las ventas del mes");
    for(int i = 0; i<ventas.length;i++){
      System.out.println("Ventas" + (i+1));
      ventas [i]=sc.nextDouble();
    }
    int k = 0;
    int total = 0;
    System.out.println("Ventas mayores o iguales a 2000:");
    while (k<2){
      if (ventas[k]>= 2000){
        System.out.println("Dinero" + ventas[k]);
        total++;
    }
    k++;
   }
    System.out.println("El total mayor a 2000 es igual a  " + total);
}

}
