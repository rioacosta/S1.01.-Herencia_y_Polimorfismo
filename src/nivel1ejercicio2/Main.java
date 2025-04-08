package nivel1ejercicio2;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(Automovil.frenar());

        Automovil focus = new Automovil("Focus");
        System.out.println(focus.acelerar());

        focus.setModel("Puma");

        System.out.println("Marca: " + focus.getMarca()
                +"\nModelo: " + focus.getModelo()
                +"\nPotencia: " + focus.getPotencia()
                +"\n"+focus.toString());
    }
}
