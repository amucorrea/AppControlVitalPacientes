package com.vital.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vital.sena.models.entity.Paciente;
import com.vital.sena.repository.PacienteRepository;
@Service
public class PacienteServiceImpl implements PacienteService  {

@Autowired
PacienteRepository pacienteRepository;


	@Override

	public Optional<Paciente> findById(Integer id) {
	
		return pacienteRepository.findById(id);
	}

	@Override
	public List<Paciente> findAll() {
		
		return pacienteRepository. findAll();
	}

	@Override
	public Paciente save(Paciente e) {
		
		return pacienteRepository.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		 pacienteRepository.deleteById(id);
		
	}

}
