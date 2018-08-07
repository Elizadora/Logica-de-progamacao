import java.util.Scanner;
public class ins {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int vet[] = new int [5];
        int aux;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = tcl.nextInt();
        }
        
        for (int i = 0; i < vet.length; i++) {
            for (int j = 1; j < vet.length; j++) {
                while (vet[j] < vet[j - 1] && j > 0) {
                    aux = vet[j];
                    vet[j] = vet[j - 1];
                    vet[j - 1] = aux;
                }      
            }
        }
        
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
