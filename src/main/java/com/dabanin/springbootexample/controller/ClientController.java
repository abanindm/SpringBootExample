package com.dabanin.springbootexample.controller;

import com.dabanin.springbootexample.dto.ClientDTO;
import com.dabanin.springbootexample.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by D.Abanin on 06.04.2017.
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping("")
    public List<ClientDTO> getAllClients(){
        return clientService.getAllClients();
    }


}
