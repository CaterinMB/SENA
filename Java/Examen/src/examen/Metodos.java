package examen;
import java.util.*;
import examen.GetSet.*;
public class Metodos {
    public static void RegistroTV(ArrayList<GetSet> TVSmart){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto: ");
        String nom = input.next();
        String nombre = nom.toLowerCase();
        System.out.println("Ingrese precio del producto: ");
        double precio = input.nextDouble();
        System.out.println("Ingrese color del producto ");
        String clr = input.next();
        String color = clr.toLowerCase();
        System.out.println("Ingrese consumo del producto (Kilowatts): ");
        int kW = input.nextInt();
        System.out.println("Ingrese peso del producto (Kg): ");
        double peso = input.nextDouble();      
        GetSet Producto = new GetSet(nombre, precio, color, kW, peso);
        TVSmart.add(Producto);
        String Muestra = Producto.toString();
        System.out.println(Muestra);
    }
    
    public static void RegistroES(ArrayList<GetSet> ESonido){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre del producto: ");
        String nom = input.next();
        String nombre = nom.toLowerCase();
        System.out.println("Ingrese precio del producto: ");
        double precio = input.nextDouble();
        System.out.println("Ingrese color del producto ");
        String clr = input.next();
        String color = clr.toLowerCase();
        System.out.println("Ingrese consumo del producto (Kilowatts): ");
        int kW = input.nextInt();
        System.out.println("Ingrese peso del producto (Kg): ");
        double peso = input.nextDouble();      
        GetSet Producto = new GetSet(nombre, precio, color, kW, peso);
        ESonido.add(Producto);
        String Muestra = Producto.toString();
        System.out.println(Muestra);
    }
    
    public static void Mostrar(ArrayList<GetSet> TVSmart, ArrayList<GetSet> ESonido){
        if (TVSmart.size() == 0 && ESonido.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            for (int num = 0; num < TVSmart.size(); num++){
                String Muestra = TVSmart.get(num).toString();
                System.out.println("Producto TV No. "+(num+1)+"\n"+Muestra);
            }
            for (int num = 0; num < ESonido.size(); num++){
                String Muestra = ESonido.get(num).toString();
                System.out.println("Producto Sonido No. "+(num+1)+"\n"+Muestra);
            }
        }
    }
    
    public static void ActualizarTV(ArrayList<GetSet> TVSmart){
        Scanner input = new Scanner(System.in);
        if (TVSmart.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            System.out.println("Ingrese nombre del producto que desea modificar");
            String nmb = input.next();
            String nom = nmb.toLowerCase();
            System.out.println("Ingrese precio del producto que desea modificar");
            int pre = input.nextInt();
            for (int cont = 0; cont < TVSmart.size(); cont++){
                if (TVSmart.get(cont).getNombrep()== nom) {
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
    
    public static void ActualizarES(ArrayList<GetSet> ESonido){
        Scanner input = new Scanner(System.in);
        if (ESonido.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            System.out.println("Ingrese nombre del producto que desea modificar");
            String nmb = input.next();
            String nom = nmb.toLowerCase();
            System.out.println("Ingrese precio del producto que desea modificar");
            int pre = input.nextInt();
            for (int cont = 0; cont < ESonido.size(); cont++){
                if (ESonido.get(cont).getNombrep()== nom) {
                    System.out.println("Que desea Actualizar?");
                    System.out.println("1. Nombre\n2. Color\n3. Precio\n4. Peso\n5. Kilowatts");
                    System.out.println("Escoja una opcion");
                    int opc = input.nextInt();
                    switch (opc){
                        case 1 -> {
                            System.out.println("Ingrese nombre nuevo");
                            String nomb = input.next();
                            String nombre = nomb.toLowerCase();
                            ESonido.get(cont).setNombrep(nombre);
                        }
                        case 2 -> {
                            System.out.println("Ingrese color nuevo");
                            String col = input.next();
                            String color = col.toLowerCase();
                            ESonido.get(cont).setColor(color);
                        }
                        case 3 -> {
                            System.out.println("Ingrese precio nuevo");
                            int precio = input.nextInt();
                            ESonido.get(cont).setPrecio(precio);
                        }
                        case 4 -> {
                            System.out.println("Ingrese peso nuevo");
                            int peso = input.nextInt();
                            ESonido.get(cont).setPeso(peso);
                        }
                        case 5 -> {
                            System.out.println("Ingrese Kilowatts nuevo");
                            int kilowatts = input.nextInt();
                            ESonido.get(cont).setKilowatts(kilowatts);
                        }
                        default -> System.out.println("Ingreso una opcion no valida");
                    }
                }else if (ESonido.get(cont).getPrecio()== pre){
                    System.out.println("Que desea Actualizar?");
                    System.out.println("1. Nombre\n2. Color\n3. Precio\n4. Peso\n5. Kilowatts");
                    System.out.println("Escoja una opcion");
                    int opc = input.nextInt();
                    switch (opc){
                        case 1 -> {
                            System.out.println("Ingrese nombre nuevo");
                            String nomb = input.next();
                            String nombre = nomb.toLowerCase();
                            ESonido.get(cont).setNombrep(nombre);
                        }
                        case 2 -> {
                            System.out.println("Ingrese color nuevo");
                            String col = input.next();
                            String color = col.toLowerCase();
                            ESonido.get(cont).setColor(color);
                        }
                        case 3 -> {
                            System.out.println("Ingrese precio nuevo");
                            int precio = input.nextInt();
                            ESonido.get(cont).setPrecio(precio);
                        }
                        case 4 -> {
                            System.out.println("Ingrese peso nuevo");
                            int peso = input.nextInt();
                            ESonido.get(cont).setPeso(peso);
                        }
                        case 5 -> {
                            System.out.println("Ingrese Kilowatts nuevo");
                            int kilowatts = input.nextInt();
                            ESonido.get(cont).setKilowatts(kilowatts);
                        }
                        default -> System.out.println("Ingreso una opcion no valida");
                    }
                }else {System.out.println("No se encontro el producto");}
            }
        }
    }
    
    public static void EliminarTV(ArrayList<GetSet> TVSmart){
        Scanner input = new Scanner(System.in);
        if (TVSmart.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            String Muestra = TVSmart.toString();
            System.out.println(Muestra);
            System.out.println("Ingrese nombre: ");
            String nom = input.next();
            System.out.println("Ingrese precio: ");
            int conf = input.nextInt();
            for (int cont = 0; cont < TVSmart.size(); cont++){
                if (TVSmart.get(cont).getNombrep()== nom){
                    TVSmart.remove(cont);
                }else if (TVSmart.get(cont).getPrecio()== conf){
                    TVSmart.remove(cont);
                }else {
                    System.out.println("El producto no es encontrado.");
                }
            }
            System.out.println(Muestra);
        }
    }
    
    public static void EliminarES(ArrayList<GetSet> ESonido){
        Scanner input = new Scanner(System.in);
        if (ESonido.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            String Muestra = ESonido.toString();
            System.out.println(Muestra);
            System.out.println("Ingrese nombre: ");
            String nom = input.next();
            System.out.println("Ingrese precio: ");
            int conf = input.nextInt();
            for (int cont = 0; cont < ESonido.size(); cont++){
                if (ESonido.get(cont).getNombrep()== nom){
                    ESonido.remove(cont);
                }else if (ESonido.get(cont).getPrecio()== conf){
                    ESonido.remove(cont);
                }else {
                    System.out.println("El producto no es encontrado.");
                }
            }
            System.out.println(Muestra);
        }
    }
    
    public static void VenderTV(ArrayList<GetSet> TVSmart, ArrayList<GetSet> VentaTV){
        Scanner input = new Scanner(System.in);
        if (TVSmart.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            String Muestra = TVSmart.toString();
            System.out.println(Muestra);
            System.out.println("Nombre del producto que desea vender");
            String nmb = input.next();
            String nom = nmb.toLowerCase();
            for (int cont = 0; cont < TVSmart.size(); cont++){
                if (TVSmart.get(cont).getNombrep()== nom){
                    System.out.println("el producto encontrado tiene las siguientes caracteristicas");
                    System.out.println("Nombre: "+ TVSmart.get(cont).getNombrep());
                    System.out.println("Color: "+ TVSmart.get(cont).getColor());
                    System.out.println("Peso: "+ TVSmart.get(cont).getPeso()+"Kg");
                    System.out.println("Consumo: "+ TVSmart.get(cont).getKilowatts()+"kW");
                    System.out.println("Precio: "+ TVSmart.get(cont).getPrecio());
                    System.out.println("Seguro de venderlo? \n1. Si \n2. No");
                    int conf = input.nextInt();
                    switch (conf){
                        case 1 -> {
                            System.out.println("Ingrese la cantidad que desea comprar");
                            int cant = input.nextInt();
                            for (int conta = 0; conta < TVSmart.size(); conta++){
                                VentaTV.add(TVSmart.get(cont));
                            }
                        }
                        case 2 -> {
                            System.out.println("precio del producto que desea vender");
                            int pre = input.nextInt();
                            for (int con = 0; con < TVSmart.size(); con++){
                                if (TVSmart.get(con).getPrecio() == pre){
                                    System.out.println("el producto encontrado tiene las siguientes caracteristicas");
                                    System.out.println("Nombre: "+ TVSmart.get(cont).getNombrep());
                                    System.out.println("Color: "+ TVSmart.get(cont).getColor());
                                    System.out.println("Peso: "+ TVSmart.get(cont).getPeso()+"Kg");
                                    System.out.println("Consumo: "+ TVSmart.get(cont).getKilowatts()+"kW");
                                    System.out.println("Precio: "+ TVSmart.get(cont).getPrecio());
                                    System.out.println("Seguro de venderlo? \n1. Si \n2. No");
                                    int confi = input.nextInt();
                                    switch (confi){
                                        case 1 -> {
                                            System.out.println("Ingrese la cantidad que desea comprar");
                                            int cant = input.nextInt();
                                            for (int conta = 0; conta < TVSmart.size(); conta++){
                                                VentaTV.add(TVSmart.get(cont));
                                            }
                                        }
                                        case 2 -> {
                                            System.out.println("Lo sentimos, no encontramos el producto");
                                        }
                                    }
                                }else {
                                    System.out.println("El producto no es encontrado.");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void VenderES(ArrayList<GetSet> ESonido, ArrayList<GetSet> VentaES){
        Scanner input = new Scanner(System.in);
        if (ESonido.size() == 0){
            System.out.println("Primero debe ingresar los productos");
        }else {
            String Muestra = ESonido.toString();
            System.out.println(Muestra);
            System.out.println("Nombre del producto que desea vender");
            String nmb = input.next();
            String nom = nmb.toLowerCase();
            for (int cont = 0; cont < ESonido.size(); cont++){
                if (ESonido.get(cont).getNombrep()== nom){
                    System.out.println("el producto encontrado tiene las siguientes caracteristicas");
                    System.out.println("Nombre: "+ ESonido.get(cont).getNombrep());
                    System.out.println("Color: "+ ESonido.get(cont).getColor());
                    System.out.println("Peso: "+ ESonido.get(cont).getPeso()+"Kg");
                    System.out.println("Consumo: "+ ESonido.get(cont).getKilowatts()+"kW");
                    System.out.println("Precio: "+ ESonido.get(cont).getPrecio());
                    System.out.println("Seguro de venderlo? \n1. Si \n2. No");
                    int conf = input.nextInt();
                    switch (conf){
                        case 1 -> {
                            System.out.println("Ingrese la cantidad que desea comprar");
                            int cant = input.nextInt();
                            for (int conta = 0; conta < ESonido.size(); conta++){
                                VentaES.add(ESonido.get(cont));
                            }
                        }
                        case 2 -> {
                            System.out.println("precio del producto que desea vender");
                            int pre = input.nextInt();
                            for (int con = 0; con < ESonido.size(); con++){
                                if (ESonido.get(con).getPrecio() == pre){
                                    System.out.println("el producto encontrado tiene las siguientes caracteristicas");
                                    System.out.println("Nombre: "+ ESonido.get(cont).getNombrep());
                                    System.out.println("Color: "+ ESonido.get(cont).getColor());
                                    System.out.println("Peso: "+ ESonido.get(cont).getPeso()+"Kg");
                                    System.out.println("Consumo: "+ ESonido.get(cont).getKilowatts()+"kW");
                                    System.out.println("Precio: "+ ESonido.get(cont).getPrecio());
                                    System.out.println("Seguro de venderlo? \n1. Si \n2. No");
                                    int confi = input.nextInt();
                                    switch (confi){
                                        case 1 -> {
                                            System.out.println("Ingrese la cantidad que desea comprar");
                                            int cant = input.nextInt();
                                            for (int conta = 0; conta < ESonido.size(); conta++){
                                                VentaES.add(ESonido.get(cont));
                                            }
                                        }
                                        case 2 -> {
                                            System.out.println("Lo sentimos, no encontramos el producto");
                                        }
                                    }
                                }else {
                                    System.out.println("El producto no es encontrado.");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void Vender(ArrayList<GetSet> VentaTV, ArrayList<GetSet> VentaES){
        Scanner input = new Scanner(System.in);
        double sumaTV = 0, sumaES = 0;
        for (int conta = 0; conta < VentaTV.size(); conta++){
            sumaTV += VentaTV.get(conta).getPrecio();
        }
        double tolTV = sumaTV * 0.10;
        double totalTV = sumaTV +tolTV;
        for (int conta = 0; conta < VentaES.size(); conta++){
            sumaES += VentaES.get(conta).getPrecio();
        }
        double tolES = sumaES * 0.15;
        double totalES = sumaES +tolES;
        System.out.println("El total de ventas realizadas es: ");
        System.out.println("Se vendieron "+VentaTV.size()+" Televisores Smart. Con un total de "+totalTV);
        System.out.println("Se vendieron "+VentaES.size()+" Equipos de Sonido. Con un total de "+totalES);
    }
}