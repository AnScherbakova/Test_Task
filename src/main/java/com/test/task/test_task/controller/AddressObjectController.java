package com.test.task.test_task.controller;

import com.test.task.test_task.entity.AddressObject;
import com.test.task.test_task.service.AddressObjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressObjectController {

    @Autowired
    private  AddressObjectServiceImpl addressObjectServiceImpl;

    @GetMapping("/addr/obj")
    public Collection<AddressObject> showAllAddressObjects() {
        return addressObjectServiceImpl.getAllAddress();
    }

    @GetMapping("/addr/obj/{id}")
    public AddressObject getAddressObjectById(@PathVariable int id) {
        AddressObject addressObject = addressObjectServiceImpl.getAddressObjectById(id);
        return addressObject;
    }

    @PostMapping("/addr/obj")
    public AddressObject addNewAddressObject(@RequestBody AddressObject addressObject) {
        addressObjectServiceImpl.saveAddressObject(addressObject);
        return addressObject;
    }

    @PostMapping("/addr/obj/{date}")
    public List<AddressObject> getAddressObjectByDate(@PathVariable LocalDate date) {
        List<AddressObject> addressObjects = addressObjectServiceImpl.getAddressObjectByDate(date);
        return addressObjects;
    }
}
