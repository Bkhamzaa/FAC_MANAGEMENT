package Integration_SI.crud_api_class.controllers;

import Integration_SI.crud_api_class.entity.Etudiant;
import Integration_SI.crud_api_class.entity.Matiere;
import Integration_SI.crud_api_class.services.EtudiantService;
import Integration_SI.crud_api_class.services.MatiereService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/Matiere")
public class MatiereController {

    private MatiereService matiereService;
    @PostMapping
    public ResponseEntity<Matiere> createMatiere(@RequestBody Matiere matiere){
        Matiere savedMatiere = matiereService.createMatiere(matiere);
        return  new ResponseEntity<>(savedMatiere, HttpStatus.CREATED);

    }
        @GetMapping("{id}")
        public ResponseEntity<Matiere>getMatiereById(@PathVariable("id") Long  matiereId){
            Matiere matiere= matiereService.getMatiereByid(matiereId);
            return new ResponseEntity<>(matiere,HttpStatus.OK);
        }

        @GetMapping
        public ResponseEntity<List<Matiere>> getAllMatiere(){
            List<Matiere> matieres= matiereService.getAllMatiere();
            return new ResponseEntity<>(matieres,HttpStatus.OK);
        }


    @PutMapping("{id}")
    public ResponseEntity<Matiere> updateEtudiant(@PathVariable("id") Long matiereId,
                                                   @RequestBody Matiere matiere) {
        matiere.setId(matiereId);
        Matiere updateMatiere = matiereService.updateMatiere(matiere);
        return new ResponseEntity<>(updateMatiere,HttpStatus.OK);

    }
    @DeleteMapping("{id}")
    public  ResponseEntity<String> deleteMatiere(@PathVariable("id") Long matiereId){
        matiereService.deleteMatiere(matiereId);
        return new ResponseEntity<>("Matiere successfully deleted!",HttpStatus.OK);
    }


    }
