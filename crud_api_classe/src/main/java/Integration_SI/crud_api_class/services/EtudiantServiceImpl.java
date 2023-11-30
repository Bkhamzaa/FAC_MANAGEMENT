package Integration_SI.crud_api_class.services;

import Integration_SI.crud_api_class.entity.Etudiant;
import Integration_SI.crud_api_class.repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements EtudiantService   {


    private EtudiantRepository etudiantRepository;
    @Override
    public Etudiant createEtudiant(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant getEtudiantByid (Long EtudiantId){
        Optional<Etudiant> optionalEtudiant= etudiantRepository.findById(EtudiantId);
        return optionalEtudiant.get();

    }
    @Override
    public List<Etudiant> getAllEtudiant(){
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant updateEtudiant(Etudiant etudiant){
        Etudiant existingEtudiant = etudiantRepository.findById(etudiant.getId()).get();
        existingEtudiant.setCin(etudiant.getCin());
        existingEtudiant.setNom(etudiant.getNom());
        existingEtudiant.setPrenom(etudiant.getPrenom());
        existingEtudiant.setClasse(etudiant.getClasse());
        existingEtudiant.setDate_naissance(etudiant.getDate_naissance());
        existingEtudiant.setNum_carte_Etd((etudiant.getNum_carte_Etd()));
        Etudiant updateEtudiant = etudiantRepository.save(existingEtudiant);
        return updateEtudiant;
    }
    @Override
    public void deleteEtudiant(Long etudiantId){
        etudiantRepository.deleteById(etudiantId);
    }
}
