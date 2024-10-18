package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class TodoListDirector {
    /**
     * List of todos
     */
    private final List<String> todoList = new ArrayList<>();

    /**
     * Add item to the list
     * @param item Thing to do
     * @return TodoListDirector
     */
    public TodoListDirector addTodo(String item) {
        todoList.add(item);
        return this;
    }

    /**
     *
     * @param builder Builder you want to use
     * @return Built object
     * @param <T> Type of Builder
     */
    public <T> T construct(DocumentBuilder<T> builder) {
        return builder.withHeader1("My Todo List")
                .withParagraph("Things to do...")
                .withListItems(todoList)
                .build();
    }
}
