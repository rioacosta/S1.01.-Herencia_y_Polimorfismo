package nivel1.ejercicio1;

public class Cords extends Instrument {
    public Cords (String name, int price) {
        super (name, price);
    }

    //----------------------------
    public String play() {
        return "Esta sonando un instrumento de cuerdas";
    }
}
