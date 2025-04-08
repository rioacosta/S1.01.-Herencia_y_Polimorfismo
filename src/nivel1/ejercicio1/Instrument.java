package nivel1.ejercicio1;

public abstract class Instrument {
    public String name = "";
    public int price = 0;

    public Instrument (String name, int price) {
        this.name = name;
        this.price = price;
    }
    //----------------------------
    public String getName () {
        return this.name;
    }
    public int getPrice () {
        return this.price;
    }
    //----------------------------
    public void setName (String name) {
        this.name = name;
    }
    public void setPrice (int price) {
        this.price = price;
    }
    //-----------------------------
    public static void showStaticMember() {
        System.out.println("Hola soy un miembro estatico");
    }
    public String play () {
        return "";
    }
    public String toString () {
        return "El instrumento se llama " +this.name + " que vale " +this.name+ "euros.";
    }

}
