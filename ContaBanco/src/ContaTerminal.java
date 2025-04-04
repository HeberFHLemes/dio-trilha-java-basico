import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem vindo ao Banco DIO!");

        System.out.println("Para cadastrar uma nova conta, responda às perguntas a seguir.");

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("\nDigite o seu nome completo: ");
            String nome = scanner.nextLine().toUpperCase();

            System.out.println("Digite o número da agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Agência: ");
            int numero = Integer.parseInt(scanner.nextLine());

            System.out.println("Por último, insira o valor do saldo inicial da sua nova conta: ");
            double saldo = Double.parseDouble(scanner.nextLine());

            System.out.println("\nOlá " + nome 
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
                + ", conta " + numero 
                + " e seu saldo " + saldo + " já está disponível para saque. \n");
        }
    }
}
