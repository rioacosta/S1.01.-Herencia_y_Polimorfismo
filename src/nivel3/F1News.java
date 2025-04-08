package nivel3;

public class F1News extends News{
    public int puntos;
    public double precio;
    public String escuderia;

    public F1News (String titular, String texto, String escuderia) {
        super (titular);
        this.puntos = 4;
        this.precio = 100;
        this.escuderia = escuderia;
    }
    //--------------------------
    public String getEscuderia () {
        return this.escuderia;
    }

    //---------------------------
    public void setEscuderia (String escuderia) {
        this.escuderia = escuderia;
    }

    //-------------------------
    @Override
    public double calcularPrecio() {

        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            precio += 50;
        }
        return precio;
    }
    @Override
    public int calcularPuntos() {

        if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes")) {
            puntos += 2;
        }
        return puntos;
    }

    public String toString() {
        return "Titular: " +super.titular;
    }
}
