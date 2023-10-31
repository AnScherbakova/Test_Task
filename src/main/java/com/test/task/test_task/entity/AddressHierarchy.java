package com.test.task.test_task.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;


@Entity
@Table(name = "as_adm_hierarchy")
@EqualsAndHashCode
@ToString
@Getter
@Setter
public class AddressHierarchy {
    @Id
    @GeneratedValue
    @Column(name = "parent_obj_id")
    private int id;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name = "end_date")
    private LocalDate endDate;
    @Column(name = "is_active")
    private boolean isActive;

    @OneToMany(mappedBy = "object_id", fetch = FetchType.LAZY)
    private Collection<AddressObject> addressObjects;

    public AddressHierarchy(LocalDate startDate, LocalDate endDate, boolean isActive) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

}
