package com.loyalty.proyectoTDD.controller;

import com.loyalty.proyectoTDD.interfaces.IProcess;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client-info")
public class ClientController {
    private IProcess<Boolean,String> clientProcess;
    @RequestMapping(method = RequestMethod.GET, value = "/{idCliente}")
    public boolean clientExist(@PathVariable String idCliente){
        return clientProcess.process(idCliente);
    }
}
