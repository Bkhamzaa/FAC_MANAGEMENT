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
@Table(name="Matiere")
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column (nullable = false)
    private  String Nom_matiere;
    @Column (nullable = false)
    private  String Duree;
    @Column (nullable = false)
    private  int  Semester;
    @Column (nullable = false)
    private  String Prof;


}
