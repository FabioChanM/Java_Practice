import java.util.Scanner;

public class Ejercicio5 {
  public static void main (String[]aStrings){
    int numeros = 0;
    int suma = 0;
    Scanner scan = new Scanner(System.in);
    do {
     System.out.println("Igrese los numeros : ");
     numeros = scan.nextInt();
     suma = suma + numeros;


    }while(numeros!=0);
  }



}
