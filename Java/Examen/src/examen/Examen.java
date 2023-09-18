package examen;
import static examen.Metodos.*;
import examen.GetSet.*;
import java.util.*;
public class Examen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<GetSet> TVSmart = new ArrayList<>();
        ArrayList<GetSet> ESonido = new ArrayList<>();
        ArrayList<GetSet> VentaTV = new ArrayList<>();
        ArrayList<GetSet> VentaES = new ArrayList<>();
        int opc;
        do {
            System.out.println("1. Resgistrar un electrodomestico");
            System.out.println("2. Mostrar electrodomesticos registrados");
            System.out.println("3. Modificar un electrodomesticos");
            System.out.println("4. Eliminar un electrodomestico");
            System.out.println("5. Vender electrodomesticos");
            System.out.println("6. Mostrar total en ventas");
            System.out.println("7. Salir del programa");
            System.out.println("Ingrese la opcion deseada: ");
            opc = input.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.println("1. Ingresar tv");
                    System.out.println("2. Ingresar equipo de sonido");
                    System.out.println("Ingrese la opcion deseada: ");
                    opc = input.nextInt();
                    switch (opc){
                        case 1 -> RegistroTV(TVSmart);
                        case 2 -> RegistroES(ESonido);
                        default -> System.out.println("Digite una opcion no valida");
                    }
                }
                case 2 -> Mostrar(TVSmart, ESonido);
                case 3 -> {
                    System.out.println("1. Modificar un tv");
                    System.out.println("2. Modificar un equipo de sonido");
                    System.out.println("Ingrese la opcion deseada: ");
                    opc = input.nextInt();
                    switch (opc){
                        case 1 -> ActualizarTV(TVSmart);
                        case 2 -> ActualizarES(ESonido);
                        default -> System.out.println("Digite una opcion no valida");
                    }
                }
                case 4 -> {
                    System.out.println("1. Eliminar un tv");
                    System.out.println("2. Eliminar un equipo de sonido");
                    System.out.println("Ingrese la opcion deseada: ");
                    opc = input.nextInt();
                    switch (opc){
                        case 1 -> EliminarTV(TVSmart);
                        case 2 -> EliminarES(ESonido);
                        default -> System.out.println("Digite una opcion no valida");
                    }
                }
                case 5 -> {
                    System.out.println("1. Vender un tv");
                    System.out.println("2. Vender un equipo de sonido");
                    System.out.println("Ingrese la opcion deseada: ");
                    opc = input.nextInt();
                    switch (opc){
                        case 1 -> VenderTV(TVSmart, VentaTV);
                        case 2 -> VenderES(ESonido, VentaES);
                        default -> System.out.println("Digite una opcion no valida");
                    }
                }
                case 6 -> Vender(VentaTV, VentaES);
                default -> System.out.println("Digite una opcion no valida");
            }
        }while (opc != 7);
    }
}