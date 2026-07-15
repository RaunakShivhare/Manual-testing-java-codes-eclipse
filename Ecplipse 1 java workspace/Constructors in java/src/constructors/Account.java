package constructors;

	class Accountt {
	    private int balance;
	    private int accountNumber;
	    private String type;

	    // No-argument constructor
	    public Accountt() {
	        this.balance = 0;
	        this.accountNumber = 12345;
	        this.type = "CHECKING";
	    }

	    // Parameterized constructor
	    public Accountt(int balance, int accountNumber, String type) {
	        this.balance = balance;
	        this.accountNumber = accountNumber;
	        this.type = type;
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void deposit(int amount) {
	        balance += amount;
	    }

	    public void withdraw(int amount) {
	        if (type.equals("SAVINGS") && balance < amount) {
	            throw new ArithmeticException("Cannot overdraw on savings account!");
	        }
	        balance -= amount;
	    }

	    @Override
	    public String toString() {
	        return "Account " + accountNumber + " (" + type + ") has balance " + balance;
	    }
	}

	public class Account {
	    public static void main(String[] args) {
	        Accountt a1 = new Accountt(); // default checking
	        a1.deposit(10);
	        System.out.println(a1); // balance 10

	        Accountt a2 = new Accountt(0, 11111, "CHECKING");
	        a2.deposit(10);
	        a2.withdraw(20);
	        System.out.println(a2); // balance -10

	        try {
	            Accountt a3 = new Accountt(0, 22222, "SAVINGS");
	            a3.withdraw(10); // throws exception
	        } catch (ArithmeticException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}



