package com.example.exception.serviceimpl;

import com.example.exception.service.MachineService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by manikandan.marimuthu on 13-01-2026.
 * Author: manikandan.marimuthu
 */

@Service
public class MachineServiceImpl implements MachineService {

    @Override
    @Cacheable(key = "#id", value = "machines")
    public String getMachineById(Integer id) {
        makeDelay();
        return "Machine data - "+id;
    }

    @Override
    @CacheEvict(key = "#id", value = "machines")
    public String deleteMachineById(int id) {
        return "Machine data deleted - "+id;
    }

    @Override
    @CachePut(key = "#id", value = "machine")
    public String updateMachineById(int id) {
        return "Machine data updated - "+id;
    }

    public void makeDelay(){
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
