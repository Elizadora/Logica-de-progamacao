package elizadora;
import java.util.Scanner;
public class Questao1 {
    public static void main(String[]args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int a = tcl.nextInt();
        System.out.println("Digite o segundo valor:");
        int b = tcl.nextInt();
        if (a < b) {
            System.out.println("O maior é" + b + "\n" + "O menor é" + a);
        } else if (a > b) {
            System.out.println("O maior é" + a + "\n" + "O menor é" + b);
        } else {
            System.out.println("São iguais");
        }
    }
}
