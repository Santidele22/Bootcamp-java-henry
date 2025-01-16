package models;

import java.util.List;

public class Manager extends Person {
    private List<Artist> artists;

    Manager(String name, int age) {
        super(name, age);
    }
}
