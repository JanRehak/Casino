package cz.brumlamachine.hazard;

import cz.brumlamachine.hazard.Ball;

public class Ruleta {
        public static void main (String[] args) {
        Ball kulicka = new Ball();
        Player player = new Player("Tomas", -130, 2);
        Arena arena = new Arena(player, kulicka);

//        for (int i = 0; i < 20; i++) {

            System.out.println("Kostky byly vrzeny");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("Chyba, nepovedlo se uspat vlákno");
            }
            System.out.println(kulicka.getRandomSpinNumber());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.err.println("Chyba, nepovedlo se uspat vlákno");
            }
            System.out.println(kulicka.getColor());
            System.out.println(kulicka.getParity());


//            System.out.println(arena.betOnColor("black"));
//            System.out.println(arena.betOnColor("odd"));

        }

    }

