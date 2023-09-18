package ejercicioextra;
import java.util.*;
public class MetodosExtra {
    static void PerimetroC(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un lado del cuadrado: ");
        double lado = input.nextInt();
        double PCuadrado = lado * 4;
        System.out.println("El perimetro del cuadrado es "+PCuadrado);
    }
    
    static double AreaC (double lado){
        double ACuadrado = lado * lado;
        return ACuadrado;
    }
    
    static void VolumenC(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un lado del cubo: ");
        double lado = input.nextInt();
        double VCubo = Math.pow(lado, 3);
        System.out.println("El volumen del cubo es "+VCubo);
    }
    
    static double PerimetroR (double h, double b){
        double PRectangulo = (h*2)+(b*2);
        return PRectangulo;
    }

    static void AreaR(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectangulo: ");
        double h = input.nextInt();
        System.out.println("Ingrese la base del rectangulo: ");
        double b= input.nextInt();
        double ARectangulo = h*b;
        System.out.println("El area del rectangulo es "+ARectangulo);
    }
    
    static double VolumenPa (double a, double h, double b){
        double VPrisma = (a*b)*h;
        return VPrisma;
    }
    
    static void PerimetroT(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un lado del triangulo: ");
        double lado = input.nextInt();
        double PTriangulo = lado*3;
        System.out.println("El perimetro del triangulo es "+PTriangulo);
    }
    
    static double AreaT (double h, double b){
        double ATriangulo = (b*h)/2;
        return ATriangulo;
    }
    
    static void VolumenP(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base de la piramide: ");
        double b= input.nextInt();
        System.out.println("Ingrese la profundidad de la piramide: ");
        double a = input.nextInt();
        System.out.println("Ingrese la altura de la piramide: ");
        double h = input.nextInt();
        double VPiramide = ((a*b)*h)/3;
        System.out.println("El volumen de la piramide es "+VPiramide);
    }
    
    static double PerimetroP (double lado){
        double PPentagono = lado * 5;
        return PPentagono;
    }
    
    static void AreaP(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un lado del pentagono: ");
        double lado = input.nextInt();
        System.out.println("Ingrese el apotema del pentagono: ");
        double apotema = input.nextInt();
        double APentagono = ((lado*5)*apotema)/2;
        System.out.println("El area del pentagono es "+APentagono);
    }
    
    static double PerimetroCo (double D){
        double PCirculo = 3.1416 * D;
        return PCirculo;
    }
    
    static void AreaCo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio = input.nextInt();
        double ACirculo = (radio*radio)*3.1416;
        System.out.println("El area del circulo es "+ACirculo);
    }
    
    static double VolumenE (double radio){
        double VEsfera = (4*3.1416*Math.pow(radio, 3))/3;
        return VEsfera;
    }
    
    static void VolumenCo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio del cilindro: ");
        double r = input.nextInt();
        System.out.println("Ingrese la altura del cilindro: ");
        double h = input.nextInt();
        double VCilindro = 3.1416*Math.pow(r, 2)*h;
        System.out.println("El volumen del cilindro es "+VCilindro);
    }
}