package com.jspider.project.bms;

import jakarta.persistence.*;

@Entity
@Table(name="audi_address")
public class Address extends BaseEntity {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long addressId;
@Column(name="street",nullable = false)
private String street;
    @Column(name="area",nullable = false)
    private String area;
    @Column(name="city",nullable = false)
    private String city;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
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

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
