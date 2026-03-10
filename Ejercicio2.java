import java.util.*;

 public class Ejercicio2 {
    public static void main(String[] args) throws Exception{
Scanner sc = new Scanner (System.in);
// Diseñe un algoritmo que calcule el área de un círculo.area=PI* (r * r)       
  double r,area;// Variables
  System.out.println("Digite el radio del círculo");
 r = sc.nextDouble();//Entrada
area= 3.1416 * ( r * r);// Proceso 
System.out.println("El area del circulo es:" + area);//Salida
sc.close();


 }   
    
}
