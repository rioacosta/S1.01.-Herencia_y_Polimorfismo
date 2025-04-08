package nivel3;

public class BasketNews extends News {
    public int puntos;
    public double precio;
    public String competencia;
    public String club;

    public BasketNews(String titular, String competencia, String club) {
        super(titular);
        this.precio = 250;
        this.puntos = 4;
        this.competencia = competencia;
        this.club = club;
    }

    //--------------------------
    public String getCompetencia () {
        return this.competencia;
    }
    public String getClub () {
        return this.club;
    }

    //---------------------------
    public void setCompetencia (String competencia) {
        this.competencia = competencia;
    }
    public void setClub (String club ) {
        this.club = club;
    }

    //-------------------------
    @Override
    public double calcularPrecio() {

        if (competencia.equalsIgnoreCase("Euro Liga")) {
            precio += 75;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            precio += 75;
        }

        return precio;
    }
    @Override
    public int calcularPuntos() {

        if (competencia.equalsIgnoreCase("Euro Liga")) {
            puntos += 3;
        } else if (competencia.equalsIgnoreCase("ACB")) {
            puntos += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            puntos += 1;
        }
        return puntos;
    }
    public String toString() {
        return "Titular: " +super.titular;
    }
}
