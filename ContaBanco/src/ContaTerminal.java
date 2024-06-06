import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: (1234) ");
        int numero = leitor.nextInt();

        System.out.println("Digite o numero da agencia: (123-4)");
        String agencia = leitor.next();

        System.out.println("Digite Seu nome: (abc)");
        String nomeCliente = leitor.next();

        System.out.println("Digite seu saldo atual: (123,45)");
        double saldo = leitor.nextDouble();

       
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque\".", nomeCliente, agencia, numero, saldo);

        leitor.close();
    }
}
