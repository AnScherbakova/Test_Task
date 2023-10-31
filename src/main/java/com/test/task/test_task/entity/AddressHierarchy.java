package com.test.task.test_task.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;



@Entity
@Table(name = "as_adm_hierarchy")
public class AddressHierarchy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent_obj_id")
    private int id;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "is_active")
    private boolean isActive;

    @OneToMany(mappedBy = "object_id",
            fetch = FetchType.LAZY)
    private Collection<AddressObject> addressObjects;

    public AddressHierarchy(LocalDate startDate, LocalDate endDate, boolean isActive) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public Collection<AddressObject> getAddressObjects() {
        return addressObjects;
    }

    public void setAddressObjects(Collection<AddressObject> addressObjects) {
        this.addressObjects = addressObjects;
    }

    @Override
    public String toString() {
        return "AddressHierarchy{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActive=" + isActive +
                ", addressObjects=" + addressObjects +
                '}';
    }
}
