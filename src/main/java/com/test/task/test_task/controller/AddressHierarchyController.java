package com.test.task.test_task.controller;

import com.test.task.test_task.entity.AddressHierarchy;
import com.test.task.test_task.service.AddressHierarchyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class AddressHierarchyController {

    @Autowired
    private AddressHierarchyServiceImpl addressHierarchyServiceImpl;

    @GetMapping("/all/adm/hierarchy")
    public Collection<AddressHierarchy> getAllAddressHierarchy() {
        return addressHierarchyServiceImpl.getAllAddressHierarchy();
    }
}
