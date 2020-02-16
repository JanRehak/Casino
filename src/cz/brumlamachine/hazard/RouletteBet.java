package cz.brumlamachine.hazard;

import java.util.function.Predicate;

public interface RouletteBet {

    int getMultiplier();

    Predicate<Integer> getPredicate();
}
