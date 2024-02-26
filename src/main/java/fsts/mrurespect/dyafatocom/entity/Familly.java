package fsts.mrurespect.dyafatocom.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;


@Entity
@Table(name = "familly")
@Getter
@Setter
public class Familly {
    @Id
    @Column
    private Long id;
    @Enumerated(EnumType.STRING)
    private Sexe sexe ;
    @Enumerated(EnumType.STRING)
    private Gender gender ;

}
