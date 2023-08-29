import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Numero;
        double Saldo = 237.48;
        String NomeCliente, Agencia;

        System.out.println("Por favor, digite o seu nome: ");
        NomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite a Agência: ");
        Agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        Numero = sc.nextInt();

        System.out.println("Olá, " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo R$ " + Saldo + " já está disponível para saque.");

        
    }
    
}
