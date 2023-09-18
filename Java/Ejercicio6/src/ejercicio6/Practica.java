package ejercicio6;
import java.util.*;
public class Practica {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dividendo: ");
        String num1 = input.next();
        System.out.println("Digite divisor: ");
        String num2 = input.next();
        try {
            double dividendo = Double.parseDouble(num1);
            double divisor = Double.parseDouble(num2);
            double resultado = dividendo / divisor;
            System.out.println("El resultado es "+resultado);
        } catch (ArithmeticException err){
            System.out.println("NO se puede dividir con un divisor en 0. "+err.getMessage());
        } catch (NullPointerException err){
            System.out.println("Debe ingresar un valor. "+err.getMessage());
        } catch (NumberFormatException err){
            System.out.println("Debe ingresar numeros. "+err.getMessage());
        } finally {
            System.out.println("Gracias por usar nuestros servicios. ");
        }
    }
}
