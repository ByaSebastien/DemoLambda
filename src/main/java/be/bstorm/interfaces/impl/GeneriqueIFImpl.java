package be.bstorm.interfaces.impl;

import be.bstorm.interfaces.GeneriqueIF;

public class GeneriqueIFImpl<T> implements GeneriqueIF<T> {

    @Override
    public void execute(T entity) {
        System.out.println("GeneriqueIFImpl" + entity);
    }
}
