package com.loyalty.proyectoTDD.implementations;

import com.loyalty.proyectoTDD.interfaces.IClientInterface;

public class NoConectionClient implements IClientInterface {
    @Override
    public boolean existClient(String ftnum) {

        return false;
    }
}
