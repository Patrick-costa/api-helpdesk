package com.patrick.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.patrick.helpdesk.domain.Chamado;
import com.patrick.helpdesk.domain.Cliente;
import com.patrick.helpdesk.domain.Tecnico;
import com.patrick.helpdesk.domain.enums.Perfil;
import com.patrick.helpdesk.domain.enums.Prioridade;
import com.patrick.helpdesk.domain.enums.Status;
import com.patrick.helpdesk.repositories.ChamadoRepository;
import com.patrick.helpdesk.repositories.ClienteRepository;
import com.patrick.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		Tecnico tec1 = new Tecnico(null, "Patrick", "102.973.977-37", "patrick23_costa@hotmail.com", encoder.encode("12345"));
		tec1.addPerfil(Perfil.ADMIN);
		
		Tecnico tec2 = new Tecnico(null, "Toretto", "574.577.820-28", "toretto@hotmail.com", encoder.encode("12345"));
		tec2.addPerfil(Perfil.TECNICO);
		
		
		Cliente cli1 = new Cliente(null, "Linus", "00667775773", "linus@gmail.com", encoder.encode("12345"));
	
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
	
		tecnicoRepository.saveAll(Arrays.asList(tec1, tec2));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
}
