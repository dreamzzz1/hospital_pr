package essence;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class MedicalService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double cost;

    @ManyToMany(mappedBy = "services")
    private List<Appointment> appointments;

}
