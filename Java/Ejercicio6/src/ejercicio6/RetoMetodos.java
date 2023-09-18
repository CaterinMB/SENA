package ejercicio6;
import java.util.*;
import static ejercicio6.MetodosReto.*;
public class RetoMetodos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opc;
        do{
            System.out.println("Opcion 1: Promedio de notas");
            System.out.println("Opcion 2: Area y perimetro de un rombo");
            System.out.println("Opcion 3: Dibujar un trangulo");
            System.out.println("Opcion 4: Para mostrar la fecha y hora actual");
            System.out.println("Opcion 5: Para salir");
            System.out.println("Escoge una opcion: ");
            opc = input.nextInt();
            switch(opc){
                case 1 -> {
                    Promedio();
                    System.out.println("");
                    continue;
                }
                case 2 -> {
                    System.out.println("Ingrese diametro mayor: ");
                    double d1 = input.nextFloat();
                    System.out.println("Ingrese diametro menor");
                    double d2 = input.nextFloat();
                    System.out.println("Ingrese uno de los lados");
                    double lado = input.nextFloat();
                    double Area = AreaR(d1, d2);
                    double Perimetro = PerimetroR(lado);
                    System.out.println("El area del rombo es: "+Area);
                    System.out.println("El perimetro de rombo es: "+Perimetro);
                    System.out.println("");
                    continue;
                }
                case 3 -> {
                    Triangulo();
                    System.out.println("");
                    continue;
                }
                case 4 -> {
                    String voto;
                    do {
                        System.out.println("Ingrese su voto: Rojo o Verde o Azul. Balnco para salir ");
                        voto = input.next();
                        voto = voto.toLowerCase();
                        
                    }while (voto != "blanco");
                    System.out.println("");
                    continue;
                }
                default -> {
                    System.out.println("Digite una opcion valida");
                    System.out.println("");
                    continue;
                }
            }
        }while(opc != 5);
        input.close();
    }
}