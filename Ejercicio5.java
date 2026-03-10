import java.util.*;

public class Ejercicio5 {
    public static void main (String[]args) throws Exception{

        Scanner sc= new Scanner (System.in);

        System.out.println("Digite la cantidad en pesos(COP):");
        double pesos = sc.nextDouble();

        System.out.println("Digite el valor de 1 usd en COP :  ");
        double tasadolar = sc.nextDouble();
        
        System.out.println("Digite el valor de 1 EUR en COP ");
        double tasaeuro = sc.nextDouble();

        double dolares = pesos/tasadolar;
        double euros = pesos / tasaeuro;

        System.out.printf("Resultado:% 2f USD y % 2f EUR ",dolares,euros);

        sc.close();
    }

    }


