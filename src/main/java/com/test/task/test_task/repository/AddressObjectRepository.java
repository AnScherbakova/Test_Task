package com.test.task.test_task.repository;

import com.test.task.test_task.entity.AddressObject;
import org.springframework.data.jpa.repository.JpaRepository;


import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


public interface AddressObjectRepository extends JpaRepository<AddressObject, Integer> {
    AddressObject getAddressObjectByIdById (int id);
    List<AddressObject> getAddressObjectsByDate (LocalDate date);
}
