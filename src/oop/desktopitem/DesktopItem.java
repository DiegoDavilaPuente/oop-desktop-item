package oop.desktopitem;

public class DesktopItem {
    private String name;

    public DesktopItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void open() {
    }

    public void rename(String name) {
        this.name = name;
    }

    public int size() {
        return 0;
    }
}
