package ejercicioextra;
import java.util.*;
import static ejercicioextra.MetodosExtra.*;
public class EjercicioExtra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc;
        do {
            System.out.println("-   MENU OPERACIONES   -");
            System.out.println("Opcion 1: Hallar Areas");
            System.out.println("Opcion 2: Haller Perimetros");
            System.out.println("Opcion 3: Hallar Volumenes");
            System.out.println("Opcion 4: Salir del programa");
            System.out.println("Escoge una opcion: ");
            opc = input.nextInt();
            
            switch (opc){
                case 1 -> {
                    int opci;
                    do {
                        System.out.println("-   MENU FIGURAS GEOMETRICAS: AREAS   -");
                        System.out.println("Opcion 1: Cuadrado");
                        System.out.println("Opcion 2: Rectangulo");
                        System.out.println("Opcion 3: Triangulo");
                        System.out.println("Opcion 4: Circulo");
                        System.out.println("Opcion 5: Pentagono");
                        System.out.println("Opcion 6: Salir.");
                        System.out.println("Escoge una opcion: ");
                        opci = input.nextInt();
                        switch (opci){
                            case 1-> {
                                System.out.println("Ingrese un lado del cuadrado: ");
                                double lado = input.nextInt();
                                double ACuadrado = AreaC(lado);
                                System.out.println("El area del cuadrado es "+ACuadrado);
                                System.out.println("");
                                continue;
                            }
                            case 2-> {
                                AreaR();
                                System.out.println("");
                                continue;
                            }
                            case 3-> {
                                System.out.println("Ingrese la base del triangulo: ");
                                double b= input.nextInt();
                                System.out.println("Ingrese la altura del triangulo: ");
                                double h = input.nextInt();
                                double ATriangulo = AreaT(b, h);
                                System.out.println("El area del triangulo es "+ATriangulo);
                                System.out.println("");
                                continue;
                            }
                            case 4-> {
                                AreaCo();
                                System.out.println("");
                                continue;
                            }
                            case 5-> {
                                AreaP();
                                System.out.println("");
                                continue;
                            }
                            default -> {
                                System.out.println("Ingrese una opcion valida");
                                System.out.println("");
                                continue;
                            }
                        }
                    } while (opci != 6);
                    continue;
                }
                case 2 -> {
                    int opci;
                    do {
                        System.out.println("-   MENU FIGURAS GEOMETRICAS: PERIMETROS   -");
                        System.out.println("Opcion 1: Cuadrado");
                        System.out.println("Opcion 2: Rectangulo");
                        System.out.println("Opcion 3: Triangulo");
                        System.out.println("Opcion 4: Circulo");
                        System.out.println("Opcion 5: Pentagono");
                        System.out.println("Opcion 6: Salir.");
                        System.out.println("Escoge una opcion: ");
                        opci = input.nextInt();
                        switch (opci){
                            case 1-> {
                                PerimetroC();
                                System.out.println("");
                                continue;
                            }
                            case 2-> {
                                System.out.println("Ingrese la altura del rectangulo: ");
                                double h = input.nextInt();
                                System.out.println("Ingrese la base del rectangulo: ");
                                double b= input.nextInt();
                                double PRectangulo = PerimetroR(h, b);
                                System.out.println("El perimetro del rectangulo es "+PRectangulo);
                                System.out.println("");
                                continue;
                            }
                            case 3-> {
                                PerimetroT();
                                System.out.println("");
                                continue;
                            }
                            case 4-> {
                                System.out.println("Ingrese el diametro del circulo: ");
                                double D = input.nextInt();
                                double PCirculo = PerimetroCo(D);
                                System.out.println("El perimetro del circulo es "+PCirculo);
                                System.out.println("");
                                continue;
                            }
                            case 5-> {
                                System.out.println("Ingrese un lado del pentagono: ");
                                double lado = input.nextInt();
                                double PPentagono = PerimetroP(lado);
                                System.out.println("El perimetro del pentagono es "+PPentagono);
                                System.out.println("");
                                continue;
                            }
                            default -> {
                                System.out.println("Ingrese una opcion valida");
                                System.out.println("");
                                continue;
                            }
                        }
                    } while (opci != 6);
                    continue;
                }
                case 3 -> {
                    int opci;
                    do {
                        System.out.println("-   MENU FIGURAS GEOMETRICAS: VOLUMENES   -");
                        System.out.println("Opcion 1: Cubo");
                        System.out.println("Opcion 2: Prisma");
                        System.out.println("Opcion 3: Piramide");
                        System.out.println("Opcion 4: Esfera");
                        System.out.println("Opcion 5: Cilindro");
                        System.out.println("Opcion 6: Salir.");
                        System.out.println("Escoge una opcion: ");
                        opci = input.nextInt();
                        switch (opci){
                            case 1-> {
                                VolumenC();
                                System.out.println("");
                                continue;
                            }
                            case 2-> {
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
                            case 3-> {
                                VolumenP();
                                System.out.println("");
                                continue;
                            }
                            case 4-> {
                                System.out.println("Ingrese el radio del circulo: ");
                                double radio = input.nextInt();
                                double VEsfera = VolumenE(radio);
                                System.out.println("El volumen de la esfera es "+VEsfera);
                                System.out.println("");
                                continue;
                            }
                            case 5-> {
                                VolumenCo();
                                System.out.println("");
                                continue;
                            }
                            default -> {
                                System.out.println("Ingrese una opcion valida");
                                System.out.println("");
                                continue;
                            }
                        }
                    } while (opci != 6);
                    continue;
                }
                default -> {
                    System.out.println("Digite una opcion valida");
                    System.out.println("");
                    continue;
                }
            }
        }while (opc != 4);
        input.close();
    }  
}