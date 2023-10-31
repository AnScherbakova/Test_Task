package com.test.task.test_task.repository;

import com.test.task.test_task.entity.AddressObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Repository AddressObjectRepository
 */
@Repository
public interface AddressObjectRepository extends JpaRepository<AddressObject, Integer> {
    @Query(value = "SELECT * FROM as_addr_obj", nativeQuery = true)
    List<AddressObject> findAll();
    AddressObject getAddressObjectById(int id);
    List<AddressObject> getAddressObjectsByStartDate(LocalDate date);


}
