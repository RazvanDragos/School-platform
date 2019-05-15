package com.example.demo2.dto;

import java.util.Date;

public class NoteDTO {
    public Long noteId;
    public String title;
    public String content;
    public Date createdAt;
    public Date updatedAt;

    public NoteDTO(Long noteID, String title, String content, Date createdAt, Date updatedAt) {
        this.noteId = noteID;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
