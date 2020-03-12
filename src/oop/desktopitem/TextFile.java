package oop.desktopitem;

public class TextFile extends DesktopItem{
    private String contents;

    public TextFile(String name) {
        super(name);
    }

    public void add(String contents) {
    }

    public void open() {
    }

    public void replace(String contents) {
        this.contents = contents;
    }

    public int size() {
        return 0;
    }
}
