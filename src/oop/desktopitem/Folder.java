package oop.desktopitem;

import java.util.LinkedList;
import java.util.List;

public class Folder extends DesktopItem implements Group{
    private List<DesktopItem> items = new LinkedList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public boolean add(DesktopItem item) {
        return false;
    }

    public void open() {
    }

    public int size() {
        return 0;
    }
}
