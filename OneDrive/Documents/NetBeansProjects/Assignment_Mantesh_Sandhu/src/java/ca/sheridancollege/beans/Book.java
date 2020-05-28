/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.beans;

/**
 *
 * @author SandhuM
 */
public class Book {
    private int ID;
    private String title;
    private String author;
    private double Price;
    private int inventory;
    private String courses;
    
     public Book() {
    }

    public Book(int ID, String title, String author, double Price, int inventory, String courses) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.Price = Price;
        this.inventory = inventory;
        this.courses = courses;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Book{" + "ID=" + ID + ", title=" + title + ", author=" + author + ", Price=" + Price + ", inventory=" + inventory + ", courses=" + courses + '}';
    }
     
}
