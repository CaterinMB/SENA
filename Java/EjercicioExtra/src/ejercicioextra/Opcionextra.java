package ejercicioextra;
import java.util.*;
import static ejercicioextra.MetodosExtra.*;
public class Opcionextra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc;
        do {
            System.out.println("-   MENU FIGURAS GEOMETRICAS   -");
            System.out.println("Opcion 1: Hallar el perimetro de un cuadrado");
            System.out.println("Opcion 2: Hallar el area de un cuadrado");
            System.out.println("Opcion 3: Hallar el volumen de un cubo");
            System.out.println("Opcion 4: Hallar el perimetro de un rectangulo");
            System.out.println("Opcion 5: Hallar el area de un rectangulo");
            System.out.println("Opcion 6: Hallar el volumen de un prisma");
            System.out.println("Opcion 7: Hallar el perimetro de un triangulo");
            System.out.println("Opcion 8: Hallar el area de un triangulo");
            System.out.println("Opcion 9: Hallar el volumen de una piramide");
            System.out.println("Opcion 10: Hallar el perimetro de un pentagono");
            System.out.println("Opcion 11: Hallar el area de un pentagono");
            System.out.println("Opcion 12: Hallar el perimetro de un circulo");
            System.out.println("Opcion 13: Hallar el area de un circulo");
            System.out.println("Opcion 14: Hallar el volumen de una esfera");
            System.out.println("Opcion 15: Hallar el volumen de un cilindro");
            System.out.println("Opcion 16: Salir del programa");
            System.out.println("Escoge una opcion: ");
            opc = input.nextInt();
            switch (opc){
                case 1 -> {
                    PerimetroC();
                    System.out.println("");
                    continue;
                }
                case 2 -> {
                    System.out.println("Ingrese un lado del cuadrado: ");
                    double lado = input.nextInt();
                    double ACuadrado = AreaC(lado);
                    System.out.println("El area del cuadrado es "+ACuadrado);
                    System.out.println("");
                    continue;
                }
                case 3 -> {
                    VolumenC();
                    System.out.println("");
                    continue;
                }
                case 4 -> {
                    System.out.println("Ingrese la altura del rectangulo: ");
                    double h = input.nextInt();
                    System.out.println("Ingrese la base del rectangulo: ");
                    double b= input.nextInt();
                    double PRectangulo = PerimetroR(h, b);
                    System.out.println("El perimetro del rectangulo es "+PRectangulo);
                    System.out.println("");
                    continue;
                }
                case 5 -> {
                    AreaR();
                    System.out.println("");
                    continue;
                }
                case 6 -> {
                    System.out.println("Ingrese la base del prisma: ");
                    double b= input.nextInt();
                    System.out.println("Ingrese la profundidad del prisma: ");
                    double a = input.nextInt();
                    System.out.println("Ingrese la altura del prisma: ");
                    double h = input.nextInt();
                    double VPrisma = VolumenPa(a, b, h);
                    System.out.println("El volumen del prisma es "+VPrisma);
                    System.out.println("");
                    continue;
                }
                case 7 -> {
                    PerimetroT();
                    System.out.println("");
                    continue;
                }
                case 8 -> {
                    System.out.println("Ingrese la base del triangulo: ");
                    double b= input.nextInt();
                    System.out.println("Ingrese la altura del triangulo: ");
                    double h = input.nextInt();
                    double ATriangulo = AreaT(b, h);
                    System.out.println("El area del triangulo es "+ATriangulo);
                    System.out.println("");
                    continue;
                }
                case 9 -> {
                    VolumenP();
                    System.out.println("");
                    continue;
                }
                case 10 -> {
                    System.out.println("Ingrese un lado del pentagono: ");
                    double lado = input.nextInt();
                    double PPentagono = PerimetroP(lado);
                    System.out.println("El perimetro del pentagono es "+PPentagono);
                    System.out.println("");
                    continue;
                }
                case 11 -> {
                    AreaP();
                    System.out.println("");
                    continue;
                }
                case 12 -> {
                    System.out.println("Ingrese el diametro del circulo: ");
                    double D = input.nextInt();
                    double PCirculo = PerimetroCo(D);
                    System.out.println("El perimetro del circulo es "+PCirculo);
                    System.out.println("");
                    continue;
                }
                case 13 -> {
                    AreaCo();
                    System.out.println("");
                    continue;
                }
                case 14 -> {
                    System.out.println("Ingrese el radio del circulo: ");
                    double radio = input.nextInt();
                    double VEsfera = VolumenE(radio);
                    System.out.println("El volumen de la esfera es "+VEsfera);
                    System.out.println("");
                    continue;
                }
                case 15 -> {
                    VolumenCo();
                    System.out.println("");
                    continue;
                }
                default -> {
                    System.out.println("Digite una opcion valida");
                    System.out.println("");
                    continue;
                }
            }
        }while (opc != 16);
    }  
}
