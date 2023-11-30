package Integration_SI.crud_api_class.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false)
    private  String Nom;
    @Column (nullable = false)
    private  String Prenom;
    @Column (nullable = false)
    private  int  Cin;
    @Column (nullable = false)
    private  int Num_carte_Etd;

    private Date Date_naissance;
    @Column (nullable = false)
    private  String Classe;






}
