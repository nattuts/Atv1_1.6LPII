public class Conta{
    private String id;
    private String name;
    private int balance;

    public Conta(String id, String name){
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Conta(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
            return balance;
        }
        else{
            System.out.print("O valor é maior que o saldo");
            return balance;
        }
    }

    public void transferTo(Conta anotherAccount, int amount){
        if(amount <= balance){
            this.debit(amount);
            anotherAccount.credit(amount);
            System.out.println("Transferindo " + amount + " para outra conta");
        }
        else{
            System.out.print("O valor é maior que o saldo");
        }
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int balance(){
        return balance;
    }
}