package com.example.acessoapi.domain.entities;

import java.time.LocalDateTime;

public class VisitDomain {

    private Long id;
    private LocalDateTime entry;
    private Long idResident;
    private Long idVisitor;

    public VisitDomain() {
    }

    public VisitDomain(Long id, LocalDateTime entry, Long idResident, Long idVisitor) {
        this.id = id;
        this.entry = entry;
        this.idResident = idResident;
        this.idVisitor = idVisitor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getEntry() {
        return entry;
    }

    public void setEntry(LocalDateTime entry) {
        this.entry = entry;
    }

    public Long getIdResident() {
        return idResident;
    }

    public void setIdResident(Long idResident) {
        this.idResident = idResident;
    }

    public Long getIdVisitor() {
        return idVisitor;
    }

    public void setIdVisitor(Long idVisitor) {
        this.idVisitor = idVisitor;
    }
}
