package com.jspider.project.bms;

import jakarta.persistence.*;

@Entity
@Table(name = "auditorium")
public class Audi extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "audi_name", nullable = false)
    private String audiName;

    @Column(name = "seat_row", nullable = false)
    private Integer seatRow;

    @Column(name = "seat_col", nullable = false)
    private Integer seatCol;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "addrs_id")//FK
    private Address address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAudiName() {
        return audiName;
    }

    public void setAudiName(String audiName) {
        this.audiName = audiName;
    }

    public Integer getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(Integer seatRow) {
        this.seatRow = seatRow;
    }

    public Integer getSeatCol() {
        return seatCol;
    }

    public void setSeatCol(Integer seatCol) {
        this.seatCol = seatCol;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;

    }

    @Override
    public String toString() {
        return "Audi{" +
                "id=" + id +
                ", audiName='" + audiName + '\'' +
                ", seatRow=" + seatRow +
                ", seatCol=" + seatCol +
                ", address=" + address +
                '}';
    }
}
