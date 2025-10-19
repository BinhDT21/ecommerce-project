package com.ecomerce.ecomerce_website.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "{errors.category.notBlank}")
    @Size(min = 0, max = 255, message = "{errors.category.invalidSize}")
    private String name;
    private String description;
    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Product> products;
}
