package com.vital.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vital.sena.models.entity.Paciente;
import com.vital.sena.models.service.PacienteService;

@RestController
@RequestMapping("/api/paciente")
@CrossOrigin(origins = "*",  methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT} )
public class PacienteController {
@Autowired
PacienteService pacienteService;
@GetMapping("/(id)")
public Optional<Paciente>buscarPorOId(@PathVariable Integer id){
	return pacienteService.findById(id);
}
@GetMapping("/listar")

public List<Paciente> listarTodos(){
return  pacienteService.findAll();
}
@PostMapping
public Paciente  guardar(@RequestBody Paciente e) {
	return pacienteService.save (e);
	
	
}
@DeleteMapping("/(id)")
public void eliminar(@PathVariable Integer id) {
	pacienteService.deleteById(id);
	
}
@PutMapping("/actualizar/(Id)")
public Paciente actualizar(@RequestBody Paciente e,@PathVariable Integer id ) {
	Paciente eEnBD= pacienteService.findById(id).get();
	eEnBD.setNombre(e.getNombre());
	eEnBD.setApellido(e.getApellido());
	eEnBD.setMail(e.getMail());
	eEnBD.setTelefono(e.getTelefono());
	eEnBD.setDireccion(e.getDireccion());
	
	return pacienteService.save(eEnBD);
}
}