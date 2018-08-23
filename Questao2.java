package elizadora;
import java.util.Scanner;
public class Questao2 {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int i = tcl.nextInt();
        System.out.println("Digite o segundo valor:");
        int j = tcl.nextInt();
        while (i < j - 1) {
            i++;
            System.out.println(i);
        }
        while (i - 1> j) {
            j++;
            System.out.println(j);
        }
    }
}
