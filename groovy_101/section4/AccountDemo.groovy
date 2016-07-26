@groovy.transform.ToString //don't forget to apply the transformation up top
class Account {
    
    BigDecimal balance = 0.0
    String type
    
    void deposit(money){
        this.balance = balance + money
    }
    
    /* Another way to do the method
    
    BigDecimal deposit(money){
        balance += money
    }
    */
    
    void withdraw(money){
        this.balance = balance - money
    }
    
    //operator overload that could only add types of Account
    // Account plus(Account other){
    //    return new Account( balance: this.balance + other.balance )
    //}
    
    BigDecimal plus(Account other){ //have to declare the tpe explicitly as BigDecimal
        this.balance + other.balance
    }

}

// Testing out the new class the I created

Account checking = new Account(type:"checking")
checking.deposit(100.00)
println checking

Account savings = new Account(type:"savings")
savings.deposit(50.00)
println savings

BigDecimal total = checking + savings
println total
