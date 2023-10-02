import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem-vindo(a)!");
        System.out.println("Por favor, insira os seguintes dados para continuar.");
        Scanner teclado = new Scanner(System.in);

        int saldo = 400;
        int numeroConta = 0;
        
        System.out.print("Digite o número: ");
        numeroConta = teclado.nextInt();
        
        System.out.print("Número da agência: ");
        String numeroAgencia = teclado.next();

        teclado.nextLine();
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("");
        System.out.println("===========================================================");
        System.out.println("Olá " + nome + ",");
        System.out.printf("obrigado por criar uma conta em nosso banco!\nAGÊNCIA: %s\nCONTA: %d\nSALDO: R$ %d", numeroAgencia, numeroConta, saldo);
        System.out.println("\n===========================================================");

        teclado.close();
    }
}
