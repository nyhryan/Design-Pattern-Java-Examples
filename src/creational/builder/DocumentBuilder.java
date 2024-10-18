package creational.builder;

import java.util.List;

/**
 * Builder interface
 * @param <T> Type of Builder
 */
public interface DocumentBuilder<T> {
    DocumentBuilder<T> withHeader1(String header1Text);
    DocumentBuilder<T> withParagraph(String paragraph);
    DocumentBuilder<T> withListItems(List<String> items);
    T build();
}