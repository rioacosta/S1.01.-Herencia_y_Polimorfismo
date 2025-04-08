package nivel1.ejercicio1;

public class MusicalGroupMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String answer = "";
        Instrument guitar = new Cords ("Fender", 600);
        Instrument flute = new Winds ("Dulce", 50);
        Instrument congas = new Percussion ("Congas", 90);

        Instrument.showStaticMember();

        answer += guitar.play();
        answer += "\n" + flute.play();
        answer += "\n" + congas.play();
        System.out.println(answer);
    }

}
