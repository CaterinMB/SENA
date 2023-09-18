package trabajojava;
import java.util.*;
public class Item2 {
    static void Imprimir(int Min, int Max, int VTotal, ArrayList<String> Programas, ArrayList<Integer> Creditos, ArrayList<Integer> Semestre, ArrayList<Integer> ValorC){
        System.out.println("Numero de estudiantes ingresados: "+Programas.size());
        System.out.println("Los programas son: "+Programas);
        System.out.println("Los semestres son: "+Semestre);
        System.out.println("Los creditos son: "+Creditos);
        System.out.println("La matricula mayor es: "+Max);
        System.out.println("La matricula menor es: "+Min);
        System.out.println("El total recaudado es "+ VTotal);  
    }
            
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<String> Programas= new ArrayList<>();
        ArrayList<Integer> Creditos= new ArrayList<>();
        ArrayList<Integer> Semestre= new ArrayList<>();
        ArrayList<Integer> ValorC= new ArrayList<>();
        int NumCredito = 0, VCredito = 0, VTotal = 0, Min = 10000000, Max = 0;
        boolean con = true;
        while (con = true){
            System.out.println("Digite el programa: ");
            String programa = input.next();
            System.out.println("Digite el semestre");
            int semestre = input.nextInt();
            System.out.println("Digite el numero de creditos: ");
            int credito = input.nextInt();
            Programas.add(programa);
            Semestre.add(semestre);
            Creditos.add(credito);
            for (int y = 0; y < NumCredito; y++){
                if (NumCredito < 18){
                    VCredito += 35000;
                }else if (NumCredito > 17){
                    VCredito += 15000;
                }
            }
            ValorC.add(VCredito);
            for(int Reco : ValorC){
                VTotal += Reco;
                if(Reco<Min){
                    Min = Reco;
                }else if(Reco > Max){
                    Max = Reco;
                }
            }
            System.out.println("Dese ingresra otro cliente? ");
            String resp = input.next();
            String res = resp.toLowerCase();
            if ("si".equals(res)){
                con = true;
            }else if ("no".equals(res)){
                con = false;
            }else {
                System.out.println("Ingreso una opcion erronea. ");
            }
        }
        Imprimir(Min, Max, VTotal, Programas, Creditos, Semestre, ValorC);      
    }
}
