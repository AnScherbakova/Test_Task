package com.test.task.test_task.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.test.task.test_task.entity.AddressObject;
import com.test.task.test_task.service.AddressObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressObjectController {

    @Autowired
    private  AddressObjectService addressObjectService;

    @GetMapping("/addr/obj")
    public List<AddressObject> showAllAddressObjects() {
        return addressObjectService.getAllAddress();
    }

    @GetMapping("/addr/obj/{id}")
    public AddressObject getAddressObjectById(@PathVariable int id) {
        AddressObject addressObject = addressObjectService.getAddressObjectById(id);
        return addressObject;
    }

    @PostMapping("/addr/obj")
    public AddressObject addNewAddressObject(@RequestBody AddressObject addressObject) {
        addressObjectService.saveAddressObject(addressObject);
        return addressObject;
    }

    @GetMapping("/addr/obj/get/{typeName}")
    public List<AddressObject> getAddressObjectsByTypeName(@PathVariable int typeName) {
        return addressObjectService.getAddressObjectsByTypeName(typeName);
    }

    @PostMapping("/addr/obj/{date}")
    public List<AddressObject> getAddressObjectByDate(@PathVariable LocalDate date) {
        List<AddressObject> addressObjects = addressObjectService.getAddressObjectByDate(date);
        return addressObjects;
    }
}
