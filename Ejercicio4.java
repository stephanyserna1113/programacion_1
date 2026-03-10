import java.util.*;

public class Ejercicio4 {
    public static void main (String[]args)throws Exception {
        Scanner sc= new Scanner (System.in);
        /*
        4.diseñe un algoritmo para calcular el salario de un empleado.
        
        */

          System.out.println("Digite el salario bruto:");
          double salariobruto= sc.nextDouble();



          System.out.println("digite el total de las deducciones (EPS,etc.");
          double deducciones= sc.nextDouble();
          
          System.out.println("Digite el valor de las comisiones ");
          double comisión= sc.nextDouble();

          //calculo salario_neto (salario_bruto - deducciones + comisión
          double salarioneto= (salariobruto-deducciones+comisión);
          
          // resultado 

          System.out.println("El salario neto final es:"+ salarioneto);

          sc.close();
        

    }
    
}
