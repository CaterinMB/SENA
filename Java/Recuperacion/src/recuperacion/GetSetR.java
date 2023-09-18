package recuperacion;
public class GetSetR {
    private String marca;
    private double modelo;
    private String color;
    private String referencia;
    private double precio;

    public GetSetR(String marca, double modelo, String color, String referencia, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.referencia = referencia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getModelo() {
        return modelo;
    }
    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getReferencia() {
        return referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        StringBuilder Informacion = new StringBuilder();
        Informacion.append("\nMarca del celular: ");
        Informacion.append(marca);
        Informacion.append("\nColor del celular: ");
        Informacion.append(color);
        Informacion.append("\nModelo del celular: ");
        Informacion.append(modelo);
        Informacion.append("\nReferencia del celular: ");
        Informacion.append(referencia);
        Informacion.append("\nPrecio del celular: ");
        Informacion.append(precio);
        Informacion.append("\n");
        return Informacion.toString();
    }
}
