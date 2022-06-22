package com.patrick.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patrick.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
