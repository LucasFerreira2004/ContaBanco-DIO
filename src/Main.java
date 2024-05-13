import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();
        System.out.println("Digite o número da conta:");
        conta.numero = sc.nextInt();
        System.out.println("Digite o número da agência:");
        conta.agencia = sc.next();
        System.out.println("Digite o seu nome:");
        conta.nomeCliente = sc.next();
        System.out.println("Digite o seu saldo::");
        conta.saldo = sc.nextDouble();
        System.out.println("Olá "+conta.nomeCliente+" obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+conta.agencia+", conta "+conta.numero+" e seu saldo "+conta.saldo+" já está disponível para saque");
    }
}