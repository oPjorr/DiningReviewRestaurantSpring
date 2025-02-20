package com.example.DiningReviewRestaurantSpring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Table(name = "tb_dinner")
@Entity(name = "tb_dinner")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dinner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String imgUrl;

    @JsonIgnore
    @OneToMany(mappedBy = "plate")
    private List<Review> reviews = new ArrayList<>();

    @JsonIgnoreProperties("plates")
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
}
