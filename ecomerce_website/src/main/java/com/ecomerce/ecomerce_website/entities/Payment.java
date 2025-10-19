package com.ecomerce.ecomerce_website.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String method;
    @Column(name = "payment_date")
    private LocalDateTime paymentDate;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
