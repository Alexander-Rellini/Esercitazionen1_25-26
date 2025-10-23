public class GiocaNumeri {
    public static void main(String[] args) throws Exception {
        System.out.println("INIZIO!");
        GestoreGioco estrattore = new GestoreGioco();
        Giocatore g1 = new Giocatore("Mario", estrattore);
        Giocatore g2 = new Giocatore("Bros", estrattore);

        g1.run(); // avvio del thread per il giocatore 1
        g2.run();  // avvio del thread per il giocatore 2


        try {
            g1.join();   // aspetta prima di proseguire e sincronizza
            g2.join();   // aspetta prima di proseguire e sincronizza
        } catch (InterruptedException e) {
            System.out.println("errore");
        }


        System.out.println("FINE GIOCO!");
    }
}