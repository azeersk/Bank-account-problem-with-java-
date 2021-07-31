public class Account {
    int account_no;
    String name ;
    float amount;
    void insert(int a,String n, float am){
        account_no = a;
        name = n;
        amount = am;
    }
    void deposit(float am){
        amount = amount + am;
        System.out.println(am + " diposited");
    }
    void withDraw(float am){
        if (amount < am){
            System.out.println("Insufficient Balance");
        }
        else {
            amount = amount - am;
            System.out.println(am + " Withdrawn");
        }
    }
    void checkBalance(){
        System.out.println("Balance is : "+amount);
    }
    void display(){
        System.out.println(account_no + " " + name + " " + amount);
    }
}
