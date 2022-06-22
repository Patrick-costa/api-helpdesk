package com.patrick.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.helpdesk.domain.Tecnico;



public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
