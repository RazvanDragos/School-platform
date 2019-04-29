package com.example.demo2.dto;

import java.util.Date;

public class NoteDTO {
    public Long id;
    public String title;
    public String content;
    public Date createdAt;
    public Date updatedAt;

    public NoteDTO(Long id, String title, String content, Date createdAt, Date updatedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
