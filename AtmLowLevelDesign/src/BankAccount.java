public class BankAccount {

    int availableMoney;
    static int CARD_PIN = 8866;

    public BankAccount(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    public static int getCardPin() {
        return CARD_PIN;
    }

    public static void setCardPin(int cardPin) {
        CARD_PIN = cardPin;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "availableMoney=" + availableMoney +
                '}';
    }
}
