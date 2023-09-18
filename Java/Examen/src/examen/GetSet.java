package examen;
public class GetSet {
    private String nombrep;
    private double precio;
    private String color;
    private int kilowatts;
    private double peso;

    public GetSet(String nombrep, double precio, String color, int kilowatts, double peso) {
        this.nombrep = nombrep;
        this.precio = precio;
        this.color = color;
        this.kilowatts = kilowatts;
        this.peso = peso;
    }

    public String getNombrep() {
        return nombrep;
    }
    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getKilowatts() {
        return kilowatts;
    }
    public void setKilowatts(int kilowatts) {
        this.kilowatts = kilowatts;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        StringBuilder Informacion = new StringBuilder();
        Informacion.append("\nNombre del producto: ");
        Informacion.append(nombrep);
        Informacion.append("\nColor del producto: ");
        Informacion.append(color);
        Informacion.append("\nPeso del producto: ");
        Informacion.append(peso+"Kg");
        Informacion.append("\nConsumo del producto: ");
        Informacion.append(kilowatts+"kW");
        Informacion.append("\nprecio del producto: ");
        Informacion.append(precio);
        Informacion.append("\n");
        return Informacion.toString();
    }
}
