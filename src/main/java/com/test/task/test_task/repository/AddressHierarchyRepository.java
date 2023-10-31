package com.test.task.test_task.repository;

import com.test.task.test_task.entity.AddressHierarchy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AddressHierarchyRepository extends JpaRepository <AddressHierarchy, Integer> {
    Collection<AddressHierarchy> getAllAddress();
}
