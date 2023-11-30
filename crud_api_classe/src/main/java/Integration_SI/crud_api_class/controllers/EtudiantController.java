package Integration_SI.crud_api_class.controllers;

import Integration_SI.crud_api_class.entity.Etudiant;
import Integration_SI.crud_api_class.services.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //bich ya3rif eli hedha controller
@AllArgsConstructor
@RequestMapping("api/etudiant")
public class EtudiantController {

private EtudiantService etudiantService;
@PostMapping
    public ResponseEntity<Etudiant> createEtudiant(@RequestBody Etudiant etudiant){
    Etudiant savedEtudiant = etudiantService.createEtudiant(etudiant);
    return  new ResponseEntity<>(savedEtudiant, HttpStatus.CREATED);

}
@GetMapping("{id}")
    public ResponseEntity<Etudiant>getEtudiantById(@PathVariable("id") Long etudiantId){
    Etudiant etudiant= etudiantService.getEtudiantByid(etudiantId);
    return new ResponseEntity<>(etudiant,HttpStatus.OK);
}
@GetMapping
    public ResponseEntity<List<Etudiant>> getAllEtudiant(){
    List<Etudiant> etudiants= etudiantService.getAllEtudiant();
    return new ResponseEntity<>(etudiants,HttpStatus.OK);
    }
@PutMapping("{id}")
    public ResponseEntity<Etudiant> updateEtudiant(@PathVariable("id") Long etudiantId,
                                                   @RequestBody Etudiant etudiant) {
    etudiant.setId(etudiantId);
    Etudiant updateEtudiant = etudiantService.updateEtudiant(etudiant);
    return new ResponseEntity<>(updateEtudiant,HttpStatus.OK);

}
@DeleteMapping("{id}")
    public  ResponseEntity<String> deleteEtudiant(@PathVariable("id") Long etudiantId){
    etudiantService.deleteEtudiant(etudiantId);
    return new ResponseEntity<>("Etudiant successfully deleted!",HttpStatus.OK);
}

}
