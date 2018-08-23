package elizadora;
import java.util.Scanner;
public class Questao3 {
    public static void main(String[]args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o valor de a:");
        int a = tcl.nextInt();
        System.out.println("Digite o valor de b:");
        int b = tcl.nextInt();
        System.out.println("Digite o valor de c:");
        int c = tcl.nextInt();
        int delta = b * b -4 * a * c;
        if (delta > 0) {
            System.out.println("Seu delta é "+ delta);
        } else if (delta < 0){
            System.out.println("Seu delta é negativo");
        } else {
            System.out.println("Seu delta é igual a zero.");
        }
        int x1 = (int) (-b - Math.sqrt(delta)/2);
        int x2 = (int) (-b + Math.sqrt(delta)/2);
        System.out.println("O x1 é "+ x1);
        System.out.println("O x2 é "+ x2);
        
    }
}
