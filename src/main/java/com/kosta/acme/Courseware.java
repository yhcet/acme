package com.kosta.acme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Courseware {
    @Id @GeneratedValue
    private long ID;
    private int Type;
    private String Title;
    private int AuthorType;
    private String Description;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getAuthorType() {
        return AuthorType;
    }

    public void setAuthorType(int authorType) {
        AuthorType = authorType;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
