package Integration_SI.crud_api_class.services;

import Integration_SI.crud_api_class.entity.Matiere;

import java.util.List;

public interface MatiereService {
    Matiere createMatiere(Matiere matiere);
    Matiere getMatiereByid(Long matiereId);
    List<Matiere> getAllMatiere();
    Matiere updateMatiere (Matiere matiere);
    void  deleteMatiere (Long matiereId);
}
