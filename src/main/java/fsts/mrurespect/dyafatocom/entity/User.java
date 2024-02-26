package fsts.mrurespect.dyafatocom.entity;

import jakarta.persistence.*;

import java.lang.annotation.Target;
import java.util.List;

@Table(name = "user")
@Entity
public class User {
    @Column
    private String nom ;
    @Column
    private String prenom ;
    @Column
    private String tel ;
    @Enumerated(EnumType.STRING)
    private Sexe sexe ;
    @Column
    private int age ;
    @Column
    private String email ;
    @OneToMany
    private List<Familly> famillieMembers ;
    @Id
    private Long id;

}
