package com.campusdual.appmazing.model.dao;

import com.campusdual.appmazing.model.Compras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComprasDao extends JpaRepository<Compras,Integer> {
    @Query(value = "SELECT u FROM Compras u WHERE u.contacto_id = :contact_id")
    public List<Compras> findComprasByContactId(@Param("contact_id") int contact_id);


//    @Query("SELECT COUNT(u) FROM COMPRAS u WHERE u.enabled = true")
//    public int getComprasCount();
//
//    @Query("SELECT COUNT(role) FROM COMPRAS u WHERE u.role='USER' AND u.enabled=true")
//    public int getUserRoleCount();
}
