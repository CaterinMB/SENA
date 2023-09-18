package GetSet;
import java.util.*;
import GetSet.Frutas.*;
public class MFruta {
    public static void registroFruta (int opc){
        Scanner input = new Scanner(System.in);
        switch (opc){
            case 1 -> {
                Frutas Manzana = new Frutas();
                Manzana.setNombre("Manzana");
                System.out.println("Cual es escoge 1. Comprar o 2. Vender: ");
                int ops = input.nextInt();
                switch (ops) {
                    case 1 -> {
                            System.out.println("Cual es la cantidad que desa comprar? ");
                            int cant = input.nextInt();
                            Manzana.setTotal(Manzana.getPrecioC() * cant);
                            System.out.println("La fruta es "+Manzana.getNombre()+".");
                            System.out.println("La compra es de un total de "+Manzana.getTotal());
                        }
                    case 2 -> {
                            System.out.println("Cual es la cantidad que desa vender? ");
                            int cant = input.nextInt();
                            Manzana.setTotal(Manzana.getPreciosV() * cant);
                            System.out.println("La fruta es "+Manzana.getNombre()+".");
                            System.out.println("La venta es de un total de "+Manzana.getTotal());
                        }
                    default -> System.out.println("Digito una opcion no valida");
                }
            }
            case 2 -> {
            }
        }
    }
}
