# Bank-Account

ATM Simulator (Java)
This is a basic Java application that simulates ATM functionalities like balance checking and cash withdrawal.

Features
Balance Check: View the current account balance.

Withdraw Money:

Ensures a minimum balance of 500.

Withdrawal amount must be a multiple of 500.

Updates the balance after successful withdrawal.

Encapsulation:

Balance is a private field, accessed through getter and setter methods.

Structure
Account Class:

Holds the user's balance.

Provides methods to set and get balance.

ATM Class:

Interacts with the Account class.

Provides functions for balance checking and withdrawal.

How to Run
Save the code in a file inside a folder named Practice, for example:
Practice/ATM.java and Practice/Account.java (if separated).

Open terminal or command prompt.

Navigate to the project directory.

Compile the program:
javac Practice/*.java

Run the program:
java Practice.ATM
(You may need to create a main method separately to test it.)

Example (after adding a main method)
Current Balance: 5000
Enter withdrawal amount: 1500
Withdrawal Successful. New Balance: 3500

If trying to withdraw an invalid amount:
Enter withdrawal amount: 1234
Invalid Amount (must be a multiple of 500)

If balance is too low:
Enter withdrawal amount: 6000
Low Balance
Notes
The program uses object-oriented programming concepts: classes, objects, constructors, encapsulation.

Currently, ATM creates a default Account with a 5000 balance.

User input handling is not yet included — you can extend it by using Scanner for more interaction!

Author
Ibad Ali
