package com.test.task.test_task.service;

import com.test.task.test_task.entity.AddressObject;
import com.test.task.test_task.repository.AddressObjectRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;



/**
 * Класс - сервис для работы адрессами объектов
 *
 * @see AddressObjectRepository
 */
@Service
public class AddressObjectService {
    @Autowired
    private AddressObjectRepository addressObjectRepository;



    /**
     * Метод возвращает все адресса объектов
     * {@link AddressObjectRepository#findAll()}
     *
     * @return {@link List<AddressObject>}
     */
    public List<AddressObject> getAllAddress() {
        return addressObjectRepository.findAll();
    }

    /**
     * Метод сохраняет объектв в БД
     * {@link AddressObjectRepository#save(Object)}
     *
     * @param  addressObject
     */
    public void saveAddressObject(AddressObject addressObject) {
        addressObjectRepository.save(addressObject);
    }

    /**
     * Метод ищет объект в БД по дате и возвращает список объектов по типу адреса
     * {@link AddressObjectRepository#getAddressObjectsByStartDate(LocalDate)}
     *
     * @param  date
     * * @return {@link List<Integer>}
     */
    public List<Integer> getAddressObjectByDate(LocalDate date) {
        List<Integer> objectList = new ArrayList<>();
        for (AddressObject e : addressObjectRepository.getAddressObjectsByStartDate(date)) {
            Integer typeName = e.getTypeName();
            objectList.add(typeName);
        }
        return objectList;
    }

    /**
     * Метод ищет объект в БД по дате и типу адреса и возвращает список объектов по типу адреса и названию
     * {@link AddressObjectRepository#findAll()} 
     *
     * @param  startDate,typeName
     * * @return {@link List<Integer>}
     */
    public Map<Integer, String> getAddressByStartDateAndTypeName(LocalDate startDate, int [] typeName) {
        Map<Integer, String> integerStringMap = new HashMap<>();

        for (AddressObject e: addressObjectRepository.findAll()) {
            if (e.getStartDate().equals(startDate)){
                for (int d = 0; d < typeName.length; d++) {
                    if (e.getTypeName().equals(typeName[d])){
                        integerStringMap.put(e.getTypeName(),e.getName());
                    }
                }
            }

        }
        return integerStringMap;
    }

    /**
     * Метод ищет объект в БД по id и возвращает найденный объект
     * {@link AddressObjectRepository#getAddressObjectById(int)}
     *
     * @param  id
     * * @return {@link AddressObject}
     */
    public AddressObject getAddressObjectById(int id) {
        return addressObjectRepository.getAddressObjectById(id);
    }

}
