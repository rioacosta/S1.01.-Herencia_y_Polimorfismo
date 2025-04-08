package nivel2;

public class Smartphone extends Phone implements Camera, Watch{

    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    public String takePhoto() {
        return "Se está haciendo una foto";
    }

    public String soundAlarm() {
        return "Está sonando la alarma";
    }
}
