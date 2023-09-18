package ejercicio4;
import java.util.Scanner;
import java.util.Arrays;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int numeros[][] = new int[][] { {2,7,9},{3,6,1},{7,4,2} };
        String cadenas[][] = new String[][] { {"Amarillo","Azul","Rojo"},{"Morado", "Naranja", "Verde"} }; 
        double reales[][] = new double[][] { {5.6,3.5,7.4},{4.8,6.9,2.4},{6.9,8.7,6.2} };
        numeros[1][0] = 8;
        cadenas[0][1] = "Sara";
        reales[2][2] = 4.9;
        System.out.println(numeros[1][0]);
        System.out.println(cadenas[0][1]);
        System.out.println(reales[2][2]);
        System.out.println(Arrays.deepToString(numeros));
        System.out.println(Arrays.deepToString(cadenas));*/
        
        /*System.out.println("Cuantas filas: ");
        int x = input.nextInt();
        System.out.println("Cuantas columnas: ");
        int y = input.nextInt();
        int[][] matriz = new int [x][y];
        for (int[] matriz1 : matriz) {
            for (int b = 0; b<matriz[0].length; b++) {
                System.out.println("Ingrese valor: ");
                int c = input.nextInt();
                matriz1[b] = c;
            }
        }
        System.out.println(Arrays.deepToString(matriz));*/
        
        System.out.println("Cuantos empleados desea ingresar: ");
        int y = input.nextInt();
        int min=1000000, max=0;
        int[][] nomina = new int [y][3];
        for (int x=0; x<nomina.length; x++){
            System.out.println("Ingrese dias trabajados del trabajor "+(x+1)+": ");
            int diasT = input.nextInt();
            nomina[x][0] = diasT;
            System.out.println("Ingrese valor del dia del trabajor "+(x+1)+": ");
            int Valord = input.nextInt();
            nomina[x][1] = Valord;
            int total = diasT * Valord;
            nomina[x][2] = total;
            if (max < total){
                max = total;
            }else if (min > total){
                min = total;
            }else{}
        }
        System.out.println(Arrays.deepToString(nomina));
        System.out.println("El valor mayor es: "+max);
        System.out.println("El valor menor es: "+min);
    }
}
