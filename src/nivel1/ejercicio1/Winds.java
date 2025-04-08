package nivel1.ejercicio1;

public class Winds extends Instrument {
    public Winds (String name, int price) {
        super (name, price);
    }
    //----------------------------
    public String play() {
        return "Esta sonando un instrumento de viento";
    }
}
