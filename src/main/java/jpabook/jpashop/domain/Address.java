package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Getter
@Embeddable
public class Address {

    private String city;
    private String street;

    private String zipCode;

     public Address(String city, String street, String zipCode) {
         this.city = city;
         this.street = street;
         this.zipCode = zipCode;

     }


    public Address() {

    }
}
