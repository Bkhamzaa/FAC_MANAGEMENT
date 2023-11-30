package Integration_SI.crud_api_class.services;

import Integration_SI.crud_api_class.entity.Matiere;
import Integration_SI.crud_api_class.repository.MatiereRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MatiereServiceImpl  implements  MatiereService  {

    private MatiereRepository matiereRespsitory;
    @Override
    public Matiere createMatiere(Matiere matiere){
        return matiereRespsitory.save(matiere);
    }

    @Override
    public Matiere getMatiereByid (Long matiereId){
        Optional<Matiere> optionalMatiere=matiereRespsitory.findById(matiereId);
        return optionalMatiere.get();

    }

    @Override
    public List<Matiere> getAllMatiere(){
        return matiereRespsitory.findAll();
    }

    @Override
    public Matiere updateMatiere(Matiere matiere){
        Matiere existingMatiere = matiereRespsitory.findById(matiere.getId()).get();
        existingMatiere.setNom_matiere(matiere.getNom_matiere());
        existingMatiere.setDuree(matiere.getDuree());
        existingMatiere.setSemester(matiere.getSemester());
        existingMatiere.setProf(matiere.getProf());

        Matiere updateMatiere = matiereRespsitory.save(existingMatiere);
        return updateMatiere;
    }

    @Override
    public void deleteMatiere(Long matiereId){
        matiereRespsitory.deleteById(matiereId);
    }

}
