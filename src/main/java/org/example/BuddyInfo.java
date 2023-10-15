package org.example;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class BuddyInfo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phone;

    /*
    @ManyToOne
    @JoinColumn(name="address_book_id")
    @JsonIgnore
    private AddressBook addressBook;
     */



    public BuddyInfo() {}
    public BuddyInfo(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("BuddyInfo{").append("id=").append(id).append(", name='").append(name).append('\'').append(", phone='").append(phone).append('\'').append('}').toString();
    }

    /*
    public AddressBook getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

     */
}
