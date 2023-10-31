package com.test.task.test_task.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "as_addr_obj")
public class AddressObject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "object_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "type_name")
    private Integer typeName;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "ISACTUAL")
    private boolean isActual;
    @Column(name = "ISACTIVE")
    private boolean isActive;

    @ManyToOne
    @JoinColumn (name = "parent_obj_id")
    private AddressHierarchy addressHierarchy;

    public AddressObject(String name, Integer typeName,
                         LocalDate startDate, LocalDate endDate,
                         boolean isActual, boolean isActive) {

        this.name = name;
        this.typeName = typeName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActual = isActual;
        this.isActive = isActive;
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

    public Integer getTypeName() {
        return typeName;
    }

    public void setTypeName(Integer typeName) {
        this.typeName = typeName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public boolean isActual() {
        return isActual;
    }

    public void setActual(boolean actual) {
        isActual = actual;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public AddressHierarchy getAddressHierarchy() {
        return addressHierarchy;
    }

    public void setAddressHierarchy(AddressHierarchy addressHierarchy) {
        this.addressHierarchy = addressHierarchy;
    }

    @Override
    public String toString() {
        return "AddressObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeName='" + typeName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActual=" + isActual +
                ", isActive=" + isActive +
                ", addressHierarchy=" + addressHierarchy +
                '}';
    }
}
