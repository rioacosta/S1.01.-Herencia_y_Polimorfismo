package nivel3;

public class MotoNews extends News {
    public int puntos;
    public double precio;
    public String equipo;

    public MotoNews (String titular, String texto, String equipo) {
        super (titular);
        this.puntos = 4;
        this.precio = 100;
        this.equipo = equipo;
    }
    //--------------------------
    public String getEquipo () {
        return this.equipo;
    }

    //---------------------------
    public void setEquipo (String equipo) {
        this.equipo = equipo;
    }

    //-------------------------
    @Override
    public double calcularPrecio() {

        if (equipo.equalsIgnoreCase("Ferrari") || equipo.equalsIgnoreCase("Mercedes")) {
            precio += 50;
        }
        return precio;
    }
    @Override
    public int calcularPuntos() {

        if (equipo.equalsIgnoreCase("Ferrari") || equipo.equalsIgnoreCase("Mercedes")) {
            puntos += 2;
        }
        return puntos;
    }

    public String toString() {
        return "Titular: " +super.titular;
    }
}
