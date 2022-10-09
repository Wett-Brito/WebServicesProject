package com.persistencia.fiap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.persistencia.fiap.entities.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{
}
