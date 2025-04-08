package nivel3;

import java.util.ArrayList;

public class Editor {
    private String name;
    private String DNI;
    private int salary;
    private ArrayList<News> editorNews = new ArrayList<News>();

    public Editor(String name, String dni) {
        this.name = name;
        this.DNI = dni;
        this.salary = 1500;
    }

    public String getName () {
        return this.name;
    }
    public String getDni () {
        return this.DNI;
    }
    public int getSalary () {
        return this.salary;
    }
    public ArrayList<News> getNews () {
        return editorNews;

    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }
    public void setNoticia (News newNews) {
        editorNews.add(newNews);
    }

    public String showNews() {
        String newsList = "";
        for (News news: editorNews) {
            newsList += news.toString()+"\n";
        }
        return newsList;
    }
    public String toString() {
        return "El redactor " +this.name+ " con el dni " +this.DNI+ " un salary de " +this.getSalary()
                + " trabajando en las noticias " +this.showNews();
    }
}
