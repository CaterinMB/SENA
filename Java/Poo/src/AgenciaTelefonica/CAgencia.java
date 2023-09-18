package AgenciaTelefonica;
public class CAgencia {
    private String nombre;
    private String ciudad;
    private Integer telefono;
    private Integer cbarrio;

    public CAgencia(String nombre, String ciudad, Integer telefono, Integer cbarrio) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.cbarrio = cbarrio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getCBarrio() {
        return cbarrio;
    }
    public void setCBarrio(Integer CBarrio) {
        this.cbarrio = CBarrio;
    }
    
    @Override
    public String toString() {
        StringBuilder Mensaje = new StringBuilder();
        Mensaje.append("\nUsuario: ");
        Mensaje.append(nombre);
        Mensaje.append("\nTelefono: :");
        Mensaje.append(telefono);
        Mensaje.append("\nCodigo Postal: :");
        Mensaje.append(cbarrio);
        Mensaje.append("\nCiudad: ");
        Mensaje.append(ciudad);
        Mensaje.append("\n");
        return Mensaje.toString();
    }
}
