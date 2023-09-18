
package ejercicio2;
import java.util.Scanner;
import java.util.Date;
public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int suma;
        int opc;
        do{
            System.out.println("Opcion 0: Para salir");
            System.out.println("Opcion 1: Para sumar 2 numeros");
            System.out.println("Opcion 2: Para el area de un triangulo");
            System.out.println("Opcion 3: Para mostrar un mensaje motivacional");
            System.out.println("Opcion 4: Para mostrar la fecha y hora actual");
            System.out.println("Escoge una opcion: ");
            opc = input.nextInt();
            switch (opc){
                case 0 -> {
                    System.out.println("Adios");
                    break;
                }
                case 1 -> {
                    System.out.println("Ingrese numero 1:");
                    int num = input.nextInt();
                    System.out.println("Ingrese numero 2:");
                    int num2 = input.nextInt();
                    suma = num + num2;
                    System.out.println("El resultado es: " + suma);
                    continue;
                }
                case 2 -> {
                    System.out.println("Ingrese area del triangulo:");
                    int h = input.nextInt();
                    System.out.println("Ingrese base del triangulo:");
                    int b = input.nextInt();
                    suma = (h + b) / 2;
                    System.out.println("El resultado es: " + suma);
                    continue;
                }
                case 3 -> {
                    System.out.println("Vamos bien, ya falta poco para salir.");
                    continue;
                }
                case 4 -> {
                    System.out.println("La hora y fecha son: " + new Date());
                    continue;
                }
                default -> {
                    System.out.println("Digite una opcion valida");
                    continue;
                }
            }
        }while (true);
    }
}
