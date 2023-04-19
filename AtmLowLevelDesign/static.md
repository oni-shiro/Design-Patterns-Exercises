# Design Doc
## classes and methods
```
AtmState:
Atm obj;

insertCard();
authenticateCard();
selectOperation();
withdrawMoney();
showBalance();
returnCard();
exit();
---------------------
Card:
int cardNo;
---------------------
BankAcc:
int cardNo;
int availableMoney;
---------------------
User:
Card card;
BankAcc bankac;
---------------------
Atm:
User
int totalAvailableMoney;
int twoThousandNote;
int fiveHundredNote;
    



```