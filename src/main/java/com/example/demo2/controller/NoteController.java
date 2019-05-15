package com.example.demo2.controller;

import com.example.demo2.model.Note;
import com.example.demo2.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/note", produces = "application/json")
public class NoteController {
    private final NoteService noteService;

    @Autowired
    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public ResponseEntity<List<Note>> getAllNotes() {
        return new ResponseEntity<>(noteService.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Note> getCompanyById(@PathVariable("id") Long noteId) {
        return new ResponseEntity<>(noteService.getNoteById(noteId), HttpStatus.FOUND);
    }

    /*@GetMapping("/notes")
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @GetMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note) {
        return noteRepository.save(note);
    }

    @GetMapping("/notes/{studentID}")
    public Note getNoteById(@PathVariable(value = "studentID") Long noteID) {
        return noteRepository.findById(noteID)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "studentID", noteID));
    }

    @PutMapping("/notes/{studentID}")
    public Note updateNote(@PathVariable(value = "studentID") Long noteID, @Valid @RequestBody Note noteDetails) {
        Note note = noteRepository.findById(noteID)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "studentID", noteID));

        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        return noteRepository.save(note);
    }

    @DeleteMapping("/notes/{studentID}")
    public ResponseEntity<?> deleteNote(@PathVariable(value = "studentID") Long noteID) {
        Note note = noteRepository.findById(noteID)
                .orElseThrow(() -> new ResourceNotFoundException("Note", "studentID", noteID));

        noteRepository.delete(note);

        return ResponseEntity.ok().build();
    }*/
}
