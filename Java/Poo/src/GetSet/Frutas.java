package GetSet;
public class Frutas {
    private String nombre;
    private Integer precioC;
    private Integer preciosV;
    private Integer total;

    public Frutas() {
        this.precioC = 3000;
        this.preciosV = 500;
    }
    
    public String getNombre() {
        return nombre;
    }
    public Integer getPrecioC(){
        return precioC;
    }
    public Integer getPreciosV(){
        return preciosV;
    }
    public Integer getTotal(){
        return total;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecioC(int precioc){
        this.precioC = precioc;
    }
    public void setPreciosV(int preciov){
        this.preciosV = preciov;
    }
    public void setTotal(int total){
        this.total = total;
    }
    
    
}
