package AgenciaTelefonica;
import java.util.*;
import AgenciaTelefonica.CAgencia.*;
public class MAgencia {
    
    public static void Registro(ArrayList<CAgencia> Telefonos){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nom = input.next();
        String nombre = nom.toLowerCase();
        System.out.println("Ingrese la ciudad: ");
        String cdd = input.next();
        String ciudad = cdd.toLowerCase();
        System.out.println("Ingrese el telefono: ");
        String telefono = input.next();
        System.out.println("Ingrese el codigo postal: ");
        String cbarrio = input.next();        
        try {
            Integer tel = Integer.parseInt(telefono);
            Integer cod = Integer.parseInt(cbarrio);
            CAgencia Agencia = new CAgencia(nombre, ciudad, tel, cod);
            Telefonos.add(Agencia);
            String Muestra = Agencia.toString();
            System.out.println(Muestra);
        }catch (InputMismatchException ex){
            System.out.println("NO es un telefono sino un celular. Debe ingresar telefono. Error "+ex.getMessage());
        }catch (NumberFormatException ex){
            System.out.println("Solo se permiten numeros. Error "+ex.getMessage());
        }finally {
            System.out.println("Fin del procesos. ");
        }
    }
    
    public static void Mostrar(ArrayList<CAgencia> Telefonos){
        for (int num = 0; num < Telefonos.size(); num++){
            String Muestra = Telefonos.get(num).toString();
            System.out.println("Cuenta Telefonica No. "+(num+1)+"\n"+Muestra);
        }
    }
    
    public static void Actualizar(ArrayList<CAgencia> Telefonos){
        Scanner input = new Scanner(System.in);
        System.out.println("Que desea actualizar?: ");
        System.out.println("""
                           1: Nombre.
                           2: Telefono.
                           3. Codigo Postal.
                           4. Ciudad.
                           """);
        System.out.println("Escoja una opcion");
        int opc = input.nextInt();
        switch (opc){
            case 1 -> {
                System.out.println("Ingrese nombre: ");
                String nombre = input.next();
                String conf = nombre.toLowerCase();
                for (int cont = 0; cont < Telefonos.size(); cont++){
                    if (Telefonos.get(cont).getNombre()== conf){
                        System.out.println("Ingrese nombre nuevo");
                        String nom = input.next();
                        Telefonos.get(cont).setNombre(nom);
                    }
                    else {
                        System.out.println("El nombre que ingreso no esta registrado");
                    }
                }
            }
            case 2 -> {
                System.out.println("Ingrese telefono: ");
                String x = input.next();
                try {
                    Integer conf = Integer.parseInt(x);
                    for (int cont = 0; cont < Telefonos.size(); cont++){
                        if (Telefonos.get(cont).getTelefono()== conf){
                            System.out.println("Ingrese telefono nueva");
                            int tel = input.nextInt();
                            Telefonos.get(cont).setTelefono(tel);
                        }else {
                            System.out.println("El telefono que ingreso no esta registrado");
                        }
                    }
                }catch (InputMismatchException ex){
                    System.out.println("NO es un telefono sino un celular. Debe ingresar telefono. Error "+ex.getMessage());
                }catch (NumberFormatException ex){
                    System.out.println("Solo se permiten numeros. Error "+ex.getMessage());
                } finally {
                    System.out.println("Fin del proceso. ");
                }
            }
            case 3 -> {
                System.out.println("Ingrese codigo postal: ");
                String y = input.next();
                try {
                    Integer conf = Integer.parseInt(y);
                    for (int cont = 0; cont < Telefonos.size(); cont++){
                        if (Telefonos.get(cont).getCBarrio()== conf){
                            System.out.println("Ingrese nuevo codigo postal: ");
                            int cpl = input.nextInt();
                            Telefonos.get(cont).setTelefono(cpl);
                        }else {
                            System.out.println("El codigo postal que ingreso no esta registrado");
                        }
                    }
                }catch (InputMismatchException ex){
                    System.out.println("NO es un telefono sino un celular. Debe ingresar telefono. Error "+ex.getMessage());
                }catch (NumberFormatException ex){
                    System.out.println("Solo se permiten numeros. Error "+ex.getMessage());
                } finally {
                    System.out.println("Fin del proceso. ");
                }
                
            }
            case 4 -> {
                System.out.println("Ingrese ciudad: ");
                String ciu = input.next();
                String conf = ciu.toLowerCase();
                for (int cont = 0; cont < Telefonos.size(); cont++){
                    if (Telefonos.get(cont).getCiudad()== conf){
                        System.out.println("Ingrese ciudad nueva: ");
                        String cdd = input.next();
                        Telefonos.get(cont).setNombre(cdd);
                    }else {
                        System.out.println("La ciudad que ingreso no esta registrada");
                    }
                }
            }
            default -> System.out.println("Ingreso una opcion no valida");
        }
    }
    
    public static void Eliminar(ArrayList<CAgencia> Telefonos){
        Scanner input = new Scanner(System.in);
        String Muestra = Telefonos.toString();
        System.out.println(Muestra);
        System.out.println("Ingrese telefono: ");
        int conf = input.nextInt();
        for (int cont = 0; cont < Telefonos.size(); cont++){
            if (Telefonos.get(cont).getTelefono()== conf){
                Telefonos.remove(cont);
            }else {
                System.out.println("El telefono que ingreso no esta registrado");
            }
        }
        System.out.println(Muestra);
    }
}
