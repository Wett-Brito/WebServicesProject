package com.persistencia.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persistencia.fiap.entities.Note;
import com.persistencia.fiap.repositories.NoteRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/notes")
public class NoteControler {

    @Autowired
    NoteRepository repository;

    @GetMapping
    @ApiOperation(value = "Busca todos as notas")
    public List<Note> getAll(){
        return repository.findAll();
        
    }

    @DeleteMapping(value = "/{id}")
    @ApiOperation(value = "Deleta uma nota por id")

    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
    	repository.deleteById(id);
    	
    	return ResponseEntity.noContent().build();
    }
    
    @PutMapping(value = "/{id}")
    @ApiOperation(value = "Altera um nota por id")
    public void updateById(@PathVariable Long id, @RequestBody Note order) {
    	Note entity = repository.findById(id).get();
    	entity.setText(order.getText());
    	repository.save(entity);
    	
    }
    
	@PostMapping()
    @ApiOperation(value = "Adiciona uma nova nota")
	public Note AddNew(@RequestBody Note order){
	    return repository.save(order);
	    
	}
}
