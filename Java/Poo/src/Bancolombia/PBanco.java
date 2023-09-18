package Bancolombia;
import java.util.Scanner;
import static Bancolombia.MBanco.*;
import Bancolombia.CBanco.*;
import java.util.ArrayList;
public class PBanco {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<CBanco> Cuentas = new ArrayList<>();
        int opc;
        do {
            System.out.println("Opcion 1: Registrar cuenta. ");
            System.out.println("Opcion 2: Mostrar cuentas ingresadas .");
            System.out.println("Opcion 3: Transferir dinero. ");
            System.out.println("Opcion 4: Actualizar cuenta. ");
            System.out.println("Opcion 5: Eliminar cuenta. ");
            System.out.println("Opcion 0: Desea salir del programa. ");
            System.out.println("Escoja una opcion");
            opc = input.nextInt();
            switch (opc){
                case 1 -> Registro(Cuentas);
                case 2 -> Mostrar(Cuentas);
                case 3 -> Transferir(Cuentas);
                case 4 -> Actualizar(Cuentas);
                case 5 -> Eliminar(Cuentas);
                default -> System.out.println("Digite una opcion no valida");
            }
        }while (opc != 0);
    }
}