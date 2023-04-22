package com.sakshi;

public class Main {

    public static void main(String[] args) {

        Account abhaysAccount = new Account("121212",0,"Sakshi","sakshi@xyz.com","1212121");

        abhaysAccount.DepositMoney(50);
        abhaysAccount.DepositMoney(150);

        abhaysAccount.WithDrawMoney(100);
    
    }
}