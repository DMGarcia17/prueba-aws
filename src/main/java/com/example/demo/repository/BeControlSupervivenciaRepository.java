package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BCSId;
import com.example.demo.model.BeControlSupervivencia;

import java.util.List;

public interface BeControlSupervivenciaRepository extends JpaRepository<BeControlSupervivencia, BCSId> {
	List<BeControlSupervivencia> findByNupAndCodPerFisica(String nup, String codPerFisica);
}
