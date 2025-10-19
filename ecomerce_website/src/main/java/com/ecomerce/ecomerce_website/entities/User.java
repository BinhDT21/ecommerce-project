package com.ecomerce.ecomerce_website.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String username;
    private String password;
    private String role;
    private String status;
    private String avatar;
    private boolean gender;
    @Column(name = "phone_number")
    private String phoneNumber;
    private LocalDate dob;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    //If need an object User with its addresses, create an object named UserDTO
    private List<Address> addresses;
    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Order> orders;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Review> reviews;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Cart> carts;
}
