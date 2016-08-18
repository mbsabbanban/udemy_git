class Account {
    BigDecimal balance = 0.0

/*
/** This Deposit method will only ingest a single amount */
    def deposit(BigDecimal money){
        if( money < 0 ){
           throw new Exception("Can't deposit negative money dipshit")
    }
        balance += money
  }

/*

    def depositList(List moneyList){
        for( i in moneyList){ 
            try{
              if( i > 0 ){
            balance = balance + i
        }
      } catch(Exception e){
            println "Handling Exception"
    }
  }

*/

def depositList(List moneyList){
        for( i in moneyList){
            deposit(i)
    }

  }
}

/* ###### */

Account checking = new Account()

println checking.balance

checking.deposit(100.00)

println checking.balance

List monies = [1.00, 5.00, 10.00, -2.00]

try{
checking.depositList(monies)
} catch (Exception e){
    println e.message
}

println "Final Amount..."
println checking.balance
