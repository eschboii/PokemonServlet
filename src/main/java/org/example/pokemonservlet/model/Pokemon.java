package org.example.pokemonservlet.models;

public class Pokemon {
    private int id;
    private String name;
    private String type;
    private String color;

    public Pokemon(){}

    public Pokemon(int id, String name, String type, String color){
        this.id = id;
        this.name = name;
        this.type = type;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
