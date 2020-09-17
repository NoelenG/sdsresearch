package com.devsuperiornoelen.dsresearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiornoelen.dsresearch.entities.Game;
import com.devsuperiornoelen.dsresearch.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {  //configuções de acesso ao dados, camada de acesso ao dados,  objetos responsáveis por acessar os dados
	
}
