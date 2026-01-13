package com.example.exception.service;

/**
 * Created by manikandan.marimuthu on 13-01-2026.
 * Author: manikandan.marimuthu
 */
public interface MachineService {

    public String getMachineById(Integer id);

    String deleteMachineById(int id);

    String updateMachineById(int id);
}
