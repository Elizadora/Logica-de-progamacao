package elizadora;
import java.util.Scanner;
public class Questao4 {
    public static void main(String[]args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tam = tcl.nextInt();
        int vet[] = new int [tam];
        int aux = 0;
        System.out.println("Deseja ordenar de formar cresecente(0) ou decrescente(1) ?");
        int opcao = tcl.nextInt();
        if (opcao == 0) {
            for (int i = 0; i < vet.length; i++) {
                vet[i] = tcl.nextInt();
            }
            for (int i = 0; i < vet.length; i++) {
                for (int j = 0; j < vet.length; j++) {
                    if (vet[i] < vet[j]) {
                        aux = vet[j];
                        vet[j] = vet[i];
                        vet[i] = aux;
                    }
                }
            }
        } else if (opcao == 1) {
            for (int i = 0; i < vet.length; i++) {
                vet[i] = tcl.nextInt();
            }
            for (int i = 0; i < vet.length; i++) {
                for (int j = 0; j < vet.length; j++) {
                    if (vet[i] < vet[j]) {
                        aux = vet[j];
                        vet[j] = vet[i];
                        vet[i] = aux;
                    }
                }
            }
        }
    }
}
