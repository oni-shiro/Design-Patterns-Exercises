public class User {
    Card card;
    BankAccount bankAccount;
    int moneyWithdrawalReq;

    public User(Card card, BankAccount bankAccount, int moneyWithdrawalReq) {
        this.card = card;
        this.bankAccount = bankAccount;
        this.moneyWithdrawalReq = moneyWithdrawalReq;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getMoneyWithdrawalReq() {
        return moneyWithdrawalReq;
    }

    public void setMoneyWithdrawalReq(int moneyWithdrawalReq) {
        this.moneyWithdrawalReq = moneyWithdrawalReq;
    }
}
