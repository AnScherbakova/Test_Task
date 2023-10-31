package com.test.task.test_task.service;

import com.test.task.test_task.entity.AddressObject;
import com.test.task.test_task.repository.AddressObjectRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;


@Service
public class AddressObjectServiceImpl implements AddressObjectService {

    private final AddressObjectRepository addressObjectRepository;

    public AddressObjectServiceImpl(AddressObjectRepository addressObjectRepository) {
        this.addressObjectRepository = addressObjectRepository;
    }

    @Override
    public Collection<AddressObject> getAllAddress() {
        return addressObjectRepository.findAll();
    }

    @Override
    public void saveAddressObject(AddressObject addressObject) {
        addressObjectRepository.save(addressObject);
    }

    @Override
    public List<AddressObject> getAddressObjectByDate(LocalDate date) {
        List<AddressObject> objectList= addressObjectRepository.getAddressObjectsByDate(date);
        return objectList;
    }

    @Override
    public AddressObject getAddressObjectById(int id) {
        return addressObjectRepository.getAddressObjectByIdById(id);
    }
}
