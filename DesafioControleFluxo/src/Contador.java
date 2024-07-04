import java.util.Scanner;

/** @author Édimo Miranda Coelho
 *  @since 07/2024
 * 
 */

// a classe ParametrosInvalidosException representa a exceção de negócio no sistema
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro.");
    }
}

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminalScanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = terminalScanner.nextInt();
            System.out.println("Digite o segundo parâmetro:");
            int parametroDois = terminalScanner.nextInt();

            try {
                // Chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                // Imprimir a mensagem da exceção
                System.out.println(e.getMessage());
            }
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o loop para imprimir os números com base na variável contagem
        for (int i = 0; i <= contagem; i++) {
            System.out.println(contagem + i);
        }
    }
}
