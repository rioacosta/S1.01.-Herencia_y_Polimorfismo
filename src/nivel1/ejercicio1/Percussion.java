package nivel1.ejercicio1;

public class Percussion extends Instrument {
    public Percussion (String name, int price) {
        super (name, price);

    }
    //----------------------------
    public String play() {
        return "Esta sonando un instrumento de percusion";
    }
}
