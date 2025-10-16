public class GiocaNumeri {
    public static void main(String[] args) throws Exception {
        System.out.println("INIZIO!");
        GestoreGioco estrattore = new GestoreGioco();
        Giocatore g1 = new Giocatore("Mario", estrattore);
        Giocatore g2 = new Giocatore("Bros", estrattore);

        g1.run();
        g2.run();


        try {
            g1.join();
            g2.join();
        } catch (InterruptedException e) {
            System.out.println("errore");
        }


        System.out.println("FINE GIOCO!");
    }
}