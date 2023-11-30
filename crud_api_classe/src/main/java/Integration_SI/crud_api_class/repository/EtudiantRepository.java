package Integration_SI.crud_api_class.repository;

import Integration_SI.crud_api_class.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
