package be.bstorm.interfaces.impl;

import be.bstorm.interfaces.PersonIF;
import be.bstorm.models.Person;

public class PersonIFImpl implements PersonIF {
    @Override
    public void execute(Person p) {
        System.out.println(p.getName() + " : KAWABUNGA!");
    }
}
