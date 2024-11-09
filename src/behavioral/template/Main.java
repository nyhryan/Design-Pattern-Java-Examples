package behavioral.template;

public class Main {
    public static void main(String[] args) {
        var textFileReader = new TextFileReader("assets/template_method.txt");
        textFileReader.print(); // print() is a template method

        System.out.println();

        var htmlFileReader = new HTMLFileReader("assets/template_method.html");
        htmlFileReader.print(); // print() is a template method
    }
}