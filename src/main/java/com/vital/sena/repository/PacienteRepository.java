package com.vital.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vital.sena.models.entity.Paciente;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
