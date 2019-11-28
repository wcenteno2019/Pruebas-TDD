package com.loyalty.proyectoTDD.implementations;

import com.loyalty.proyectoTDD.interfaces.IClientInterface;
import org.springframework.stereotype.Repository;

@Repository("ClientStatic")
public class IClientImplementation implements IClientInterface {
    @Override
    public boolean existClient(String ftnum) {
        if (ftnum.equalsIgnoreCase("12345678910")) {
            return true;
        }
        return false;
    }
}
