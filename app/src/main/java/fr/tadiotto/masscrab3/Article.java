package fr.tadiotto.masscrab3;

public class Article {

    private int id;

    private String title;

    private double prix;

    private int category_id;

    private int marque_id;

    private String description;

    private String image;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getCategory() {
        return category_id;
    }

    public int getMarque() {
        return marque_id;
    }

    public String getImage() {
        return image;
    }
}
