package com.jspider.project.bms;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="shows")
public class Shows {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="shows_time")
    private LocalDate Shows_time;
    @Column(name = "end_time")
    private LocalDate End_time;
    @Column (name="status")
    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getShows_time() {
        return Shows_time;
    }

    public void setShows_time(LocalDate shows_time) {
        Shows_time = shows_time;
    }

    public LocalDate getEnd_time() {
        return End_time;
    }

    public void setEnd_time(LocalDate end_time) {
        End_time = end_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

// one to one therir entity present
//audi_p