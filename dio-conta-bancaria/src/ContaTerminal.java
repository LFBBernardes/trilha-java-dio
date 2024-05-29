import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Olá, seja bem vindo ao banco DIO!");
         
         System.out.println("Por favor, digite o número da conta:");
         int numeroConta = scanner.nextInt();
         scanner.nextLine();
         System.out.println("Por favor, digite o número da Agência:");
         String numeroAgencia = scanner.nextLine();
         System.out.println("Por favor, digite o nome do cliente:");
         String nomeCliente = scanner.nextLine();
         System.out.println("Por favor, digite o saldo:");
         double saldoConta = scanner.nextDouble();

         scanner.close();

         System.out.println("Perfeito! Olá senhor(a) " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já esta disponível para saque");
    }       
}
