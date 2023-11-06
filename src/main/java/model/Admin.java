/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hp
 */
import jakarta.persistence.*;


@Entity
@Table(name = "admin")
public class Admin {
    
    @Id
    @Column(name = "userID")
    private String userId;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "contact")
    private String contact;

    @Column(name = "isAdmin")
    private boolean isAdmin;

    public Admin() {
    }
    

    public Admin(String userId, String username, String password, String contact, boolean isAdmin) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.contact = contact;
        this.isAdmin = isAdmin;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Admin{" + "userId=" + userId + ", name=" + username + ", password=" + password + ", contact=" + contact + ", isAdmin=" + isAdmin + '}';
    }
    
    
    
}