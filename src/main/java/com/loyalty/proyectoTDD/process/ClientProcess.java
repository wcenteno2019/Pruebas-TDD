package com.loyalty.proyectoTDD.process;

import com.loyalty.proyectoTDD.interfaces.IClientInterface;
import com.loyalty.proyectoTDD.interfaces.IProcess;
import com.loyalty.proyectoTDD.utils.ValidaMun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ClientProcess")
public class ClientProcess implements IProcess<Boolean,String> {
    private IClientInterface iClientInterface;

    @Autowired
    public ClientProcess(@Qualifier("BeanClientRepository") IClientInterface iClientInterface) {
        this.iClientInterface = iClientInterface;
    }
    @Override
    public Boolean process(String[] params){
        if(ValidaMun.validaMun(params[0])){
            return iClientInterface.existClient(params[0]);
        }else{
            System.out.println("Error, invalid clientID lenght");
            return false;
        }
    }
}
