//Operator Overloading- https://groovy-lang.org/operators.html#Operator-Overloading

/*
class Account{
    BigDecimal balance
}
Account savings= new Account(balance:100.00)
Account chacking= new Account(balance:500.00)

println savings + checking    //Exception thrown
*/

class Account{
    BigDecimal balance
    Account plus(Account other)    //	a.plus(b)
    {
        new Account( balance: this.balance + other.balance ) //returns the last line of a function body by default without return statement
    }
    String toString(){
        "Account Balance: $balance"
    }
}
Account savings= new Account(balance:100.00)
Account checking= new Account(balance:500.00)
println savings
println checking
println savings+checking