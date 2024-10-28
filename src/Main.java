import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //criação da conta
        System.out.print("Digite seu id: ");
        String id = scanner.next();
        System.out.print("Digite seu nome: ");
        String name = scanner.next();
        System.out.print("Saldo: ");
        int balance = scanner.nextInt();

        Conta conta = new Conta(id, name, balance);

        //criação da outra conta
        System.out.print("Digite o ID da outra conta: ");
        String anotherId = scanner.next();
        System.out.print("Digite o nome da outra conta: ");
        String anotherName = scanner.next();
        System.out.print("Digite o saldo da outra conta: ");
        int anotherBalance = scanner.nextInt();

        Conta anotherAccount = new Conta(anotherId, anotherName, anotherBalance);

        System.out.print("Digite o valor a transferir: ");
        int transferAmount = scanner.nextInt();
        
        conta.transferTo(anotherAccount, transferAmount);

        System.out.println("Saldo da conta original: " + conta.balance());
        System.out.println("Saldo da outra conta: " + anotherAccount.balance());


        scanner.close();
    }
}
