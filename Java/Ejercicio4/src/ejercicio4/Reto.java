package ejercicio4;
import java.util.*;
public class Reto {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int suma = 0, Vinv = 0;
        System.out.println("Digite el numero de trabajadores a invertir: ");
        int Ninv = input.nextInt();
        int[] inversiones = new int[Ninv];
        for (int x=0; x<inversiones.length; x++){
            System.out.println("Ingrese el valor a invertir "+(x+1)+": ");
            Vinv = input.nextInt();
            inversiones[x] = Vinv;
            suma += Vinv;
        }
        for (int recorrer:inversiones){
            int porcentaje = recorrer/100*suma;
            System.out.println("El porcentaje de "+recorrer+" es "+porcentaje+"%");
        }
        Arrays.sort(inversiones);
        System.out.println("Las inversiones son: "+Arrays.toString(inversiones));
        System.out.println("El total invertido es: "+suma);*/
        
        Scanner input = new Scanner(System.in);
        int suma = 0, mayores = 0, menores = 0;
        System.out.println("Digite el numero de estudiantes a ingresar: ");
        int NumE = input.nextInt();
        int[] Edades = new int[NumE];
        
        for (int x=0; x<Edades.length; x++){
            System.out.println("Ingrese la "+(x+1)+" edad: ");
            int Eda = input.nextInt();
            Edades[x] = Eda;
            suma += Eda;
            if (Eda < 18){
                menores += 1;
            } else if (Eda >= 18){
                mayores += 1;
            }else {}
        }
        int prom = suma / NumE;
        Arrays.sort(Edades);
        System.out.println("El promedio de edades es: "+prom);
        System.out.println("Las edades son: "+Arrays.toString(Edades));
        System.out.println("Son "+mayores+" mayores de edad y "+menores+" menores de edad, para un total de "+NumE+" estudiantes");
    }
}
