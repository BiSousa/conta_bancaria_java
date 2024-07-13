
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("----- Bem-vindo a conta bancária -----");
        System.out.print("Conta: ");
        String conta = scanner.next();

        System.out.print("Agência: ");
        String agencia = scanner.next();

        System.out.print("Cliente: ");
        String cliente = scanner.next();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
