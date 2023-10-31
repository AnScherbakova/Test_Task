package com.test.task.test_task.controller;

import com.test.task.test_task.entity.AddressHierarchy;
import com.test.task.test_task.service.AddressHierarchyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("adm/hierarchy")
@RequiredArgsConstructor
public class AddressHierarchyController {

    private final AddressHierarchyService addressHierarchyService;

    @GetMapping("/all/adm/hierarchy")
    public Collection<AddressHierarchy> getAllAddressHierarchy() {
        return addressHierarchyService.getAllAddressHierarchy();
    }
}
