package nivel2;

public class Phone {

    private String label = "";
    private String model = "";

    public Phone (String label, String model) {
        this.label = label;
        this.model = model;
    }
    public void call(String number) {
        System.out.println("Calling: " + number);
    }
}
