package com.test.task.test_task.controller;

import com.test.task.test_task.entity.AddressHierarchy;
import com.test.task.test_task.service.AddressHierarchyService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("adm/hierarchy")
public class AddressHierarchyController {

    private final AddressHierarchyService addressHierarchyService;

    public AddressHierarchyController(AddressHierarchyService addressHierarchyService) {
        this.addressHierarchyService = addressHierarchyService;
    }

    @GetMapping("/all/adm/hierarchy")
    public Collection<AddressHierarchy> getAllAddressHierarchy() {
        return addressHierarchyService.getAllAddressHierarchy();
    }
}
