package nivel3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static nivel3.EditorManager.addWriter;
import static nivel3.EditorManager.deleteWriter;
import static nivel3.NewsManager.*;

public class PressApp_Main {
    public static ArrayList<Editor> writers = new ArrayList<>();
    public static Scanner user = new Scanner(System.in);
    public static String text = "";

    public static void main(String[] args){
        // TODO Auto-generated method stub
        String answer = "";
        int optionMenu;

        Editor flavio;
        flavio = new Editor ("Flavio", "111111");
        writers.add(flavio);
        Editor maira = new Editor("Maira", "222222");
        writers.add(maira);
        Editor rio = new Editor("Rio", "666666");
        writers.add(rio);

        FutbolNews noticia1 = new FutbolNews("Goleada del Barça en la Liga de Campeones", text,
                "Liga de campeones", "Barça", "Ferran Torres");
        flavio.getNews().add(noticia1);

        do{                                             //LOS METODOS DE LAS OPCIONES 5 6 7 NO DEVUELVEN CORRECTAMENTE
            System.out.println("""
                    1.- Introducir redactor.
                    2.- Eliminar redactor.\r
                    3.- Introducir noticia en un redactor.\r
                    4.- Eliminar noticia.\r
                    5.- Mostrar todas las noticias por redactor.\r
                    6.- Calcular precio de la noticia.\r
                    7.- Calcular puntuación de la noticia.\
                    
                    8.- Mostrar todo.\
                    
                    0.- Salir.""");
            optionMenu = user.nextInt();


            switch(optionMenu){
                case 1:
                    addWriter();
                    break;
                case 2:
                    deleteWriter();
                    break;
                case 3:
                    addNews();
                    break;
                case 4:
                    deleteNews();
                    break;
                case 5:
                    showWriterNews();
                    break;
                case 6:
                    calculatePrice();
                    break;
                case 7:
                    calculatePoints();
                    break;
                case 8:
                    System.out.println(writers);
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    answer = "Diga una opcion correcta";
                    break;
            }
            System.out.println(answer);

        }while(optionMenu < 9 && optionMenu >= 1);

    }
}
