package recuperacion;
import java.util.*;
import recuperacion.GetSetR.*;
public class MetodosR {
    public static void Registro(ArrayList<GetSetR> celulares){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese marca del celular: ");
        String nom = input.next();
        String marca = nom.toLowerCase();
        System.out.println("Ingrese modelo del celular: ");
        double modelo = input.nextDouble();
        System.out.println("Ingrese color del celular: ");
        String clr = input.next();
        String color = clr.toLowerCase();
        System.out.println("Ingrese referncia del celular: ");
        String ref = input.next();
        String referencia = ref.toLowerCase();
        System.out.println("Ingrese precio del producto: ");
        double precio = input.nextDouble();            
        GetSetR Producto = new GetSetR(marca, modelo, color, referencia, precio);
        celulares.add(Producto);
        String Muestra = Producto.toString();
        System.out.println(Muestra);
    }
    
    public static void Mostrar(ArrayList<GetSetR> celulares){
        if (celulares.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            for (int num = 0; num < celulares.size(); num++){
                String Muestra = celulares.get(num).toString();
                System.out.println("Producto TV No. "+(num+1)+"\n"+Muestra);
            }
        }
    }
    
    public static void ActualizarTV(ArrayList<GetSetR> celulares){
        Scanner input = new Scanner(System.in);
        if (celulares.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            System.out.println("Ingrese nombre del producto que desea modificar");
            String nmb = input.next();
            String nom = nmb.toLowerCase();
            System.out.println("Ingrese precio del producto que desea modificar");
            int pre = input.nextInt();
            for (int cont = 0; cont < celulares.size(); cont++){
                if (celulares.get(cont).getMarca()== nom) {
                    System.out.println("Que desea Actualizar?");
                    System.out.println("1. Marca\n2. Color\n3. Precio\n4. Referencia\n5. Modelo");
                    System.out.println("Escoja una opcion");
                    int opc = input.nextInt();
                    switch (opc){
                        case 1 -> {
                            System.out.println("Ingrese nombre nuevo");
                            String nomb = input.next();
                            String nombre = nomb.toLowerCase();
                            celulares.get(cont).setMarca(nombre);
                        }
                        case 2 -> {
                            System.out.println("Ingrese color nuevo");
                            String col = input.next();
                            String color = col.toLowerCase();
                            celulares.get(cont).setColor(color);
                        }
                        case 3 -> {
                            System.out.println("Ingrese precio nuevo");
                            int precio = input.nextInt();
                            TVSmart.get(cont).setPrecio(precio);
                        }
                        case 4 -> {
                            System.out.println("Ingrese peso nuevo");
                            int peso = input.nextInt();
                            TVSmart.get(cont).setPeso(peso);
                        }
                        case 5 -> {
                            System.out.println("Ingrese Kilowatts nuevo");
                            int kilowatts = input.nextInt();
                            TVSmart.get(cont).setKilowatts(kilowatts);
                        }
                        default -> System.out.println("Ingreso una opcion no valida");
                    }
                }else if (TVSmart.get(cont).getPrecio()== pre){
                    System.out.println("Que desea Actualizar?");
                    System.out.println("1. Nombre\n2. Color\n3. Precio\n4. Peso\n5. Kilowatts");
                    System.out.println("Escoja una opcion");
                    int opc = input.nextInt();
                    switch (opc){
                        case 1 -> {
                            System.out.println("Ingrese nombre nuevo");
                            String nomb = input.next();
                            String nombre = nomb.toLowerCase();
                            TVSmart.get(cont).setNombrep(nombre);
                        }
                        case 2 -> {
                            System.out.println("Ingrese color nuevo");
                            String col = input.next();
                            String color = col.toLowerCase();
                            TVSmart.get(cont).setColor(color);
                        }
                        case 3 -> {
                            System.out.println("Ingrese precio nuevo");
                            int precio = input.nextInt();
                            TVSmart.get(cont).setPrecio(precio);
                        }
                        case 4 -> {
                            System.out.println("Ingrese peso nuevo");
                            int peso = input.nextInt();
                            TVSmart.get(cont).setPeso(peso);
                        }
                        case 5 -> {
                            System.out.println("Ingrese Kilowatts nuevo");
                            int kilowatts = input.nextInt();
                            TVSmart.get(cont).setKilowatts(kilowatts);
                        }
                        default -> System.out.println("Ingreso una opcion no valida");
                    }
                }else {System.out.println("No se encontro el producto");}
            }
        }
    }
}
