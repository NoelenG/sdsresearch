package com.devsuperiornoelen.dsresearch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperiornoelen.dsresearch.entities.Game;
import com.devsuperiornoelen.dsresearch.entities.Genre;
@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {  //configuções de acesso ao dados, camada de acesso ao dados,  objetos responsáveis por acessar os dados
	
}
