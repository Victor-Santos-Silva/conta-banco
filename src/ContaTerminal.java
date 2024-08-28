import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // pegar os dados via terminal
        Scanner sc = new Scanner(System.in);

        // objeto cliente
        DadosCliente cliente = new DadosCliente();

        System.out.println("Bem vindo ao Banco !!");
        System.out.println("");

        System.out.println("Digite a sua agencia: ");
        cliente.agencia = sc.next();

        System.out.println("Digite a sua conta: ");
        cliente.conta = sc.nextInt();

        System.out.println(
                "Olá " + cliente.nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente.agencia +
                ", conta " + cliente.conta +
                " e seu saldo é de " + cliente.saldo +
                " e já está disponível para saque."
                );
    }
}
