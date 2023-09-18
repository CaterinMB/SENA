package ejercicio3;
import java.util.*;
public class MenuReto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] tiempos = new float[0];
        float suma = 0;
        do{
            System.out.println("Opcion 1: Guardar N tiempos de un corredor");
            System.out.println("Opcion 2: Actualizar uno de los tiempos del corredor por uno nuevo");
            System.out.println("Opcion 3: Visualizar los tiempos del corredor");
            System.out.println("Opcion 4: Eliminar uno de los tiempos del corredor");
            System.out.println("Opcion 5: Mostrar el promedio de los tiempos del corredor");
            System.out.println("Opcion 6: Mostrar el tiempo MAX y MIN del correcdor");
            System.out.println("Opcion 7: Salir del programa");
            System.out.println("Escoge una opcion: ");
            int opc = input.nextInt();
            switch (opc){
                case 1 -> {
                    System.out.println("Digite los tiempos a ingresar");
                    int n_tiempos = input.nextInt();
                    tiempos = new float[n_tiempos];
                    for (int y=0; y<n_tiempos; y++){
                        System.out.println("Digite el tiempo "+(y+1)+": ");
                        float tiempo = input.nextFloat();
                        tiempos[y] = tiempo;
                    }
                    continue;
                }
                case 2 -> {
                    if (tiempos.length==0){
                        System.out.println("Digite primero algun tiempo para poder actualizar");
                    }else {
                        System.out.println("Las notas son: "+Arrays.toString(tiempos));
                        System.out.println("Digite el campo que desea eliminar");
                        int a_indice = input.nextInt();
                        System.out.println("Digite por el valor que desea cambiar");
                        float actual = input.nextInt();
                        tiempos[a_indice-1] = actual;
                    }
                    continue;
                }
                case 3 -> {
                    System.out.println("Las notas son: "+Arrays.toString(tiempos));
                    continue;
                }
                case 4 -> {
                    System.out.println("Las notas son: "+Arrays.toString(tiempos));
                    
                    continue;
                }
                case 5 -> {
                    for (int x=0; x<tiempos.length; x++){
                        suma +=tiempos[x];
                    }
                    float prom =suma/tiempos.length;
                    if (prom >= 4.0){
                        System.out.println("Ha sido aprobado");
                    }else {
                        System.out.println("Ha sido desaprobado");
                    }
                    continue;
                }
                case 6 -> {
                    Arrays.sort(tiempos);
                    System.out.println("La nota mas alta es: "+tiempos[tiempos.length-1]);
                    System.out.println("La nota mas baja es: "+tiempos[0]);
                    continue;
                }
                case 7 -> {
                    System.out.println("Espero que le funcionara correctamente");
                    break;
                }
                default -> {
                    System.out.println("Digite una opcion valida");
                    continue;
                }
            }
        }while (true);
    }
}
