package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String address;
    private String medicalHistory;

    @ManyToMany
    @JoinTable(
            name = "doctor_patient",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id")
    )
    private List<doctor> doctors;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;

}

