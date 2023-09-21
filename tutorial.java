import java.util.ArrayList;
import java.util.List;

public class tutorial{
  public static void main(String[] agrs){

    System.out.println("Hola java 2");

    String mystring = "eSTO ES UNA CADENA DE TEXTO";
    mystring = "Aqui cambio el valor de esto";
    System.out.println(mystring);


    Integer myint = 7;
    myint = myint + 5;
    System.out.println(myint);

    double mydouble = 4.565;
    System.out.println(mydouble);

    Float myFloat = 6.5f;
    System.out.println(myFloat + Double.valueOf(myint));

    Boolean myBoolena = true;
    myBoolena = false;
   System.out.println(myBoolena);

   myBoolena = null;
   if (myBoolena != null){
    System.out.println(myBoolena);
    System.out.println("My float no es distinto");
   }
   else{
    System.out.println("My float es distinto de null");
   }

    List<String> mylist = new ArrayList();
  mylist.add(mystring);
  mylist.add(myint.toString(myint));

  System.out.println(mylist);

  for (int i = 0; i < mylist.size(); i++){
    System.out.println(mylist.get(i));
  }

    tutorial myMian = new tutorial();

    myMian.myfunnciont(0, 0);


    int x = 20;
    int y = 52;
     int nuevo =  Math.max(x,y);
    System.out.println(nuevo);






  }


  public void  myfunnciont (int myfirts, int mysecond ){

    System.out.println(myfirts + mysecond);


  }


}