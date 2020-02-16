package cz.brumlamachine.hazard;

import java.util.Arrays;
import java.util.Scanner;

public class Ruleta {

    public static void main(String[] args) {
        Ball kulicka = new Ball();
        Player player = new Player();
        player.setName("Tom");
        Arena arena = new Arena(player, kulicka);


// jednoduche zapsani do jsonu
//        String json = new ObjectMapper().writeValueAsString(player);
//        Player deserialized = new ObjectMapper().read(json, Player.class);

        player.setCash(100);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Mas celkem penez: " + player.getCash());
            System.out.println("Zadej sazku - cislo, nebo nekterou specialni : " + Arrays.toString(SpecialBet.values()));
            final RouletteBet bet;
            try {
                String next = scanner.next().toUpperCase();
                if (next.matches("[0-9]+")) {
                    bet = new NumberBet(Integer.parseInt(next));
                } else {
                    bet = SpecialBet.valueOf(next);
                }
            } catch (Exception iae) {
                System.err.println("Zadal si neplatnou sazku, znova!");
                continue;
            }
            final int kolik;
            System.out.println("Zadej kolik chces vsadit");
            try {
                kolik = scanner.nextInt();
                if (kolik > player.getCash() || kolik < 1) {
                    throw new IllegalArgumentException();
                }
            } catch (Exception e) {
                System.err.println("Zadal si neplatnou castku, mas " + player.getCash() + " penez");
                continue;
            }
            kulicka.roll();
            arena.placeBet(bet, kolik);
            System.out.println("Padlo cislo " + kulicka.getCurrentNumber() + ", vyherni sazky " + kulicka.getWinningBets());
            if (kulicka.checkBet(bet)) {
                System.out.println("VYHRAL JSI !!!");
            } else {
                System.out.println("Prohrals love more");
            }
        }
    }
}

