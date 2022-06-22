package com.patrick.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.helpdesk.domain.Chamado;



public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
