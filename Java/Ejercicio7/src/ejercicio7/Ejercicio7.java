package ejercicio7;
import javax.swing.JOptionPane;
public class Ejercicio7 {
    public static void main(String[] args) {
        String[] botones = {"Area", "Perimetro", "Volumen"};
        int opc = JOptionPane.showOptionDialog(null, "Que opcion desea realizar en el TRIANGULO? ", "Opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        switch (opc){
            case 0 -> {
                String base = JOptionPane.showInputDialog(null, "Digite la base: ");
                float B = Float.parseFloat(base);
                String Altura = JOptionPane.showInputDialog(null, "Digite la altura: ");
                float H = Float.parseFloat(Altura);
                float Area = (B*H)/2;
                JOptionPane.showMessageDialog(null, "Bienvenid@, el resultado es: "+Area, "AREA", 1);
            }
            case 1 -> {
                String base = JOptionPane.showInputDialog(null, "Digite la base: ");
                float B = Float.parseFloat(base);
                String Lado1 = JOptionPane.showInputDialog(null, "Digite lado 1: ");
                float L1 = Float.parseFloat(Lado1);
                String Lado2 = JOptionPane.showInputDialog(null, "Digite lado 2: ");
                float L2 = Float.parseFloat(Lado2);
                float Perimetro = B + L1 + L2;
                JOptionPane.showMessageDialog(null, "Bienvenid@, el resultado es: "+Perimetro, "PERIMETRO", 1);
            }
            case 2 -> {
                String base = JOptionPane.showInputDialog(null, "Digite la base: ");
                float B = Float.parseFloat(base);
                String Altura = JOptionPane.showInputDialog(null, "Digite la altura: ");
                float H = Float.parseFloat(Altura);
                float Volumen = (((B*H)/2)*H)/3;
                JOptionPane.showMessageDialog(null, "Bienvenid@, el resultado es: "+Volumen, "VOLUMEN", 1);
            }
            default -> {
                System.out.println("Digite una opcion no valida");
            }
        }
    }
}