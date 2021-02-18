package me.lulu.designpatternpratcie.decorator;

public abstract class Menu {
    public static final int ITEMS_PER_ROW = 9;

    private String title;
    private int rows;
    private String[] items;

    public Menu(String title, int rows) {
        this.title = title;
        this.rows = rows;
        this.items = new String[getSize()];
    }

    public abstract void display();

    public String getTitle() {
        return title;
    }

    public int getRows() {
        return rows;
    }

    public int getSize() {
        return rows * ITEMS_PER_ROW;
    }

    public String[] getItems() {
        return items;
    }
}
