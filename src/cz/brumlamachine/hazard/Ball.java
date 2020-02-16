package cz.brumlamachine.hazard;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Ball {

    private static final int TOTAL_NUMBERS = 36;

    private final SecureRandom random = new SecureRandom();
    private int currentNumber = -1;

    public int roll() {
        this.currentNumber = random.nextInt(TOTAL_NUMBERS);
        return this.currentNumber;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public boolean checkBet(RouletteBet rouletteBet) {
        if (currentNumber == -1) {
            throw new IllegalStateException("Musis nejdriv zavolat roll!");
        }
        return rouletteBet.getPredicate().test(currentNumber);
    }

    public List<RouletteBet> getWinningBets() {
        final List<RouletteBet> bets = new ArrayList<>();
        // check spesl bet
        for (SpecialBet bet : SpecialBet.values()) {
            if (checkBet(bet)) {
                bets.add(bet);
            }
        }
        // num bet
        bets.add(new NumberBet(currentNumber));
        return bets;
    }
}
