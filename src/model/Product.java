package model;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double id;
    private String description;
    private double prix;

    public Product() {
    }

    //constricteur
    public Product(String name, String description, double prix) {
        this.name = name;
        this.description = description;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "model.Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                '}';
    }

//    getter et setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
