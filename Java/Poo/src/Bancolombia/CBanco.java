package Bancolombia;

public class CBanco {
    private Integer documento;
    private String nombre;
    private Integer saldo;

    public CBanco(Integer documento, String nombre, Integer saldo) {
        this.documento = documento;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Integer getDocumento() {
        return documento;
    }
    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getSaldo() {
        return saldo;
    }
    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }  

    @Override
    public String toString() {
        StringBuilder Banco = new StringBuilder();
        Banco.append("\nNª Documento: ");
        Banco.append(documento);
        Banco.append("\nUsuario: ");
        Banco.append(nombre);
        Banco.append("\nSaldo: :");
        Banco.append(saldo);
        Banco.append("\n");
        return Banco.toString();
    }
}
