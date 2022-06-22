package com.patrick.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.helpdesk.domain.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
