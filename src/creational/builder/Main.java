package creational.builder;

public class Main {
    public static void main(String[] args) {
//         You can test Stdout, HTML builders here
//
//        StdoutBuilder console =
//                StdoutBuilder.builder()
//                        .withHeader1("This is title.")
//                        .withParagraph("Lorem ipsum...")
//                        .withListItems(List.of("Apple", "Banana", "Carrot"))
//                        .build();
//        console.print();
//
//        HTMLBuilder html =
//                HTMLBuilder.builder()
//                        .withHeader1("Hello World!")
//                        .withParagraph("Lorem ipsum...")
//                        .withHeader1("Another title.")
//                        .withListItems(List.of("Apple", "Banana", "Carrot"))
//                        .build();
//        html.save("index.html");

        // Create a list
        var todo = new TodoListDirector();

        todo.addTodo("Study")
            .addTodo("Play")
            .addTodo("Sing");

        // Construct the list as StdoutBuilder
        StdoutBuilder result_stdout = todo.construct(StdoutBuilder.builder());
        result_stdout.print();

        // Construct the list as HTMLBuilder
        HTMLBuilder result_html = todo.construct(HTMLBuilder.builder());
        result_html.save("todo.html");
    }
}
