public class GestoreGioco {
    private int numeroVincente;


    public GestoreGioco() {
        numeroVincente = 19;
    }

    public GestoreGioco(GestoreGioco gg){
        numeroVincente = gg.numeroVincente;
    }


    public void verifica(int num) {
        if (num == numeroVincente) {
            //verifica num
            System.out.println("Ho vinto");
        }else{
            System.out.println("Ho perso");
        }
    }
}