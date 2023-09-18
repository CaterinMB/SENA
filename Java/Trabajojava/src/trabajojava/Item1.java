package trabajojava;
import java.util.*;
public class Item1 {
    
    static void TColombia(){
        Scanner input = new Scanner(System.in);
        ArrayList<Double> TC = new ArrayList<>();
        System.out.println("Digite el numero de tiempos a ingresar");
        int NT = input.nextInt();
        double suma = 0;
        for (int cont=0; cont<NT; cont++){
            System.out.println("El tiempo "+(cont+1)+": ");
            double Tiempo = input.nextDouble();
            TC.add(Tiempo);
            suma += Tiempo;
        }
        double prom = suma / TC.size();
        System.out.println("El promedio de los Tiempos en COLOMBIA es: "+prom);
        input.close();
    }
    
    static double Maximo(ArrayList<Double> TB){
        double max = 0;
        for (double cont:TB){
            if (cont>max){
                max=cont;
            }
        }
        return max;
    }
    static double Minimo(ArrayList<Double> TB){
        double min = 100;
        for (double cont:TB){
            if (cont<min){
                min=cont;
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Opcion 1: Tiempos de nadadores en COLOMBIA");
            System.out.println("Opcion 2: Tiempos de nadadores en BRASIL");
            System.out.println("Opcion 3: Tiempos de nadadores en MEXICO");
            System.out.println("Opcion 4: Tiempos de nadadores en ESTADOS UNIDOS");
            System.out.println("Opcion 5: Para salir");
            System.out.println("Ingrese una opcion: ");
            opc = input.nextInt();
            switch (opc){
                case 1 -> {
                    TColombia();
                    continue;
                }
                case 2 -> {
                    ArrayList<Double> TB = new ArrayList<>();
                    System.out.println("Digite el numero de tiempos a ingresar");
                    int NT = input.nextInt();
                    for (int cont=0; cont<NT; cont++){
                        System.out.println("El tiempo "+(cont+1)+": ");
                        double Tiempo = input.nextDouble();
                        TB.add(Tiempo);
                    }
                    double max = Maximo(TB);
                    double min = Minimo(TB);
                    System.out.println("El tiempo maximo es: "+max);
                    System.out.println("El tiempo minimo es: "+min);
                    continue;
                }
                case 3 -> {
                    ArrayList<Double> TM = new ArrayList<>();
                    System.out.println("Digite el numero de tiempos a ingresar");
                    int NT = input.nextInt();
                    for (int cont=0; cont<NT; cont++){
                        System.out.println("El tiempo "+(cont+1)+": ");
                        double Tiempo = input.nextDouble();
                        TM.add(Tiempo);
                    }
                    Collections.sort(TM);
                    System.out.println("Los tiempos ingresados son "+TM);
                    continue;
                }
                case 4 -> {
                    ArrayList<Double> TE = new ArrayList<>();
                    System.out.println("Digite el numero de tiempos a ingresar");
                    int NT = input.nextInt();
                    double suma = 0;
                    for (int cont=0; cont<NT; cont++){
                        System.out.println("El tiempo "+(cont+1)+": ");
                        double Tiempo = input.nextDouble();
                        TE.add(Tiempo);
                        suma += Tiempo;
                    }
                    double prom = suma / TE.size();
                    if (prom > 0 && prom <= 30){
                        System.out.println("Posibilidades de medalla de ORO con un puntaje de "+prom);
                    }else if (prom > 30 && prom <= 40){
                        System.out.println("Posibilidades de medalla de PLATA con un puntaje de "+prom);
                    }else if (prom > 40 && prom <= 50){
                        System.out.println("Posibilidades de medalla de BRONCE con un puntaje de "+prom);
                    }else {
                        System.out.println("SIN posibilidades de medalla con un puntaje de "+prom);
                    }
                    continue;
                }
                default -> {
                    System.out.println("Digite una opcion valida");
                    continue;
                }
            }
        }while (opc != 5);
        input.close();
    }
}