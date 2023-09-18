package trabajojava;
import java.util.*;
public class Item3 {
    static double iva (double SubTotal){
        double iva = SubTotal * 0.19;
        return iva;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean con = true;
        while (con = true) {
            ArrayList<String> Compra = new ArrayList<>();
            double SubTotal =0;
            int x = 0;
            if (x <= 5){
                System.out.println("Ingrese nombre del producto: ");
                String Nombre = input.next();
                System.out.println("Ingrese cantidad del producto: ");
                int cant = input.nextInt();
                x += cant;
                String cand = String.valueOf(cant);
                System.out.println("Ingrese el valor del producto: ");
                int valor = input.nextInt();
                String val = String.valueOf(valor);
                Compra.add(Nombre);
                Compra.add(cand);
                Compra.add(val);
                double total = cant * valor;
                SubTotal += total;
            }else {
                System.out.println("No esta permitido el resgistro de mas productos.");
            }
            System.out.println("El SubTotal de la compra es: "+SubTotal);
            double iva = iva(SubTotal);
            System.out.println("El IVA de la compra es: "+iva);
            double Total = SubTotal + iva;
            if (Total >0 && Total <100000){
                System.out.println("El cliente no tiene derecho al descuento y debe pagar "+Total);
            }else if (Total >=100000 && Total <500000){
                double desc = Total * 0.20;
                System.out.println("El cliente tiene derecho a un descuento del 20% y debia pagar: "+ Total +" pero con el descuento debe pagar: "+(Total-desc));
            }else if (Total >=500000 && Total <1000001) {
                double desc = Total * 0.35;
                System.out.println("El cliente tiene derecho a un descuento del 35% y debia pagar: "+ Total +" pero con el descuento debe pagar: "+(Total-desc));
            }else {
                System.out.println("El monto es mayor a un millon, error, por favor comuniquese con el encargado de la tienda");
            }
            System.out.println("Dese ingresra otro cliente? ");
            String resp = input.next();
            String res = resp.toLowerCase();
            if ("si".equals(res)){
                con = true;
            }else if ("no".equals(res)){
                con = false;
            }else {
                System.out.println("Ingreso una opcion erronea. ");
            }
        }
    }
}