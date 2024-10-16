fun main() {
    var balance = 0.00
    val isRunning = true
    while(isRunning){
        println("Welcome to Chelate Bank!")
        println("1. Check balance")
        println("2. Deposit")
        println("3. Withdraw cash")
        println("4. Exit")
        print("How can I help you today?: ")
        val choice = readln()
        when (choice) {
            "1" -> {
                checkBalance(balance)
            }
            "2" -> {
                balance+=deposit()
            }
            "3" -> {
                balance-=withdraw(balance)
            }
            "4" -> {
                println("Have a good day!")
                break
            }else -> {
                println("Please make a valid selection!")
            }
        }
    }
}

fun withdraw(balance: Double):Int {
    print("How much do you wish to withdraw?: ")
    val withdraw = readln().toInt()
    if (withdraw > balance) {
        println("You have insufficient funds!")
    } else if (withdraw < 0) {
        println("Amount should be greater than 0!")
    } else if (withdraw.toDouble() == balance) {
        println("You have insufficient funds!")
    } else {
        return withdraw
    }
    return 0
}

fun deposit(): Int {
    print("How much do you want to deposit?: ")
    val deposit = readln().toInt()
    if(deposit<=0){
        println("Please enter a number greater than 0!")
    }
    return deposit
}

fun checkBalance(balance: Double) {
    println("Your balance is Ksh.$balance")
}
