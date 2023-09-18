package poo;
//import java.util.*;
public class Auto {//clase del auto
    String nombre;
    int modelo;
    
    public Auto(String nomAuto, int modAuto) {
        nombre = nomAuto;
        modelo = modAuto;
    }
    public static void main(String[] args) {
        //objetivos
        Auto mazda = new Auto("Mazda", 2006);
        Auto toyota = new Auto("Toyata", 2022);
        Auto suzuki = new Auto("Suzuki", 2015);
        
        System.out.println("Soy un: "+mazda.nombre+" y esta : "+mazda.modelo);
        System.out.println("Soy un: "+toyota.nombre+" y esta : "+toyota.modelo);
        System.out.println("Soy un: "+suzuki.nombre+" y esta: "+suzuki.modelo);
    }
}

//    static void registroAuto (int opc){
//        Scanner input = new Scanner(System.in);
//        if (opc == 1){
//            Auto mazda = new Auto();
//            System.out.println("Propietario del Auto: ");
//            mazda.propietario = input.nextLine();
//            System.out.println("Color del Auto: ");
//            mazda.color = input.nextLine();
//            mazda.nombre = "Mazda";
//            System.out.println("Registro exitoso del auto "+mazda.nombre+" color "+mazda.color+" de: "+mazda.propietario );
//            mazda.salidaAuto(mazda.propietario);
//        }else if(opc == 2){
//            Auto toyota = new Auto();
//            System.out.println("Propietario del Auto: ");
//            toyota.propietario = input.nextLine();
//            System.out.println("Color del Auto: ");
//            toyota.color = input.nextLine();
//            toyota.nombre = "Toyota";
//            System.out.println("Registro exitoso del auto "+toyota.nombre+" color "+toyota.color+" de: "+toyota.propietario );
//            toyota.salidaAuto(toyota.propietario);
//        }else if(opc == 3){
//            Auto suzuki = new Auto();
//            System.out.println("Propietario del Auto: ");
//            suzuki.propietario = input.nextLine();
//            System.out.println("Color del Auto: ");
//            suzuki.color = input.nextLine();
//            suzuki.nombre = "Suzuki";
//            System.out.println("Registro exitoso del auto "+suzuki.nombre+" color "+suzuki.color+" de: "+suzuki.propietario);
//            suzuki.salidaAuto(suzuki.propietario);
//        }
//    }
//    public void salidaAuto (Object carro){
//        System.out.println("El auto de: "+carro+" ha salido del Cocesionario ... Runnn");
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Sistema de Compras de Autos");
//        System.out.println("Cual auto desea Comprar: 1.Mazda o 2.Toyota o 3.Suzuki");
//        int opc = input.nextInt();
//        registroAuto(opc);
//    }