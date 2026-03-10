import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Diseñe un algoritmo que convierta de grados centígrados a grados fahrenheit y viceversa
        double f,c,conversionF, conversionC;
        
        System.out.println("Digite los grados centígrados: ");
        c = sc.nextDouble();
        conversionF = (c * 1.8) + 32; 
        System.out.println(c + " grados centígrados a fahrenheit es: " + conversionF);
        
        System.out.println("Digite los grados fahrenheit: ");
        f = sc.nextDouble();
        conversionC = (f - 32) / 1.8;
        System.out.println(f + " grados fahrenheit a centígrados es: " + conversionC);
        
        sc.close();
    }
}