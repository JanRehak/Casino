package cz.brumlamachine.hazard;

public class Arena {
    private Player player;
    private Ball ball;

    public Arena(Player player, Ball ball) {
        this.player = player;
        this.ball = ball;
    }

    public int placeBet(RouletteBet bet, int cash) {
        if (cash < 1) {
            throw new IllegalArgumentException("musis neco vsadit");
        }
        if (ball.checkBet(bet)) {
            // vyhral
            return player.addCash(cash * (bet.getMultiplier() - 1));
        } else {
            // prohral
            return player.addCash(-cash);
        }
    }




}







