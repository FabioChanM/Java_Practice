import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] agrs){
      double numeros [] = new double[10];
      Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese los datos a evaluar");
    for (int i = 0; i<numeros.length;i++){
      System.out.println("Numeros" +(i+1));
      numeros [i] = sc.nextDouble();
    }
    double mayor = numeros[0];
for (int i = 1; i < numeros.length; i++) {
  if (numeros[i] > mayor) {
      mayor = numeros[i];
  }
}
System.out.println("El número mayor es: " + mayor);

sc.close();
}
 }
