package com.loyalty.proyectoTDD.implementations;

import com.loyalty.proyectoTDD.database.IClientRepository;
import com.loyalty.proyectoTDD.interfaces.IClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("ClientRepository")
public class ClientRepository implements IClientInterface {
    private IClientRepository repository;
    @Autowired
    public ClientRepository(IClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existClient(String ftnum) {
        if(repository.isSuscribed(ftnum) >= 1){
            return true;
        }
        return false;
    }
}
