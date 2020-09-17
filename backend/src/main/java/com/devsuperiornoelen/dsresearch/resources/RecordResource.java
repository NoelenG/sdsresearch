package com.devsuperiornoelen.dsresearch.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperiornoelen.dsresearch.dto.RecordDTO;
import com.devsuperiornoelen.dsresearch.dto.RecordInsertDTO;
import com.devsuperiornoelen.dsresearch.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordResource {
	@Autowired
	private RecordService service;
	//entregar instancia do game repository automaticamente
	
	@PostMapping
	public ResponseEntity<RecordDTO> insert(@RequestBody RecordInsertDTO dto){
		
		RecordDTO newDTO = service.insert(dto);
		return ResponseEntity.ok().body(newDTO);
	}
}
