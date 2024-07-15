package essence;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date appointmentDateTime;

    @ManyToOne
    @JoinColumn(name = "doctorId", nullable = false)
    private doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patientId", nullable = false)
    private Patient patient;

    @ManyToMany
    @JoinTable(
            name = "appointmentService",
            joinColumns = @JoinColumn(name = "appointmentId"),
            inverseJoinColumns = @JoinColumn(name = "serviceId")
    )
    private List<MedicalService> services;

    @ManyToMany
    @JoinTable(
            name = "appointmentMaterial",
            joinColumns = @JoinColumn(name = "appointmentId"),
            inverseJoinColumns = @JoinColumn(name = "materialId")
    )
    private List<MedicalMaterial> materials;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public void setAppointmentDateTime(Date appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<MedicalService> getServices() {
        return services;
    }

    public void setServices(List<MedicalService> services) {
        this.services = services;
    }

    public List<MedicalMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(List<MedicalMaterial> materials) {
        this.materials = materials;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }
}
