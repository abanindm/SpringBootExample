package com.dabanin.springbootexample.service;

import com.dabanin.springbootexample.dto.ClientDTO;
import com.dabanin.springbootexample.entity.Client;
import com.dabanin.springbootexample.repository.ClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by D.Abanin on 06.04.2017.
 */
@Service
public class ClientService {

    private ModelMapper modelMapper;

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;
    }

    public List<ClientDTO> getAllClients(){
        List<Client> result = new ArrayList<>();
        clientRepository.findAll().forEach(result::add);
        return result.stream().map(client -> modelMapper.map(client, ClientDTO.class)).collect(Collectors.toList());
    }

}
