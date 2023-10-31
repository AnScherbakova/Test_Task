package com.test.task.test_task.service;

import com.test.task.test_task.entity.AddressHierarchy;
import com.test.task.test_task.repository.AddressHierarchyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class AddressHierarchyServiceImpl implements AddressHierarchyService {

    @Autowired
    private  AddressHierarchyRepository addressHierarchyRepository;

    @Override
    public Collection<AddressHierarchy> getAllAddressHierarchy() {
        return addressHierarchyRepository.getAllAddress();
    }
}
