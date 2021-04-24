//operator overloading on its own class
//Deposit and Withdraw
//Type determines whether its a deposit while checkin or a withdrawal while saving
@groovy.transform.ToString
class Account{
    BigDecimal balance=1000.00
    String type    //checkings or savings
    
    BigDecimal deposit(BigDecimal Amount)
    {
    balance +=Amount
    }
    
    BigDecimal withdraw(BigDecimal Amount)
    {
    balance -=Amount
    }
    
    BigDecimal plus(Account other){
    this.balance + other.balance
    }
}
    Account checking=new Account(type:"Checking")
    checking.deposit(150.00)
    
    Account savings= new Account(type:"Savings")
    savings.withdraw(100.00)
    
    println checking
    println savings
    
    print checking + savings
    