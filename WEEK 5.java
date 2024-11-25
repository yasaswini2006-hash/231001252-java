//WEEK 5.1

class BankAccount {
    private String accountNumber;
    private double balance;
    BankAccount(String ac,double bal){
        accountNumber = ac;
        balance = bal;
    }
    public void deposit(double amount) {
        balance +=amount;
     
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance() {
        return balance;
        
    }
} 

 class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber,balance);
    }
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            super.withdraw(amount);
        }
    }
}

class prog {
    
    public static void main(String[] args) {
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        BankAccount BA1234 = new BankAccount("BA1234", 500);
        System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);
       System.out.println("New balance after depositing $1000: $"+BA1234.getBalance());
        System.out.println("Withdraw $600 from account BA1234:");
      BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());
        System.out.println("Create a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);
        System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
    }
}


//WEEK 5.2

class College
{
protected   String collegeName;

public College(String collegeName) {
    this.collegeName = collegeName;
    
    }

public void admitted() {
    System.out.println("A student admitted in "+collegeName);
}
}
class Student extends College{

String studentName;
String department;

public Student(String collegeName, String studentName,String depart) {
    super(collegeName);
   this.studentName = studentName;
   this.department = depart;
   
   
}

public String toString(){
    return "CollegeName : "+collegeName+"\nStudentName : "+studentName+"\nDepartment : "+department;
    
}
}
class prog {
public static void main (String[] args) {
        Student  s1 = new Student("REC","Venkatesh","CSE");
        s1.admitted();
        System.out.println(s1.toString()); 
}
}

//WEEK 5.3

class Moblie{
    Moblie(){
        System.out.println("Basic Mobile is Manufactured");
    }
}
class CamaraMoblie extends Moblie{
    CamaraMoblie(){
        super();
        System.out.println("Camera Mobile is Manufactured");
    }
   void newFeature(){
        System.out.println("Camera Mobile with 5MG px");
    }
}
class AndroidMoblie extends CamaraMoblie{
    AndroidMoblie(){
        super();
        System.out.println("Android Mobile is Manufactured");
        
    }
    void androidMoblie(){
        System.out.println("Touch Screen Mobile is Manufactured");
        
    }
}
public class prog{
    public static void main(String A[]){
        AndroidMoblie a = new AndroidMoblie();
        a.newFeature();
        a.androidMoblie();
    }
}
