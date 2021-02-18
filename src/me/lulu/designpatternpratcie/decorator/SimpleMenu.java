package me.lulu.designpatternpratcie.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class SimpleMenu extends Menu {

    public SimpleMenu(String title, int rows) {
        super(title, rows);
    }

    @Override
    public void display() {
        String[] items = getItems();

        System.out.println(getTitle());

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            System.out.print((item == null ? "x" : item) + " ");

            if ((i + 1) % ITEMS_PER_ROW == 0)
                System.out.println();
        }
    }

}
