package samples;

public class BankApplication {
	
	static int accNum;
	static int total;
	static String name;

		public void insert(int acc, int amount, String holder)
		{
			accNum=acc;
			total=amount;
			name=holder;
			System.out.println("Account Num:" +accNum+" " +"Initial Balance:" +total+" " +"Account_Holder: "+name);
		}
		
		public void deposit(int amount)
		{
			total=total+amount;
			System.out.println("Deposited Amount is:" +amount);
			System.out.println("Total Balance is:" +total);
		}
		public void withdraw(int amount)
		{
			if(total<amount)
			{
				System.out.println("Insufficient Balance");
			}else
			{
				total-=amount;
				System.out.println("Withdrawn amount is:" +amount);
				System.out.println("Balance is:" +total);
			}
		}
		public static void main(String[] args) {
			BankApplication bank= new BankApplication();
			bank.insert(1234, 60000, "Jeemol");
			bank.deposit(1000);
			bank.withdraw(1000000);
		}
	}


