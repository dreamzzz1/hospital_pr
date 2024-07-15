package repository;

import essence.MedicalMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalMaterialRepository extends JpaRepository<MedicalMaterial, Long> {
}
