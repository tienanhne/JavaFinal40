/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Blob;

@Entity
@Table(name = "books")
public class Books {
    @Id
    @Column(name = "Bookid")
    private int bookId;

    @Column(name = "namebook")
    private String namebook;

    @Column(name = "category")
    private String category;

    @Column(name = "author")
    private String author;

    @Column(name = "copies")
    private int copies;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private int quantity;
    
    @Column(name = "image")
    private byte[] image;

    public Books() {
    }
    

    public Books(int bookId, String namebook, String category, String author, int copies, double price, int quantity, byte[] image) {
        this.bookId = bookId;
        this.namebook = namebook;
        this.category = category;
        this.author = author;
        this.copies = copies;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return namebook;
    }

    public void setName(String name) {
        this.namebook = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Books{" + "bookId=" + bookId + ", namebook=" + namebook + ", category=" + category + ", author=" + author + ", copies=" + copies + ", price=" + price + ", quantity=" + quantity + ", image=" + image + '}';
    }

    
}
