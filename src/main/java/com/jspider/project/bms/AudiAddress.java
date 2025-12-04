package com.jspider.project.bms;

import jakarta.persistence.*;

@Entity
@Table(name="audi_addresssec")
public class AudiAddress {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Aaid;
    @Column(name="street")
    private String street;
    @Column(name="city")
    private String city;
    @Column(name="pincode")

    private Integer pincode;
    @OneToOne(mappedBy = "address")
    private Audi2 audi2;

    public Audi2 getAudi2() {
        return audi2;
    }

    public void setAudi2(Audi2 audi2) {
        this.audi2 = audi2;
    }

    public Long getAaid() {
        return Aaid;
    }

    public void setAaid(Long aaid) {
        Aaid = aaid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }
}
