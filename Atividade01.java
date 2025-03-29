import java.util.Scanner;

public class Atividade01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        try {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            System.out.printf("O número digitado foi: %d%n", numero);
        } catch (Exception e) {
            System.out.println("Erro: Digite apenas números inteiros!");
        } finally {
            sc.close();
        }
    }
} 
