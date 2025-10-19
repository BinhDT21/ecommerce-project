package com.ecomerce.ecomerce_website.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "receiver_name")
    private String receiverName;
    @Column(name = "receiver_phone_number")
    private String receiverPhoneNumber;
    @Column(name = "address_line")
    private String addressLine;
    @Column(name = "city")
    private String city;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
