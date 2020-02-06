package cz.brumlamachine.hazard;

import java.util.Objects;
import java.util.Random;

public class Ball {
    private Random random;
    int randomSpinNumber;
    int totalNumbers = 36;
    public boolean odd;
    public boolean zero;
    public boolean black;



    public int roll(){
        this.randomSpinNumber = random.nextInt(totalNumbers);
        return this.randomSpinNumber;
    }

    public String getColor() {
        String blackOrRed;
        zero = false;
        if ((randomSpinNumber > 0 && randomSpinNumber <= 10) || (randomSpinNumber >= 19 && randomSpinNumber <= 28)) {

            if (randomSpinNumber % 2 == 1) {
                black = false;
            } else {
                black = true;
            }
        }
        if ((randomSpinNumber >= 10 && randomSpinNumber <= 18) || (randomSpinNumber >= 29)) {
            if (randomSpinNumber % 2 == 1) {
                black = true;
            } else {
                black = false;
            }
        }
        if (randomSpinNumber == 0) {
            zero = true;
        }
        if (black) {
            blackOrRed= "black";
        } else {
            blackOrRed = "red";
        }
        if (zero) {
            blackOrRed = "green";
        }
        return blackOrRed;
    }

    public String getParity() {
        String oddOrEven;
        zero = false;
        if ((randomSpinNumber > 0 && randomSpinNumber <= 10) || (randomSpinNumber >= 19 && randomSpinNumber <= 28)) {

            if (randomSpinNumber % 2 == 1) {
                odd = true;
            } else {
                odd = false;
            }
        }
        if ((randomSpinNumber >= 10 && randomSpinNumber <= 18) || (randomSpinNumber >= 29)) {
            if (randomSpinNumber % 2 == 1) {
                odd = true;
            } else {
                odd = false;
            }
        }
        if (randomSpinNumber == 0) {
            zero = true;
        }
        if (odd) {
            oddOrEven = "odd";
        } else {
            oddOrEven = "even";
        }
        if (zero) {
            oddOrEven = "zero";
        }
        return oddOrEven;
    }

    public int getRandomSpinNumber() {
       return roll();
    }

    public Ball() {
        random = new Random();
    }
}
