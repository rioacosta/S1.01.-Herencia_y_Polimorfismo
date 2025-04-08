package nivel3;

public abstract class News {
    public String titular;
    public String texto;
    public int puntos;
    public double precio;

    public News (String titular) {
        this.titular = titular;
        this.texto = texto;
    }
    public String getTitular() {
        return this.titular;
    }
    public int getPuntos() {
        return this.puntos;
    }
    public double getPrecio() {
        return this.precio;
    }


    public void setTitular (String titular) {
        this.titular = titular;
    }
    public void setTexto (String texto) {
        this.texto = texto;
    }

    public abstract int calcularPuntos();
    public abstract double calcularPrecio();
}
