package com.vital.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.vital.sena.models.entity.Paciente;

public interface PacienteService {
	public Optional<Paciente> findById(Integer id);
	 public List<Paciente> findAll();
	 public Paciente save(Paciente e);
	 public void deleteById(Integer id);

}
