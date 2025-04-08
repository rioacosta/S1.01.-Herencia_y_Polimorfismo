package nivel3;

import java.util.ArrayList;
import static nivel3.EditorManager.findWriter;
import static nivel3.PressApp_Main.text;
import static nivel3.PressApp_Main.user;

public class NewsManager {
    private static String dni;
    private static Editor writer;
    private static String headLine;
    private static int index;

    public static int findNews(String dniRedactor, String titular) {
        int indexFound = -1;
        Editor writer = findWriter(dniRedactor);
        if (writer != null) {
            ArrayList<News> writerNews = writer.getNews();
            for (int i = 0; i < writerNews.size(); i++) {
                if (writerNews.get(i).getTitular().equalsIgnoreCase(titular)) {
                    indexFound = i;
                    break;
                }
            }
        }
        return indexFound;
    }

    //----------------------------
    public static String deleteNews() {
        user.nextLine();
        System.out.println("Diga el DNI del redactor del cual será eliminada la noticia");
        String dni = user.nextLine();
        Editor writer = findWriter(dni);
        if (writer == null) {
            System.out.println("No se ha encontrado un redactor con el DNI proporcionado.");
            return "Redactor no encontrado.";
        }
        System.out.println("¿Cuál es el titular de la noticia?");
        String headLine = user.nextLine();
        int index = findNews(dni, headLine);

        if (index == -1) {
            System.out.println("No se ha encontrado una noticia con el titular especificado.");
            return "Noticia no encontrada.";
        }

        String yesOrNo;
        do {
            System.out.println("Seguro que desea eliminar la noticia con el titular: \"" + headLine + "\"?");
            System.out.println("Respuesta: (SI/NO)");
            yesOrNo = user.next();
        } while (!yesOrNo.equalsIgnoreCase("SI") && !yesOrNo.equalsIgnoreCase("NO"));

        if (yesOrNo.equalsIgnoreCase("SI")) {
            writer.getNews().remove(index);
            System.out.println("Se ha eliminado correctamente la noticia: " + headLine);
            return "Noticia eliminada exitosamente.";
        } else {
            System.out.println("La eliminación ha sido cancelada.");
            return "Eliminación cancelada.";
        }
    }

    //-----------------------------
    public static String showWriterNews() {
        user.nextLine();
        System.out.println("Diga el DNI del redactor que desea ver");
        String dni = user.nextLine();
        Editor writerFound = findWriter(dni);

        if (writerFound == null) {
            System.out.println("No se ha encontrado un redactor con el DNI proporcionado.");
            return "Redactor no encontrado.";
        }
        System.out.println("Editor: " + writerFound.getName());
        String result = writerFound.getNews().stream()
                .map(News::toString)
                .reduce((news1, news2) -> news1 + "\n" + news2)
                .orElse("No hay noticias para este redactor.");

        System.out.println(result);
        return result;
    }

    //--------------------------------
    public static String calculatePrice() {
        user.nextLine();
        System.out.println("Diga el dni del redactor del cual es la noticia");
        String dni = user.nextLine();
        Editor writer = findWriter(dni);
        if (writer == null) {
            System.out.println("No se ha encontrado un redactor con el DNI proporcionado.");
            return "Redactor no encontrado.";
        }
        System.out.println("Cual es el titular de la noticia?");
        String headLine = user.nextLine();
        index = findNews(dni, headLine);
        if (index == -1) {
            System.out.println("No se ha encontrado una noticia con el titular especificado.");
            return "Noticia no encontrada.";
        }
        double price = writer.getNews().get(index).calcularPrecio();
        String result = "Esta noticia vale " + price + " euros.";
        System.out.println(result);
        return result;
    }

    //---------------------------------------
    public static String calculatePoints() {
        user.nextLine();
        System.out.println("Diga el dni del redactor del cual es la noticia");
        String dni = user.nextLine();
        Editor writer = findWriter(dni);
        if (writer == null) {
            System.out.println("No se ha encontrado un redactor con el DNI proporcionado.");
            return "Redactor no encontrado.";
        }
        System.out.println("Cual es el titular de la noticia?");
        String headLine = user.nextLine();
        index = findNews(dni, headLine);
        if (index == -1) {
            System.out.println("No se ha encontrado una noticia con el titular especificado.");
            return "Noticia no encontrada.";
        }
        double points = writer.getNews().get(index).calcularPuntos();
        String result = "Esta noticia vale " + points + " puntos.";
        System.out.println(result);
        return result;
    }


    //------------Tipos de noticia-----------
    private static News createFutbolNews() {
        System.out.println("Diga el titular de la noticia");
        headLine = user.nextLine();
        System.out.println("De que competencia se trata?");
        String competition = user.nextLine();
        System.out.println("De que club se trata?");
        String club = user.nextLine();
        System.out.println("De que jugador se trata?");
        String player = user.nextLine();
        return new FutbolNews(headLine, text, competition, club, player);
    }

    private static News createBasketNews() {
        System.out.println("Diga el titular de la noticia");
        headLine = user.nextLine();
        System.out.println("De que competencia se trata?");
        String competition = user.nextLine();
        System.out.println("De que club se trata?");
        String club = user.nextLine();
        return new BasketNews(headLine, competition, club);
    }

    private static News createTenisNews() {
        System.out.println("Diga el titular de la noticia");
        headLine = user.nextLine();
        System.out.println("De que tenista se trata?");
        String tenista = user.nextLine();
        String competition = "";
        return new TenisNews(headLine, text, competition, tenista);
    }

    private static News createF1News() {
        System.out.println("Diga el titular de la noticia");
        headLine = user.nextLine();
        System.out.println("De que escuderia se trata?");
        String escuderia = user.nextLine();
        return new F1News(headLine, text, escuderia);
    }

    private static News createMotoNews() {
        System.out.println("Diga el titular de la noticia");
        headLine = user.nextLine();
        System.out.println("De que equipo se trata?");
        String club = user.nextLine();
        return new MotoNews(headLine, text, club);
    }

    //------------------------------------
    public static void addNews() {
        int kindOfNews;
        News newNews = null;
        Editor writer;
        boolean exit = false;
        String dni;

        user.nextLine();
        System.out.println("Diga el dni del redactor se le asignara la noticia?");
        dni = user.nextLine();
        writer = findWriter(dni);

        do {
            System.out.println("Que tipo de noticia desea crear?"
                    + "\n1.- News de futbol"
                    + "\n2.- News de basquet"
                    + "\n3.- News de Tenis"
                    + "\n4.- News de F1"
                    + "\n5.- News de Motocilismo");
            kindOfNews = user.nextInt();

            switch (kindOfNews) {
                case 1:
                    user.nextLine();
                    newNews = createFutbolNews();
                    break;
                case 2:
                    user.nextLine();
                    newNews = createBasketNews();
                    break;
                case 3:
                    user.nextLine();
                    newNews = createTenisNews();
                    break;
                case 4:
                    user.nextLine();
                    newNews = createF1News();
                    break;
                case 5:
                    user.nextLine();
                    newNews = createMotoNews();
                    break;
                default:
                    System.out.println("Diga una opcion valida");
                    break;
            }

            writer.setNoticia(newNews);
            System.out.println("Se ha asigando la noticia: " + newNews.toString() + " \nal redactor: " + writer.getName());
            exit = true;
        } while (!exit);
    }
}