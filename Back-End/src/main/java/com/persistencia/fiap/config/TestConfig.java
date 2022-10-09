package com.persistencia.fiap.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.persistencia.fiap.entities.Note;
import com.persistencia.fiap.repositories.NoteRepository;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private NoteRepository noteRepository;
	
	@Override
	public void run(String... args) throws Exception {

		Note n1 = new Note(null, "2022-10-05T20:07:45.584Z", "teste", 10L);
		Note n2 = new Note(null, "2022-10-06T20:07:45.584Z", "testsase", 10L);
		
		noteRepository.saveAll(Arrays.asList(n1, n2));
			

	}
}
