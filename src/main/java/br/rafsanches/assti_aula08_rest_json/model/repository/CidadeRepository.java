package br.rafsanches.assti_aula08_rest_json.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.rafsanches.assti_aula08_rest_json.model.beans.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

	public Cidade findByLatitudeAndLongitude(Double latitude, Double longitude);
	
	public List<Cidade> findByNomeStartingWith(String nome);

}
