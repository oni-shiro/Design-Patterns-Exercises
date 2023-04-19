public class Atm {
    User user;
    int availableMoney;
    int twoThousandNotes;
    int fiveHundredNotes;

    public Atm(User user, int availableMoney, int twoThousandNotes, int fiveHundredNotes) {
        this.user = user;
        this.availableMoney = availableMoney;
        this.twoThousandNotes = twoThousandNotes;
        this.fiveHundredNotes = fiveHundredNotes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    public int getTwoThousandNotes() {
        return twoThousandNotes;
    }

    public void setTwoThousandNotes(int twoThousandNotes) {
        this.twoThousandNotes = twoThousandNotes;
    }

    public int getFiveHundredNotes() {
        return fiveHundredNotes;
    }

    public void setFiveHundredNotes(int fiveHundredNotes) {
        this.fiveHundredNotes = fiveHundredNotes;
    }


}
