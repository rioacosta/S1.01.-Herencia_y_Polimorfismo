package nivel3;

public class TenisNews extends News {
    public int puntos;
    public double precio;
    public String competencia;
    public String tenista;


    public TenisNews (String titular, String texto, String competencia, String tenista) {
        super (titular);
        this.puntos = 4;
        this.precio = 150;
        this.competencia = competencia;
        this.tenista = tenista;
    }
    //--------------------------
    public String getCompetencia () {
        return this.competencia;
    }

    public String getTenista () {
        return this.tenista;
    }
    //---------------------------
    public void setCompetencia (String competencia) {
        this.competencia = competencia;
    }

    public void setTenista (String tenista) {
        this.tenista = tenista;
    }
    //-------------------------
    @Override
    public double calcularPrecio() { //Federer, Nadal o Djokovic: 100 €

        if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")) {
            precio += 100;
        }
        return precio;
    }
    @Override
    public int calcularPuntos() { //Federer, Nadal o Djokovic: 3pts

        if (tenista.equalsIgnoreCase("Federer") || tenista.equalsIgnoreCase("Nadal") || tenista.equalsIgnoreCase("Djokovic")) {
            puntos += 3;
        }
        return puntos;
    }

    public String toString() {
        return "Titular: " +super.titular;
    }
}
