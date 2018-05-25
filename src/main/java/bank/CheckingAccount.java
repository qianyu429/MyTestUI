package bank;

/**
 * Created by mac on 2018/5/25.
 */
public class CheckingAccount {

//    balance为余额,number为卡号
    private double balance;
    private int number;

//    方法:构造函数
    public CheckingAccount(int number){
        this.number = number;
    }

//    方法:存钱
    public void deposit(double amount){
        balance += amount;
    }

//    方法:取钱
    public void withdraw(double amount) throws InsufficientFundsException{

//        取出金额大于余额则可以取出,刷新余额,否则抛错
        if(amount <= balance){
            balance -= amount;
        }else{
            double needs = amount - balance;
            throw  new InsufficientFundsException(needs);
        }
    }

//    方法:返回余额
    public double getBalance(){
        return balance;
    }

//    方法:返回卡号
    public int getNumber(){
        return number;
    }
}
