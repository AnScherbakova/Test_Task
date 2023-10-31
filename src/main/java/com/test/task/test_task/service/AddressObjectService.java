package com.test.task.test_task.service;

import com.test.task.test_task.entity.AddressObject;
import com.test.task.test_task.repository.AddressObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


@Service
public class AddressObjectService {
    
    private final  AddressObjectRepository addressObjectRepository;

    public AddressObjectService(AddressObjectRepository addressObjectRepository) {
        this.addressObjectRepository = addressObjectRepository;
    }

    public Collection<AddressObject> getAllAddress() {
        return addressObjectRepository.findAll();
    }

    public void saveAddressObject(AddressObject addressObject) {
        addressObjectRepository.save(addressObject);
    }

    public List<AddressObject> getAddressObjectByDate(LocalDate date) {
        List<AddressObject> objectList= addressObjectRepository.getAddressObjectsByDate(date);
        return objectList;
    }

    public AddressObject getAddressObjectById(int id) {
        return addressObjectRepository.getAddressObjectByIdById(id);
    }
}
