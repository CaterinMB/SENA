package AgenciaTelefonica;
import java.util.*;
import static AgenciaTelefonica.MAgencia.*;
import AgenciaTelefonica.CAgencia.*;
public class PAgencia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<CAgencia> Telefonos = new ArrayList<>();
        int opc;
        do {
            System.out.println("Opcion 1: Registrar cuenta telefonica. ");
            System.out.println("Opcion 2: Mostrar cuentas telefonicas ingresadas .");
            System.out.println("Opcion 3: Actualizar cuenta telefonica. ");
            System.out.println("Opcion 4: Eliminar cuenta telefonica. ");
            System.out.println("Opcion 0: Desea salir de la agencia telefonica. ");
            System.out.println("Escoja una opcion");
            opc = input.nextInt();
            switch (opc){
                case 1 -> Registro(Telefonos);
                case 2 -> Mostrar(Telefonos);
                case 3 -> Actualizar(Telefonos);
                case 4 -> Eliminar(Telefonos);
                default -> System.out.println("Digite una opcion no valida");
            }
        }while (opc != 0);
    }
}
