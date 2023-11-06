/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.*;
import java.util.Date;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "rentBook")
public class rentbook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rentId")
    private int renId;

    @Column(name = "Iduser")
    private String IDuser;
    
    @Column(name = "Idbook")
    private int IDbook;

    @Column(name = "namebook")
    private String namebook;

    @Column(name = "category")
    private String category;

    @Column(name = "thoiGianMuon")
    private Date thoiGianMuon;

    @Column(name = "thoiGianTra")
    private Date thoiGianTra;

    @Column(name = "quantityRent")
    private int quantityRent;

    @Column(name = "totalPrice")
    private double totalPrice;

    public rentbook() {
    }

    public rentbook(int renId,String IDuser, int IDbook, String namebook, String category, Date thoiGianMuon, Date thoiGianTra, int quantityRent, double totalPrice) {
        this.renId = renId;
        this.IDuser = IDuser;
        this.IDbook = IDbook;
        this.namebook = namebook;
        this.category = category;
        this.thoiGianMuon = thoiGianMuon;
        this.thoiGianTra = thoiGianTra;
        this.quantityRent = quantityRent;
        this.totalPrice = totalPrice;
    }

    public String getIDuser() {
        return IDuser;
    }

    public void setIDuser(String IDuser) {
        this.IDuser = IDuser;
    }
    
    public int getRenId() {
        return renId;
    }

    public void setRenId(int renId) {
        this.renId = renId;
    }


    public int getIDbook() {
        return IDbook;
    }

    public void setIDbook(int IDbook) {
        this.IDbook = IDbook;
    }

    public String getNamebook() {
        return namebook;
    }

    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getThoiGianMuon() {
        return thoiGianMuon;
    }

    public void setThoiGianMuon(Date thoiGianMuon) {
        this.thoiGianMuon = thoiGianMuon;
    }

    public Date getThoiGianTra() {
        return thoiGianTra;
    }

    public void setThoiGianTra(Date thoiGianTra) {
        this.thoiGianTra = thoiGianTra;
    }

    public int getQuantityRent() {
        return quantityRent;
    }

    public void setQuantityRent(int quantityRent) {
        this.quantityRent = quantityRent;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "rentbook{" + "renId=" + renId + ", IDuser=" + IDuser + ", IDbook=" + IDbook + ", namebook=" + namebook + ", category=" + category + ", thoiGianMuon=" + thoiGianMuon + ", thoiGianTra=" + thoiGianTra + ", quantityRent=" + quantityRent + ", totalPrice=" + totalPrice + '}';
    }

    
    
}
