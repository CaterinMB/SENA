package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        /*int Valor = 3500, Rep = 5;
        System.out.println("El valor del ticket es: "+Valor);
        System.out.println("Las veces viajadas en metro son: "+Rep);
        int Total = Valor * Rep;
        System.out.println("El valor total a pagar es: "+Total); */
        
        Scanner input = new Scanner(System.in);
        
        /*System.out.println("Digite el peso en kg: ");
        float Peso = input.nextFloat();
        System.out.println("Digite la estatura en m: ");
        float Estatura = input.nextFloat();
        double Estatura2 = Math.pow(Estatura,2);
        double IMC = Peso/(Estatura2);
        System.out.println("El IMC es: "+IMC);
        input.close();*/
        
        /*System.out.println("Digite los dias trabajados: ");
        int Dia = input.nextInt();
        System.out.println("Digite el valor del dia: ");
        int Valor = input.nextInt();
        int Pago = Dia * Valor;
        System.out.println("El total de pago al empleado es: "+Pago);
        input.close();*/
        
        /*System.out.println("Digite cantidad del producto: ");
        int Cand = input.nextInt();
        System.out.println("Digite valor del producto: ");
        int Valor = input.nextInt();
        float Total1 = Valor * Cand;
        float Descuento = (float) (Total1 * 0.35);
        float Total = Total1 - Descuento;
        System.out.println("El total es: "+Total1+", con un descuento de: "+Descuento+", el total a pagar es: "+Total);
        input.close();*/
        
        /*System.out.println("Ingrese el # del dia empezando por lunes: ");
        int day = input.nextInt();
        switch (day){
            case 1 -> {
                System.out.println("Lunes");
                break;
            }
            case 2 -> {
                System.out.println("Martes");
                break;
            }
            case 3 -> {
                System.out.println("Miercoles");
                break;
            }
            case 4 -> {
                System.out.println("Jueves");
                break;
            }
            case 5 -> {
                System.out.println("Viernes");
                break;
            }
            case 6 -> {
                System.out.println("Sabado");
                break;
            }
            case 7 -> {
                System.out.println("Domingo");
                break;
            }
            default -> {
                System.out.println("Digite una opcion valida");
            }
        }
        input.close();*/
        
        /*System.out.println("Digite nota 1: ");
        float Nota1 = input.nextInt();
        System.out.println("Digite nota 2: ");
        float Nota2 = input.nextInt();
        System.out.println("Digite nota 3: ");
        float Nota3 = input.nextInt();
        System.out.println("Digite nota 4: ");
        float Nota4 = input.nextInt();
        System.out.println("Digite nota 5: ");
        float Nota5 = input.nextInt();
        float Prom = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5;
        if (Prom <= 3.9){
            System.out.println("El estudiante debe repetir con un promedio de "+Prom);
        }else {
            System.out.println("El estudiante NO debe repetir con un promedio de "+Prom);
        }
        input.close();*/
        
        /*System.out.println("Digite genero (Masculino o Femenino?): ");
        String Genero = input.next();
        Genero = Genero.toLowerCase();
        System.out.println("Digite edad: ");
        int Edad = input.nextInt();
        System.out.println("# de semanas cotizadas");
        int semanas = input.nextInt();
        System.out.println("Semanas cotizadas (Publica o Privada?)");
        String Estado = input.next();
        Estado = Estado.toLowerCase();
        if ("masculino".equals(Genero) && Edad >= 62 && semanas >= 1300 && "publica".equals(Estado)){
            System.out.println("Usted cumple con las condiciones para jubilarse");
        }else if ("masculino".equals(Genero) && Edad >= 62 && semanas >= 1150 && "privada".equals(Estado)){
            System.out.println("Usted cumple con las condiciones para jubilarse");
        }else if ("femenino".equals(Genero) && Edad >= 57 && semanas >= 1300 && "publica".equals(Estado)){
            System.out.println("Usted cumple con las condiciones para jubilarse");
        }else if ("femenino".equals(Genero) && Edad >= 57 && semanas >= 1150 && "privada".equals(Estado)){
            System.out.println("Usted cumple con las condiciones para jubilarse");
        }else {
            System.out.println("No es acto a jubilarse");
        }
        input.close();*/
        
        /*System.out.println("Opcion 1: Dolares a Peso Colombiano.");
        System.out.println("Opcion 2: Reales brasileros a peso colombiano.");
        System.out.println("Opcion 3: Euros a peso colombiano.");
        System.out.println("Opcion 4: Libra esterlina a peso colombiano.");
        System.out.println("Opcion 5: Lira turca a peso colombiano.");
        System.out.println("Ingrese el # de la opcion deseada ");
        int opc = input.nextInt();
        System.out.println("Digite la plata a convertir: ");
        int PC = input.nextInt();
        switch (opc){
            case 1 -> {
                int Conv = 4482 * PC;
                System.out.println("La conversion es: " + Conv + " pesos.");
                break;
            }
            case 2 -> {
                int Conv = 837 * PC;
                System.out.println("La conversion es: " + Conv + " pesos.");
                break;
            }
            case 3 -> {
                int Conv = 4535 * PC;
                System.out.println("La conversion es: " + Conv + " pesos.");
                break;
            }
            case 4 -> {
                int Conv = 5390 * PC;
                System.out.println("La conversion es: " + Conv + " pesos.");
                break;
            }
            case 5 -> {
                int Conv = 250 * PC;
                System.out.println("La conversion es: " + Conv + " pesos.");
                break;
            }
            default -> {
                System.out.println("Digite una opcion valida");
            }
        }
        input.close();*/
        
        /*System.out.println("Digite el numero de trimestre que desea visualizar: ");
        int tri = input.nextInt();
        switch (tri){
            case 1 -> {
                System.out.println("-Fundamentos de ficha +  Calidad 1.");
                System.out.println("-Algoritmos con python.");
                System.out.println("-BD Relacionales");
            }
            case 2 -> {
                System.out.println("-Java (POO + Web.)");
                System.out.println("-CSS, HTML.");
                System.out.println("-Requisitos.");
            }
            case 3 -> {
                System.out.println("-Analisis + Refinamiento de requisitos.");
                System.out.println("-PHP.");
                System.out.println("-JavaScript.");
            }
            case 4 -> {
                System.out.println("-Modelado de artefactos. ");
                System.out.println("-BD NoSQL + Node JS.");   
            }
            case 5 -> {
                System.out.println(".Net.");
                System.out.println("Moviles (Nativo e Hibrido).");
            }
            case 6 -> {
                System.out.println("-Proyecto 1 + Manual tecnico + Calidad 2");
                System.out.println("-Python (Machine Learning + Big Data) .");
                System.out.println("-Negociacion.");
            }
            case 7 -> {
                System.out.println("-Proyecto 2 + Calidad 3.");
                System.out.println("-Pruebas + Implantacion.");
                System.out.println("-Manuales + Capacitacion.");
            }
            default -> {
                System.out.println("Digite un trimestre valido");
            }
        }
        input.close();*/
        
        /*System.out.println("Ingrese el dia de la semana:");
        String Dia = input.next();
        Dia = Dia.toUpperCase();
        switch (Dia){
            case "LUNES" -> {
                System.out.println("Feliz inicio de semana.");               
            }
            case "MARTES" , "MIERCOLES" , "JUEVES" -> {
                System.out.println("Trbajando fuertemente.");
            }
            case "VIERNES" -> {
                System.out.println("Iniciando el find e semana.");
            }
            case "SABADO" , "DOMINGO" -> {
                System.out.println("Feliz fin de semana.");
            }
            default -> {
                System.out.println("Digito un dia no valido");
            }
        }
        input.close();*/
        
        /*System.out.println("Digite cuantas marcas desea ingresar: ");
        int marcas = input.nextInt();
        int x = 0;
        double max = 0; double min = 1000; double suma = 0;
        while (x <= marcas){
            System.out.println("Digite la marca: (En Minutos) ");
            double y = input.nextDouble();
            suma += y;
            if (y > max){
                max = y;
            } else if (y < min){
                min = y;
            }else {
                System.out.println("");
            }
            x++;
        }
        double prom = suma / marcas;
        System.out.println("La marca maxima es: "+ max);
        System.out.println("La marca minima es: "+ min);
        System.out.printf("El promedio de marcas es: %.2f %n"+prom);
        input.close();*/
        
        float suma = 0;
        while (true){
            System.out.println("Digite un numero: ");
            float num = input.nextFloat();
            if (num == 0){
                break;
            }
            suma += num;
        }
        System.out.printf("La sumatoria es: %.2f %n" + suma);
    }
}