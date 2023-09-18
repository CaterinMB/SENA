package Bancolombia;
import java.util.*;
import Bancolombia.CBanco.*;
public class MBanco {
    
    public static void Registro(ArrayList<CBanco> Cuentas){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el documento: ");
        Integer documento = input.nextInt();
        System.out.println("Ingrese nombre y apellidos: ");
        String nombre = input.next();
        System.out.println("Ingrese el saldo de la cuenta: ");
        int saldo = input.nextInt();
        CBanco Cbanco = new CBanco(documento, nombre, saldo);
        Cuentas.add(Cbanco);
        String Muestra = Cbanco.toString();
        System.out.println(Muestra);
    }
    
    public static void Mostrar(ArrayList<CBanco> Cuentas){
        for (int num = 0; num < Cuentas.size(); num++){
            String Muestra = Cuentas.get(num).toString();
            System.out.println("Cuenta No. "+(num+1)+"\n"+Muestra);
        }
    }
    
    public static void Transferir(ArrayList<CBanco> Cuentas){
        Scanner input = new Scanner(System.in);
        String Muestra = Cuentas.toString();
        System.out.println(Muestra);
        System.out.println("Ingrese cedula");
        int conf = input.nextInt();
        for (int cont = 0; cont < Cuentas.size(); cont++){
            if (Cuentas.get(cont).getDocumento()== conf){
                System.out.println("Ingrese la cedula de la otra cuenta: ");
                int ced = input.nextInt();
                System.out.println("Ingrese el valor a transferir: ");
                int trans = input.nextInt();
                int sldN = Cuentas.get(cont).getSaldo() - trans;
                Cuentas.get(cont).setSaldo(sldN);
                System.out.println("El saldo es: "+Cuentas.get(cont).getSaldo());
                for (int conta = 0; conta < Cuentas.size(); conta++){
                    if (Cuentas.get(conta).getDocumento()== ced){
                        int Nsld = Cuentas.get(conta).getSaldo() + trans;
                        Cuentas.get(conta).setSaldo(Nsld);
                        System.out.println("El nuevo saldo total es: "+Cuentas.get(conta).getSaldo());
                    }
                }
            }
        }
        System.out.println(Muestra);
    }
    
    public static void Actualizar(ArrayList<CBanco> Cuentas){
        Scanner input = new Scanner(System.in);
        System.out.println("Que desea actualizar?: ");
        System.out.println("""
                           1: Documento.
                           2: Nombre.
                           3. Saldo.
                           """);
        System.out.println("Escoja una opcion");
        int opc = input.nextInt();
        switch (opc){
            case 1 -> {
                System.out.println("Ingrese cedula");
                int conf = input.nextInt();
                for (int cont = 0; cont < Cuentas.size(); cont++){
                    if (Cuentas.get(cont).getDocumento()== conf){
                        System.out.println("Ingrese cedula nueva");
                        int doc = input.nextInt();
                        Cuentas.get(cont).setDocumento(doc);
                    }
                }
            }
            case 2 -> {
                System.out.println("Ingrese nombre");
                String conf = input.next();
                for (int cont = 0; cont < Cuentas.size(); cont++){
                    if (Cuentas.get(cont).getNombre()== conf){
                        System.out.println("Ingrese nombre nuevo");
                        String nom = input.next();
                        Cuentas.get(cont).setNombre(nom);
                    }
                }
            }
            case 3 -> {
                System.out.println("Ingrese saldo. ");
                int conf = input.nextInt();
                for (int cont = 0; cont < Cuentas.size(); cont++){
                    if (Cuentas.get(cont).getSaldo()== conf){
                        System.out.println("Ingrese saldo nueva");
                        int sld = input.nextInt();
                        Cuentas.get(cont).setSaldo(sld);
                    }
                }
            }
            default -> System.out.println("Ingreso una opcion no valida");
        }
    }
    
    public static void Eliminar(ArrayList<CBanco> Cuentas){
        Scanner input = new Scanner(System.in);
        String Muestra = Cuentas.toString();
        System.out.println(Muestra);
        System.out.println("Ingrese cedula");
        int conf = input.nextInt();
        for (int cont = 0; cont < Cuentas.size(); cont++){
            if (Cuentas.get(cont).getDocumento()== conf){
                Cuentas.remove(cont);
            }
        }
        System.out.println(Muestra);
    }
}
