package com.devsuperiornoelen.dsresearch.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperiornoelen.dsresearch.GameDTO;
import com.devsuperiornoelen.dsresearch.entities.Game;
import com.devsuperiornoelen.dsresearch.repositories.GameRepository;
import com.devsuperiornoelen.dsresearch.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	@Autowired
	private GameService service;
	//entregar instancia do game repository automaticamente
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
