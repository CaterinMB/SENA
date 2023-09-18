package GetSet;
public class Ejemplo1 {
    private String nombre;
    private Integer edad;
    private String estado;
    
    public String getNombre(){
        return nombre;
    }
    public Integer getEdad(){
        return edad;
    }
    public String getEstado(){
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
