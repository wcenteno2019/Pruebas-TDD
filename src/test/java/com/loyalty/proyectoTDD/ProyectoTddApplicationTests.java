package com.loyalty.proyectoTDD;

import com.loyalty.proyectoTDD.interfaces.IClientInterface;
import com.loyalty.proyectoTDD.utils.ValidaMun;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@ActiveProfiles("testing")
class ProyectoTddApplicationTests {

	IClientInterface iClient;
	@Autowired
	public ProyectoTddApplicationTests(@Qualifier("BeanClientRepository") IClientInterface iClient){
		this.iClient=iClient;

	}
	@Test
	void contextLoads() {
	}

	@Test
	void pruebaInicial(){
		Assert.assertTrue(ValidaMun.validaMun("12234567891"));
	}

	@Test
	void pruebaFalse(){
		Assert.assertFalse(ValidaMun.validaMun("1223456789"));
	}

	@Test
	void clientExistsTest(){
		Assert.assertTrue(iClient.existClient("12345678910"));
	}

	@Test
	void clientDoesntExistTest(){
		Assert.assertFalse(iClient.existClient("12345078910"));
	}
}
