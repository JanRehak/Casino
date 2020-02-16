package cz.brumlamachine.hazard;

import java.util.function.Predicate;

public class NumberBet implements RouletteBet {

    private final int num;

    public NumberBet(int num) {
        this.num = num;
    }

    @Override
    public int getMultiplier() {
        return 36;
    }

    @Override
    public Predicate<Integer> getPredicate() {
        return n -> n == num;
    }

    @Override
    public String toString() {
        return "NumberBet{" +
                "num=" + num +
                '}';
    }
}
