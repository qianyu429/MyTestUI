package bank;

import org.testng.annotations.Test;

/**
 * Created by mac on 2018/5/25.
 */
public class bankDemo {

    @Test
    public void customerUseCard(){
        int card_number = 001 ;
        double money = 500.00;
        double getMoney =300 ;
        CheckingAccount cust = new CheckingAccount(card_number);
        System.out.println("Depositing money $" + money);
        cust.deposit(money);

        try{
            System.out.println("withdrawing money $" + getMoney);
            cust.withdraw(getMoney);
            System.out.println("withdrawing money $" + getMoney);
            cust.withdraw(getMoney);
        }catch(InsufficientFundsException e){
            System.out.println("sorry! but your account is short $" + e.getAmount());
            e.printStackTrace();
        }
    }
}
