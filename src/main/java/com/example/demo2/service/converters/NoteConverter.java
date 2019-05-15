package com.example.demo2.service.converters;

import com.example.demo2.dto.NoteDTO;
import com.example.demo2.model.Note;

public class NoteConverter implements Converter<Note, NoteDTO> {

    @Override
    public Note dtoToModel(NoteDTO noteDTO) {
        return new Note(
            noteDTO.noteId,
            noteDTO.title,
            noteDTO.content,
            noteDTO.createdAt,
            noteDTO.updatedAt
        );
    }

    @Override
    public NoteDTO modelToDto(Note note) {
        return new NoteDTO(
                note.getNoteID(),
                note.getTitle(),
                note.getContent(),
                note.getCreatedAt(),
                note.getUpdatedAt()
        );
    }
}
