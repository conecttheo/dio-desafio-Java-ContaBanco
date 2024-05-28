import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Conhecer e importar a classe Scanner
         Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt(); //Obter pela scanner os valores digitados no terminal
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine(); //Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine(); //Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite o saldo da Conta!");
        saldo = scanner.nextDouble(); //Obter pela scanner os valores digitados no terminal

        // Exibindo a mensagem final
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", 
                          nomeCliente, agencia, numero, saldo);

        // Fechar o scanner
        scanner.close();

    }
}
