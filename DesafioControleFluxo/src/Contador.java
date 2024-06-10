import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = leitor.nextInt();
        System.out.println("Digite segundo parâmetro: ");
        int parametroDois = leitor.nextInt();

        try {
            contar (parametroUm, parametroDois);

        }catch (InvalidParameterException e) {
            System.out.println(e.getMessage());

        }
    }
    static void contar(int parametroUm, int parametroDois) throws InvalidParameterException {
        if (parametroUm > parametroDois) {
            throw new InvalidParameterException("O Segundo parâmetro deve ser maior que o primeiro.");

        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }


    }
}
