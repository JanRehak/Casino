package cz.brumlamachine.hazard;

import java.util.Set;
import java.util.function.Predicate;

public enum SpecialBet implements RouletteBet {

    ODD(num -> num > 0 && num % 2 == 1, 2),
    EVEN(num -> num > 0 && num % 2 == 0, 2),
    BLACK(num -> num > 0 && Set.of(2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35).contains(num), 2),
    RED(num -> num > 0 && Set.of(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36).contains(num), 2),
    NUMS_1_18(num -> num > 0 && num < 19, 3),
    NUMS_19_36(num -> num > 18 && num < 37, 3),
    NUMS_1_12(num -> num > 0 && num < 13, 3),
    NUMS_2_12(num -> num > 12 && num < 25, 3),
    NUMS_3_12(num -> num > 24, 3);

    private Predicate<Integer> predicate;
    private int multiplier;

    SpecialBet(Predicate<Integer> predicate, int multiplier) {
        this.predicate = predicate;
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }

    @Override
    public Predicate<Integer> getPredicate() {
        return predicate;
    }

}
