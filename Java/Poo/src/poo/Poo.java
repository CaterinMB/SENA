package poo;
public class Poo {
    //ATRIBUTOS
    String nombre;
    String apellido;
    Integer edad;
    String ciudad;
    public static void main(String[] args) {
        //OBJETOS
        Poo Estudiante = new Poo();
        Poo Profesor = new Poo();
        Poo Administrativo = new Poo();
        //CARACTERISTICAS
        Estudiante.nombre = "Caterin";
        Estudiante.apellido = "Badillo";
        Estudiante.edad = 17;
        Estudiante.ciudad = "Bogota";
        
        Profesor.nombre = "Alvaro";
        Profesor.apellido = "Perez";
        Profesor.edad = 36;
        Profesor.ciudad = "Medellin";

        Administrativo.nombre = "Luis";
        Administrativo.apellido = "Montiel";
        Administrativo.edad = 18;
        Administrativo.ciudad = "Montelibano";
                
        //MOSTRAR EN PANTALLA
        System.out.println("Estudiante: El nombre es "+Estudiante.nombre+", el apellido es "+Estudiante.apellido+", la edad es "+Estudiante.edad+" y es de la ciudad " + Estudiante.ciudad);
        System.out.println("Profesor: El nombre es "+Profesor.nombre+", el apellido es "+Profesor.apellido+", la edad es "+Profesor.edad+" y es de la ciudad " + Profesor.ciudad);
        System.out.println("Administrador: El nombre es "+Administrativo.nombre+", el apellido es "+Administrativo.apellido+", la edad es "+Administrativo.edad + " y es de la ciudad " + Administrativo.ciudad);
    }
}
