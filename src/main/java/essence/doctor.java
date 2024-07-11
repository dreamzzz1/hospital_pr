package essence;

import essence.Patient;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String specialization;
    private String licenseNumber;
    private String contactInfo;

    @ManyToMany(mappedBy = "doctors")
    private List<Patient> patiens;
}
