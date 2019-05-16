package com.example.demo2.controller;

import com.example.demo2.dto.NoteDTO;
import com.example.demo2.model.Note;
import com.example.demo2.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/notes", produces = "application/json")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Note> getAllNotes() {
        return noteService.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Note> getNoteById(@PathVariable(value = "id") Long noteID) {
        return new ResponseEntity<>(noteService.getNoteById(noteID), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insert(@RequestBody NoteDTO noteDTO) {
        noteService.insert(noteDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@PathVariable("id") Long id) {
        noteService.deleteByID(id);
    }

    @PatchMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable("id") Long id, @RequestBody NoteDTO newNoteDTO) {
        noteService.update(id, newNoteDTO);
    }

}
