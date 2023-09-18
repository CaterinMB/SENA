package ejercicio6;
import java.util.*;
public class MetodosReto {
    static void Promedio(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el numero de notas: ");
        int not = input.nextInt();
        double[] notas = new double[not];
        double suma =0;
        for (int x=0; x<not; x++){
            System.out.println("Ingrese la nota numero "+(x+1)+": ");
            double nota = input.nextDouble();
            notas[x] = nota;
            suma += nota;
        }
        double prom = suma / not;
        System.out.println("El promedio del estuante es: "+prom);
        System.out.println("La notas son: "+Arrays.toString(notas));
    }
    static double AreaR (double d1, double d2){
        double ARombo = (d1*d2)/2;
        return ARombo;
    }
    static double PerimetroR (double lado){
        double PRombo = lado * 4;
        return PRombo;
    }
    static void Triangulo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Que tan grande desea el triangulo? ");
        int lim = input.nextInt();
        String trian = "";
        for (int x=1; x<=lim; x++){
            trian += "*";
            System.out.println(trian);
        }
    }
//    static String votos(String voto){
//        if (voto == "rojo"){
//        }else if (voto == "verde"){
//        }else if (voto == "azul"){
//        }else {
//            System.out.println("Ingrese una opcion valida");
//        }
//    }
}