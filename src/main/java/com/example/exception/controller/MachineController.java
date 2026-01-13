package com.example.exception.controller;

import com.example.exception.handler.ResourceNotFoundException;
import com.example.exception.service.MachineService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by manikandan.marimuthu on 12-01-2026.
 * Author: manikandan.marimuthu
 */

@RestController
public class MachineController {

    private MachineService machineService;

    MachineController(MachineService machineService){
        this.machineService = machineService;
    }

    @GetMapping("/machine/{id}")
    public String getMachine(@PathVariable int id) {
        if (id == 0) {
            throw new ResourceNotFoundException("Machine not found with id " + id);
        }
        return machineService.getMachineById(id);
    }

    @DeleteMapping("/machine/{id}")
    public String deleteMachine(@PathVariable int id) {
        if (id == 0) {
            throw new ResourceNotFoundException("Machine not found with id " + id);
        }
        return machineService.deleteMachineById(id);
    }

    @PostMapping("/machine/{id}")
    public String updateMachine(@PathVariable int id) {
        if (id == 0) {
            throw new ResourceNotFoundException("Machine not found with id " + id);
        }
        return machineService.updateMachineById(id);
    }
}
