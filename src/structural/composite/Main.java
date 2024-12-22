package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        Directory temp = new Directory("temp");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        /*
         Demo file system structure
            root
            ├── home
            │   ├── user
            │   │   └── file3
            │   ├── file1
            │   └── file2
            └── temp
        */

        root.add(home);
        home.add(user);
        user.add(file3);
        home.add(file1);
        home.add(file2);
        root.add(temp);

        root.print();
    }
}

// Component
abstract class FileSystemComponent {
    protected final String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    protected abstract void print(int depth);

    public void print() {
        print(0);
    }
}

// Leaf
class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void print(int depth) {
        String padding = "  ".repeat(depth);
        System.out.println(padding + "- File: " + name);
    }
}

// Composite
class Directory extends FileSystemComponent {
    private final List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void print(int depth) {
        String padding = "  ".repeat(depth);
        System.out.println(padding + "- Dir: " + name);

        // Recurse through children
        for (FileSystemComponent component : children) {
            component.print(depth + 1);
        }
    }
}