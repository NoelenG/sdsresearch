package com.devsuperiornoelen.dsresearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperiornoelen.dsresearch.entities.Game;
@Repository
public interface GameRepository extends JpaRepository<Game, Long> {  //configuções de acesso ao dados, camada de acesso ao dados,  objetos responsáveis por acessar os dados
	
}
