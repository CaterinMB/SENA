package ejercicio5;
import java.util.*;
import java.util.Collection;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*ArrayList<String> Semana = new ArrayList<String>();
        Semana.add("Lunes");
        Semana.add("Martes");
        Semana.add("Miercoles");
        Semana.add("Jueves");
        Semana.add("Viernes");
        Semana.add("Sabado");
        Semana.add("Domingo");
        Semana.remove(2);
        for (int x=0; x<Semana.size(); x++){
            System.out.println(Semana.get(x));
        }
        System.out.println("");
        for (String Dia:Semana){
            System.out.println(Dia);
        }*/
        
        /*ArrayList<String> A_Salvajes = new ArrayList<>();
        do {
            System.out.println("Opcion 1: Guardar N nombre de animales salvajes.");
            System.out.println("Opcion 2: Ver en la pantalla la lista.");
            System.out.println("Opcion 3: Eliminar uno de los nombres almacenados en la lista.");
            System.out.println("Opcion 4: Actualizar uno de los nombres.");
            System.out.println("Opcion 5: Ordenar y mostrar la lista");
            System.out.println("Escoge una opcion: ");
            int opc = input.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.println("Los nombres son: "+A_Salvajes);
                    System.out.println("Ingrese la cantidad de nombres");
                    int Cand = input.nextInt();
                    for (int y=0; y<Cand; y++){
                        System.out.println("Digite el nombre "+(y+1)+": ");
                        String nomA = input.next();
                        A_Salvajes.add(nomA);
                    }
                    continue;
                }
                case 2 -> {
                    System.out.println("Los nombres son: "+A_Salvajes);
                    continue;
                }
                case 3 -> {
                    if (A_Salvajes.isEmpty()){
                        System.out.println("Digite primero los nombres");
                    }else {
                        System.out.println("Los nombres son: "+A_Salvajes);
                        System.out.println("Digite el campo que desea eliminar");
                        int Inombre = input.nextInt();
                        A_Salvajes.remove(Inombre-1);
                    }
                    continue;
                }
                case 4 -> {
                    if (A_Salvajes.isEmpty()){
                        System.out.println("Digite primero los nombres");
                    }else {
                        System.out.println("Los nombres son: "+A_Salvajes);
                        System.out.println("Digite el campo que desea cambiar");
                        int Inombre = input.nextInt();
                        System.out.println("Digite por el nombre que desea cambiar");
                        String actual = input.next();
                        A_Salvajes.set(Inombre-1, actual);
                    }
                    continue;
                }
                case 5 -> {
                    System.out.println("Los nombres son: "+A_Salvajes);
                    Collections.sort(A_Salvajes);
                    System.out.println("La lista ordenada es: "+A_Salvajes);
                    continue;
                }
                default -> {
                    System.out.println("Digite una opcion valida");
                    continue;
                }
            }
        }while(true);*/
        
        /*System.out.println("Ingrese los productos a ingresar: ");
        int Cand = input.nextInt();
        int VBruto = 0;
        ArrayList<String> Productos = new ArrayList<>();
        ArrayList<Integer> Cantidades = new ArrayList<>();
        ArrayList<Integer> Precio = new ArrayList<>();
        for (int cont=0; cont<Cand; cont++){
            System.out.println("Ingrese el nombre del producto");
            String Nombre = input.next();
            Productos.add(Nombre);
            System.out.println("Ingrese la cantidad de producto a comprar");
            int Canti = input.nextInt();
            Cantidades.add(Canti);
            System.out.println("Ingrese el valor del producto");
            int Valor = input.nextInt();
            Precio.add(Valor);
            int Total = Valor*Canti;  
            VBruto += Total;
        }
        float IVA = (float)(0.19*VBruto);
        float Neto = VBruto + IVA;
        System.out.println("Los productos son: "+Productos);
        System.out.println("Las cantidades son: "+Cantidades);
        System.out.println("Los precios son: "+Precio);
        System.out.println("El valor bruto es: "+VBruto);
        System.out.println("El IVA es: "+IVA);
        System.out.println("El Valor Neto es: "+Neto);*/
        
        ArrayList<Integer> Conversiones = new ArrayList<>();
        boolean rest = true;
        do {
            System.out.println("Desea Convertir: si o no? ");
            String Rpre = input.next();
            if ("si".equals(Rpre)){
                System.out.println("Ingrese los dolares a convertir");
                int Dolar = input.nextInt();
                int cop = Dolar * 4550;
                Conversiones.add(cop);
            }else {
                rest = false;
            }
        }while (rest);
        System.out.println(Conversiones);
    }
}
