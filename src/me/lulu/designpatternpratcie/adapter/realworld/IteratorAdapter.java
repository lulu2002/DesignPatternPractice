package me.lulu.designpatternpratcie.adapter.realworld;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<E> implements Iterator<E> {

    private Enumeration<E> enumeration;

    public IteratorAdapter(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void remove() {
        new UnsupportedOperationException("還不去用 Iterator 啊老人");
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
