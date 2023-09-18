package poo;
import java.util.*;
public class Frutas {
    String Nombre;
    Integer precioc;
    Integer preciov;
    Integer total;
    String Estado;
    
    static void registroFruta (int opc){
        Scanner input = new Scanner(System.in);
        switch (opc) {
            case 1 -> {
                Frutas Manzana = new Frutas();
                Manzana.Nombre = "Manzana";
                System.out.println("Cual es el estado de la fruta: ");
                Manzana.Estado = input.nextLine();
                System.out.println("1. Comprar o 2. Vender");
                int ops = input.nextInt();
                switch (ops) {
                    case 1 -> {
                            System.out.println("Cual es el precio de compra de la fruta: ");
                            Manzana.precioc = input.nextInt();
                            System.out.println("Cual es la cantidad que desa comprar? ");
                            int cant = input.nextInt();
                            Manzana.total = Manzana.precioc * cant;
                            System.out.println("La fruta es "+Manzana.Nombre+" y su estado es "+Manzana.Estado);
                            Manzana.compra(Manzana.total);
                        }
                    case 2 -> {
                            System.out.println("Cual es el precio de venta de la fruta: ");
                            Manzana.preciov = input.nextInt();
                            System.out.println("Cual es la cantidad que desa comprar? ");
                            int cant = input.nextInt();
                            Manzana.total = Manzana.preciov * cant;
                            System.out.println("La fruta es "+Manzana.Nombre+" y su estado es "+Manzana.Estado);
                            Manzana.venta(Manzana.total);
                        }
                    default -> System.out.println("Digito una opcion no valida");
                }
            }
            case 2 -> {
                Frutas Cereza = new Frutas();
                Cereza.Nombre = "Cereza";
                System.out.println("Cual es el estado de la fruta: ");
                Cereza.Estado = input.nextLine();
                System.out.println("1. Comprar o 2. Vender");
                int ops = input.nextInt();
                switch (ops) {
                    case 1 -> {
                            System.out.println("Cual es el precio de compra de la fruta: ");
                            Cereza.precioc = input.nextInt();
                            System.out.println("Cual es la cantidad que desa comprar? ");
                            int cant = input.nextInt();
                            Cereza.total = Cereza.precioc * cant;
                            System.out.println("La fruta es "+Cereza.Nombre+" y su estado es "+Cereza.Estado);
                            Cereza.compra(Cereza.total);
                        }
                    case 2 -> {
                            System.out.println("Cual es el precio de venta de la fruta: ");
                            Cereza.preciov = input.nextInt();
                            System.out.println("Cual es la cantidad que desa comprar? ");
                            int cant = input.nextInt();
                            Cereza.total = Cereza.preciov * cant;
                            System.out.println("La fruta es "+Cereza.Nombre+" y su estado es "+Cereza.Estado);
                            Cereza.venta(Cereza.total);
                        }
                    default -> System.out.println("Digito una opcion no valida");
                }
            }
            case 3 -> {
                Frutas Fresa = new Frutas();
                Fresa.Nombre = "Fresa";
                System.out.println("Cual es el estado de la fruta: ");
                Fresa.Estado = input.nextLine();
                System.out.println("1. Comprar o 2. Vender");
                int ops = input.nextInt();
                switch (ops) {
                    case 1 -> {
                            System.out.println("Cual es el precio de compra de la fruta: ");
                            Fresa.precioc = input.nextInt();
                            System.out.println("Cual es la cantidad que desa comprar? ");
                            int cant = input.nextInt();
                            Fresa.total = Fresa.precioc * cant;
                            System.out.println("La fruta es "+Fresa.Nombre+" y su estado es "+Fresa.Estado);
                            Fresa.compra(Fresa.total);
                        }
                    case 2 -> {
                            System.out.println("Cual es el precio de venta de la fruta: ");
                            Fresa.preciov = input.nextInt();
                            System.out.println("Cual es la cantidad que desa comprar? ");
                            int cant = input.nextInt();
                            Fresa.total = Fresa.preciov * cant;
                            System.out.println("La fruta es "+Fresa.Nombre+" y su estado es "+Fresa.Estado);
                            Fresa.venta(Fresa.total);
                        }
                    default -> System.out.println("Digito una opcion no valida");
                }
            }
            default -> System.out.println("Ingreso una opcion no valida");
        }
    }
    
    public void compra (Object frut){
        System.out.println("Gracias por la compra. El total a pagar es: "+frut);
    }
    public void venta (Object fruts){
        System.out.println("Gracias por la venta. El total a pagar es: "+fruts);
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sistema de Compras de Frutas");
        System.out.println("Cual fruta desea Comprar: 1.Manzana o 2.Cereza o 3.Fresa");
        int opc = input.nextInt();
        registroFruta(opc);
    }
}
