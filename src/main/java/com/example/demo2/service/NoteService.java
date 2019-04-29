package com.example.demo2.service;

import com.example.demo2.exception.NotFoundException;
import com.example.demo2.model.Note;
import com.example.demo2.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return noteRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Note", id));
    }
}
