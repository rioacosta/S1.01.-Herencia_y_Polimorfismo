package nivel3;

public class FutbolNews extends News {
    public int puntos;
    public double precio;
    public String competencia;
    public String club;
    public String jugador;

    public FutbolNews (String titular, String texto, String competencia, String club, String jugador) {
        super (titular);
        this.puntos = 5;
        this.precio = 300;
        this.competencia = competencia;
        this.club = club;
        this.jugador = jugador;
    }
    //--------------------------
    public String getCompetencia () {
        return this.competencia;
    }
    public String getClub () {
        return this.club;
    }
    public String getJugador () {
        return this.jugador;
    }
    //---------------------------
    public void setCompetencia (String competencia) {
        this.competencia = competencia;
    }
    public void setClub (String club ) {
        this.club = club;
    }
    public void set (String jugador) {
        this.jugador = jugador;
    }
    //-------------------------
    @Override
    public double calcularPrecio() {

        if (competencia.equalsIgnoreCase("Liga de campeones")) {
            precio += 100;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            precio += 100;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            precio += 50;
        }
        return precio;
    }
    @Override
    public int calcularPuntos() {

        if (competencia.equalsIgnoreCase("Liga de campeones")) {
            puntos += 3;
        } else if (competencia.equalsIgnoreCase("Lliga")) {
            puntos += 2;
        }
        if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid")) {
            puntos += 1;
        }
        if (jugador.equalsIgnoreCase("Ferran Torres") || jugador.equalsIgnoreCase("Benzema")) {
            puntos += 1;
        }
        return puntos;
    }

    public String toString() {
        return "Titular: " +super.titular; // " +this.dni+ " trabajando en las noticias " +this.mostrarNoticias();
    }
}
