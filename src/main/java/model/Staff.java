/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.*;

/**
 *
 * @author hp
 */
@Entity
@Table(name = "staff")
public class Staff {
    
    @Id
    @Column(name = "staffID")
    private String staffId;

    @Column(name = "name")
    private String name;

    @Column(name = "contact")
    private String contact;

    public Staff() {
    }
    

    public Staff(String staffId, String name, String contact) {
        this.staffId = staffId;
        this.name = name;
        this.contact = contact;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Staff{" + "staffId=" + staffId + ", name=" + name + ", contact=" + contact + '}';
    }

    
    
    
}
