package com.test.task.test_task.controller;

import com.test.task.test_task.entity.AddressObject;
import com.test.task.test_task.service.AddressObjectServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressObjectController {

    private final AddressObjectServiceImpl addressObjectService;

    public AddressObjectController(AddressObjectServiceImpl addressObjectService) {
        this.addressObjectService = addressObjectService;
    }

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

    @PostMapping("/addr/obj/{date}")
    public List<AddressObject> getAddressObjectByDate(@PathVariable LocalDate date) {
        List<AddressObject> addressObjects = addressObjectService.getAddressObjectByDate(date);
        return addressObjects;
    }
}
