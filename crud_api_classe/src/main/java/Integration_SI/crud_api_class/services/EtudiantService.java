package Integration_SI.crud_api_class.services;

import Integration_SI.crud_api_class.entity.Etudiant;

import java.util.List;

public interface EtudiantService {
    Etudiant createEtudiant(Etudiant etudiant);
    Etudiant getEtudiantByid(Long etudiantId);
    List<Etudiant> getAllEtudiant();
    Etudiant updateEtudiant (Etudiant etudiant);
    void  deleteEtudiant (Long etudiantId);
}
