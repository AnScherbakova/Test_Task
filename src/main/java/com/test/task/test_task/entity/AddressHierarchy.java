package com.test.task.test_task.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

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

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "object_id",
            fetch = FetchType.LAZY)
    private List<AddressObject> addressObjectList;

    public AddressHierarchy(LocalDate startDate, LocalDate endDate, boolean isActive, List<AddressObject> addressObjectList) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
        this.addressObjectList = addressObjectList;
    }

    public AddressHierarchy() {
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

    public List<AddressObject> getAddressObjectList() {
        return addressObjectList;
    }

    public void setAddressObjectList(List<AddressObject> addressObjectList) {
        this.addressObjectList = addressObjectList;
    }

    @Override
    public String toString() {
        return "AddressHierarchy{" +
                "id=" + id +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", isActive=" + isActive +
                ", addressObjectList=" + addressObjectList +
                '}';
    }
}
