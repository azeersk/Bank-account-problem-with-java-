public class TestAccount {
    public static void main(String[] args){
        Account holder1 = new Account();
        holder1.insert(933427,"rajasimha",1500);
        holder1.display();
        holder1.checkBalance();
        holder1.deposit(35000);
        holder1.checkBalance();
        holder1.withDraw(9000);
        holder1.checkBalance();
        holder1.withDraw(990000);
        holder1.checkBalance();

    }
}
