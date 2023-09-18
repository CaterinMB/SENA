package ejercicio3;
import java.util.Arrays;
/*import java.util.Collections;*/
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String[] deportes = new String[] {"Natacion", "Futbol", "Tenis", "Patinaje", "Karate"};
        int[] numeros = new int[] {56, 34, 43, 65, 54, 57, 98, 87, 4, 61};
        System.out.println(deportes[2]);
        deportes[2] = "Basquet";
        System.out.println(deportes[2]);*/
        /*System.out.println(numeros[8]);
        decimales[5] = 38;
        System.out.println(numeros[8]);*/
        /*System.out.println("La longitud de Deportes es: "+ deportes.length);
        System.out.println("La longitud de Deportes es: "+ numeros.length);*/
        /*for (String deporte : deportes) {
            System.out.println(deporte);
        }
        for (int x=0; x<numeros.length; x++){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(deportes));
        System.out.println(Arrays.toString(numeros));
        Arrays.stream(deportes).forEach(System.out::println);
        Arrays.stream(numeros).forEach(System.out::println);
        System.out.println(Arrays.asList(deportes));
        System.out.println(Arrays.toString(deportes));
        Arrays.sort(deportes);
        System.out.println(Arrays.toString(deportes));
        Arrays.sort(deportes, Collections.reverseOrder());
        System.out.println(Arrays.toString(deportes));
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
        int[] numeros2 = Arrays.copyOf(numeros, numeros.length);
        System.out.println(Arrays.toString(numeros2));
        String[] deporte2 = Arrays.copyOf(deportes, deportes.length);
        System.out.println(Arrays.toString(deporte2));*/
        
        /*System.out.println("Digite un numero: ");
        int x = input.nextInt();
        int[] tabla = new int[10];
        for (int y=0; y<10; y++){
            tabla[y] = x * (y+1);
        }
        System.out.println(Arrays.toString(tabla));
        input.close();*/
        
        /*System.out.println("Digite cuantas notas va a ingresar");
        int n_notas = input.nextInt();
        
        float[] notas = new float[n_notas];
        float suma = 0;
        for (int y=0; y<n_notas; y++){
            System.out.println("Digite nota "+(y+1)+": ");
            float nota = input.nextFloat();
            notas[y] = nota;
            suma = suma + nota;
        }
        float prom = suma / n_notas;
        System.out.println("Las notas son: "+Arrays.toString(notas));
        if (prom >= 4.0 && prom <=5.0){
            System.out.println("Ha sido aprovado con un promedio de "+ prom);
        }else {
            System.out.println("Ha sido desaprovado con un promedio de "+ prom);
        }
        Arrays.sort(notas);
        System.out.println("La nota mas alta es: "+notas[n_notas-1]);
        System.out.println("La nota mas baja es: "+notas[0]);
        input.close();*/
    }
}