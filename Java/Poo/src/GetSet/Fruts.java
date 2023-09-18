package GetSet;
import java.util.Scanner;
import static GetSet.MFruta.*;
public class Fruts {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sistema de Compras de Frutas");
        System.out.println("Cual fruta desea Comprar: 1.Manzana o 2.Cereza o 3.Fresa");
        int opc = input.nextInt();
        registroFruta(opc);
    }
}
