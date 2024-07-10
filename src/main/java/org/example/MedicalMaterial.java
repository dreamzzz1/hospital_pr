package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class MedicalMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private int quantity;

    @ManyToMany(mappedBy = "materials")
    private List<Appointment> appointments;

}
