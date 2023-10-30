package com.test.task.test_task.service;

import com.test.task.test_task.entity.AddressObject;

import java.time.LocalDate;
import java.util.List;

public interface AddressObjectService {
    List<AddressObject> getAllAddress();
    void saveAddressObject(AddressObject addressObject);
    List<AddressObject> getAddressObjectByDate(LocalDate date);
    AddressObject getAddressObjectById (int id);


}
