package cz.brumlamachine.hazard;

public class Player {

    private String name;
    private int numberOfHoes;
    private int cash;

    public Player() {
    }

    public Player(String name, int cash, int numberOfHoes) {
        this.name = name;
        this.cash = cash;
        this.numberOfHoes = numberOfHoes;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHoes() {
        return numberOfHoes;
    }

    public void setNumberOfHoes(int numberOfHoes) {
        this.numberOfHoes = numberOfHoes;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int addCash(int adding) {
        return cash = cash + adding;
    }
}
