package cz.brumlamachine.hazard;

public class Arena {
    private Player player;
    private Ball ball;
    int bet;

    public Arena(Player player, Ball ball) {
        this.player = player;
        this.ball = ball;
    }

    public boolean betOnColor (String color) {
        return color.equals(ball.getColor());
        }

    public boolean betOnParity (String parity) {
        return parity.equals(ball.getParity());

//    public boolean betOnNumber (int number) {
//        if (number == ball.randomSpinNumber) {
//            return true;
//        } else {
//            return false;
//        }


        }
    }







