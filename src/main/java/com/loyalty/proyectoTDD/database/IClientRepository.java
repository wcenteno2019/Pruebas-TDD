package com.loyalty.proyectoTDD.database;

import com.loyalty.proyectoTDD.pojo.database.Suscripciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IClientRepository extends JpaRepository<Suscripciones, Integer> {
    @Query(value = "SELECT count(*) FROM cl_suscripciones WHERE sus_codigo_cliente =(:codigoCliente) AND sus_estado = 'A'",nativeQuery = true)
    int isSuscribed(@Param("codigoCliente") String codigoCliente);
}
