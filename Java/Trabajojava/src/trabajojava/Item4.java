package trabajojava;
import java.util.*;
public class Item4 {
    static void Promedio(double suma, double[] Tiempos){
        double prom = suma / Tiempos.length;
        if (prom > 0 && prom <=25){
            System.out.println("VAMOS BIEN – Posibilidades de medalla de Oro");
        }else if (prom > 25 && prom <=30){
            System.out.println("CONTINUEMOS TRABAJANDO – Posibilidades de medalla de Plata");
        }else if (prom > 30 && prom <=40){
            System.out.println("DEBEMOS MEJORAR MAS – Posibilidades de medalla de Bronce");
        }else if (prom > 30 && prom <=40){
            System.out.println("ALERTA MAXIMA – No realizaremos una buena representación");
        }else {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args) {
        double[] Tiempos = new double[] {30.50, 29.89, 27.45, 33.56, 20.78, 45.73, 33.56, 45.33, 23.89};
        double suma = 0, min = 50, max = 0;
        for (double cont:Tiempos){
            if (max < cont){
                max=cont;
            }else if (min > cont){
                min =cont;
            }else {}
            suma += cont;
        }
        double prom = suma / Tiempos.length;
        System.out.println("La sumatoria total es: "+suma);
        System.out.println("El promedio es: "+prom);
        System.out.println("El patinador mas veloz es: "+max);
        System.out.println("El patinador menos veloz es: "+min);
        System.out.println("Numero de patinadores: "+Tiempos.length);
        Promedio(suma, Tiempos);
    }
}
