package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.println("Digite o numero da sua conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Por favor, digite o seu saldo: ");
        float seuSaldo = sc.nextFloat();

        String mensagem = ("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", conta " + numeroDaConta + " e seu saldo R$" + seuSaldo + " já está disponível para saque.");
        System.out.println(mensagem);

        sc.close();

    }
}
