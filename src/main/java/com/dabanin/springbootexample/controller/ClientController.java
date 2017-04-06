package com.dabanin.springbootexample.controller;

import com.dabanin.springbootexample.dto.ClientDTO;
import com.dabanin.springbootexample.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by D.Abanin on 06.04.2017.
 */
@RestController
public class ClientController {

    @Autowired
    public ClientController(ModelMapper modelMapper, ClientService clientService) {
        this.modelMapper = modelMapper;
        this.clientService = clientService;
    }

    private ClientService clientService;

    private ModelMapper modelMapper;

    @RequestMapping("/client/getAll")
    public List<ClientDTO> getAllClients(){
        return clientService.getAllClients().stream().map(client -> modelMapper.map(client, ClientDTO.class)).collect(Collectors.toList());
    }


}
