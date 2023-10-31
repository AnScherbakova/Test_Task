package com.test.task.test_task.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "as_addr_obj")
@EqualsAndHashCode
@ToString
@Getter
@Setter
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

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_obj_id", nullable = false)
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

    public AddressObject() {
    }

}
