package nivel1ejercicio2;

public class Automovil {
    final private static String LABEL = "Ford";
    private static String model;
    final private int POWER;

    public Automovil(String modelo) {
        this.POWER = 500;
        Automovil.model = modelo;
    }
    //----------------
    public String getMarca() {
        return Automovil.LABEL;
    }
    public String getModelo() {
        return Automovil.model;
    }
    public int getPotencia () {
        return this.POWER;
    }
    //---------------------

    public void setModel(String modelo) {
        Automovil.model = modelo;
    }
    //---------------------
    public String acelerar () {
		/*int nuevaVelocidad = 15 + this.getVelocidad();
		this.setVelocidad(nuevaVelocidad);*/
        return "El coche esta acelerando.";

    }
    public static String frenar() {
		/*int nuevaVelocidad = this.getVelocidad() - 8;
		if (nuevaVelocidad <= 0) {
			this.setVelocidad(0);
		} else {
			this.setVelocidad(nuevaVelocidad);
		}*/
        return "El coche esta frenando.";
    }
    //---------------------
    public String toString() {
        return "El coche " + Automovil.model + " marca " + Automovil.LABEL+ " con potencia de " +this.POWER;
    }

}
