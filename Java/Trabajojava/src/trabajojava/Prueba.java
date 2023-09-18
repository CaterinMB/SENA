package trabajojava;
import java.util.ArrayList;
import java.util.Scanner;
public class Prueba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<String>> arrayCompras = new ArrayList<>();
        
        for(int i = 0; i<5; i++){
            ArrayList<String> infoProducto = new ArrayList<>();
            System.out.println("Ingrese el nombre del producto: ");
            String nombreProducto = input.next();
            System.out.println("Ingrese la cantidad del producto: ");
            int cantidadProducto = input.nextInt();
            System.out.println("Ingrese el valor del producto: ");
            Float valorUnitario = input.nextFloat();
            Float subtotalProducto = cantidadProducto*valorUnitario;
            float iva = (float)(subtotalProducto * 0.19);
            float subtotalProductoConIva = (float) (subtotalProducto + iva);
            float descuentoAplicadoSubTotal =0;
            if(subtotalProductoConIva >= 0 && subtotalProductoConIva < 100000){
                descuentoAplicadoSubTotal = subtotalProductoConIva;
            }else if(subtotalProductoConIva >= 100000 && subtotalProductoConIva < 500000){
                    descuentoAplicadoSubTotal = (int)(subtotalProductoConIva - (subtotalProductoConIva * 0.2));
            }else if(subtotalProductoConIva >= 500000 && subtotalProductoConIva <=1000000){
                    descuentoAplicadoSubTotal = (int)(subtotalProductoConIva - (subtotalProductoConIva * 0.35));
            }
            infoProducto.add(nombreProducto);
            infoProducto.add(String.valueOf(cantidadProducto));
            infoProducto.add(String.valueOf(valorUnitario));
            infoProducto.add(String.valueOf(subtotalProducto));
            infoProducto.add(String.valueOf(subtotalProductoConIva));
            infoProducto.add(String.valueOf(descuentoAplicadoSubTotal));

            arrayCompras.add(infoProducto);
        }

        System.out.println(arrayCompras);

        input.close();
    }
}