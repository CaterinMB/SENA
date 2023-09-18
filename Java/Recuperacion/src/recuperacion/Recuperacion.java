package recuperacion;
import java.util.*;
import static recuperacion.MetodosR.*;
import recuperacion.GetSetR.*;
public class Recuperacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<GetSetR> celulares = new ArrayList<>();
        ArrayList<GetSetR> Ventas = new ArrayList<>();
        int opc;
        do {
            System.out.println("1. Registrar celular");
            System.out.println("2. Mostrar celulares registrados");
            System.out.println("3. Modificar un celular");
            System.out.println("4. Eliminar un celular");
            System.out.println("5. Vender celulares");
            System.out.println("6. Llamar a un usuario");
            System.out.println("7. Salir del programa");
            System.out.println("Ingrese la opcion deseada: ");
            opc = input.nextInt();
            switch (opc){
                case 1 -> Registro(celulares);
                case 2 -> Mostrar(celulares);
                case 3 -> Actualizar(celulares);
                case 4 -> Eliminar(celulares);
                case 5 -> Venter(celulares);
                case 6 -> Vender(VentaTV, VentaES);
                default -> System.out.println("Digite una opcion no valida");
            }
        }while (opc != 7);
    
}
