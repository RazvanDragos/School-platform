package com.example.demo2.service;

import com.example.demo2.dto.NoteDTO;
import com.example.demo2.exception.NotFoundException;
import com.example.demo2.model.Note;
import com.example.demo2.repository.NoteRepository;
import com.example.demo2.service.converters.NoteConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;
    private final NoteConverter noteConverter;

    @Autowired
    public NoteService(NoteRepository noteRepository, NoteConverter noteConverter) {
        this.noteRepository = noteRepository;
        this.noteConverter = noteConverter;
    }

    public List<Note> getAll() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return noteRepository
                .findById(id)
                .orElseThrow(() -> new NotFoundException("Note", id));
    }

    public void insert(NoteDTO noteDTO) {
        Note note = noteConverter.dtoToModel(noteDTO);
        noteRepository.save(note);
    }

    public void deleteByID(Long id) {
        noteRepository.deleteById(id);
    }

    public void update(Long id, NoteDTO newNoteDTO) {
        Note note = noteRepository.getOne(id);
        note.setNoteID(newNoteDTO.noteID);
        note.setTitle(newNoteDTO.title);
        note.setContent(newNoteDTO.content);
        note.setCreatedAt(newNoteDTO.createdAt);
        note.setUpdatedAt(newNoteDTO.updatedAt);
        noteRepository.save(note);
    }

}
