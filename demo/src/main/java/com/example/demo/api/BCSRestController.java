package com.example.demo.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BeControlSupervivencia;
import com.example.demo.repository.BeControlSupervivenciaRepository;

@RestController
public class BCSRestController {
	private final BeControlSupervivenciaRepository superRepo;

	public BCSRestController(BeControlSupervivenciaRepository superRepo) {
		this.superRepo = superRepo;
	}
	

	//@GetMapping("/api/supervivencia")
    //public List<BeControlSupervivencia> findAll() { return superRepo.findAll(); }
	

	@GetMapping("/api/supervivencia/{nup}/{codPerFisica}")
    public List<BeControlSupervivencia> findById(@PathVariable String nup, @PathVariable String codPerFisica) {
        return superRepo.findByNupAndCodPerFisica(nup, codPerFisica);
    }



}
