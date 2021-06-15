import java.util.Random;
public class BankAccount{
    private String accountNumber;
    private double checking_balance;
    private double saving_balance;
    private static int number_of_accounts = 0;
    private static double total_money = 0;
	
    public BankAccount(){
	this.accountNumber();
	number_of_accounts ++;
    }
    private String accountNumber(){
	Random r = new Random();
	accountNumber = "";
	for(int i = 0; i < 10; i++){
	    accountNumber += r.nextInt(10);
	}
	return accountNumber;
	
    } 

    public double getChecking_balance(){
	return checking_balance;
    }

    public double getSaving_balance(){
	return saving_balance;
    }
    public String getAccountNumber(){
	return accountNumber;
    }
  
    public void depositChecking(double money, String type){
	if(type == "saving")
		checking_balance += money;
	else if(type == "checking")
		saving_balance += money;
	total_money += money;
    }

  
    public void withdraw(double money, String type){
	if(type == "saving"){
		if (money > saving_balance){
	    		System.out.println("You don't have suffiecent money");
		}
		else{
	    		saving_balance -= money;
	   		 total_money -= money;
		}
	}

	else if(type == "checking"){
		if (money > checking_balance){
	    		System.out.println("You don't have suffiecent money");
		}
		else{
	    		checking_balance -= money;
	   		 total_money -= money;
		}
	}	
    }

    public void showTotalMoney(){
	System.out.println(this.total_money);
    }

}