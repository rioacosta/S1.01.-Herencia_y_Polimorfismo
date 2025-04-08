package nivel3;

import java.util.Scanner;

import static nivel3.PressApp_Main.writers;

public class EditorManager {
    public static Scanner user = new Scanner(System.in);

    public static Editor findWriter(String dni) {
        for (Editor writer : writers) {
            if (writer.getDni().equalsIgnoreCase(dni)) {
                return writer;
            }
        }
        return null;
    }
    //-----------------
    public static void addWriter () {
        String name;
        String dni;
        System.out.println("Como se llama el nuevo redactor?");
        name = user.nextLine();
        System.out.println("Cual es el DNI?");
        dni = user.nextLine();
        Editor newEditor = new Editor(name, dni);
        writers.add(newEditor);
        System.out.println(newEditor);

    }
    //----------------

    public static void deleteWriter () {
        String dni;
        String yesOrNo;
        System.out.println("Diga el dni del redactor que desea eliminar");
        dni = user.nextLine();
        Editor writerFound = findWriter(dni);

        if (writerFound == null) {
            System.out.println("No se ha encontrado ningún redactor con el DNI proporcionado.");
            return;
        }
        do {
            System.out.println("Seguro que desea eliminar al redactor " + writerFound.getName() + "? (SI/NO)");
            yesOrNo = user.next();
        } while (!yesOrNo.equalsIgnoreCase("SI") && !yesOrNo.equalsIgnoreCase("NO"));

        if (yesOrNo.equalsIgnoreCase("SI")) {
            writers.remove(writerFound);
            System.out.println("Se ha eliminado correctamente.");
        } else {
            System.out.println("La eliminación ha sido cancelada.");
        }
        user.nextLine();
    }
}