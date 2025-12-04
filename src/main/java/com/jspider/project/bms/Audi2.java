package com.jspider.project.bms;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="adudi_one")
public class Audi2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long auid;
    @Column(name="name")
    private String Name;
    @Column(name="seat_rows")
    private Integer seatRows;
    @Column(name ="col_rows")
    private Integer colRows;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Aaid")
    private AudiAddress address;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="audi_id")
  private ArrayList<Shows> shows;
    public AudiAddress getAddress() {
        return address;
    }

    public void setAddress(AudiAddress address) {
        this.address = address;
    }

    public Integer getColRows() {
        return colRows;
    }

    public void setColRows(Integer colRows) {
        this.colRows = colRows;
    }

    public Integer getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(Integer seatRows) {
        this.seatRows = seatRows;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getAuid() {
        return auid;
    }

    public void setAuid(long auid) {
        this.auid = auid;
    }
}
