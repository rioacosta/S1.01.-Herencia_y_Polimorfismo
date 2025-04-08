package nivel2;

public class MainCellPhone {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21");

        smartphone.call("666666666");
        System.out.println(smartphone.takePhoto());
        System.out.println(smartphone.soundAlarm());
    }
}
