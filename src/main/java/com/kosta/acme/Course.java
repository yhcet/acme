package com.kosta.acme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
    @Id @GeneratedValue
    private long ID;
    private String Title;
    private String Duration;
    private String Description;
    private int MaxEnrollment;
    private int MinEnrollment;
    private int UnitPrice;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getMaxEnrollment() {
        return MaxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        MaxEnrollment = maxEnrollment;
    }

    public int getMinEnrollment() {
        return MinEnrollment;
    }

    public void setMinEnrollment(int minEnrollment) {
        MinEnrollment = minEnrollment;
    }

    public int getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        UnitPrice = unitPrice;
    }
}
