package com.test.task.test_task.service;

import com.test.task.test_task.entity.AddressObject;
import com.test.task.test_task.repository.AddressObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class AddressObjectService {
    @Autowired
    private AddressObjectRepository addressObjectRepository;


    public List<AddressObject> getAllAddress() {
        return addressObjectRepository.findAll();
    }

    public void saveAddressObject(AddressObject addressObject) {
        addressObjectRepository.save(addressObject);
    }

    public List<Integer> getAddressObjectByDate(LocalDate date) {
        List<Integer> objectList = new ArrayList<>();
        for (AddressObject e : addressObjectRepository.getAddressObjectsByStartDate(date)) {
            Integer typeName = e.getTypeName();
            objectList.add(typeName);
        }
        return objectList;

    }
//
    public AddressObject getAddressObjectById(int id) {
        return addressObjectRepository.getAddressObjectById(id);
    }

    public List<AddressObject> getAddressObjectsByTypeName(int typeName) {
        return addressObjectRepository.getAddressObjectsByTypeName(typeName);
    }
}
