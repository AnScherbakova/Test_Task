package com.test.task.test_task.repository;

import com.test.task.test_task.entity.AddressHierarchy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface AddressHierarchyRepository extends JpaRepository <AddressHierarchy, Integer> {
    Collection<AddressHierarchy> getAllAddress();
}
