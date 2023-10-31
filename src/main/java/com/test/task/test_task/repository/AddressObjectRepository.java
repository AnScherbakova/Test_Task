package com.test.task.test_task.repository;

import com.test.task.test_task.entity.AddressObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface AddressObjectRepository extends JpaRepository<AddressObject, Integer> {
    AddressObject getAddressObjectByIdById (int id);
    List<AddressObject> getAddressObjectsByDate (LocalDate date);
}
