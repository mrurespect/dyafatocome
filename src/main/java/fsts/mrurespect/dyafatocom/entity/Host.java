package fsts.mrurespect.dyafatocom.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "user")
@Entity
@Getter
@Setter
public class Host extends User {
    @Column
    private String cin ;
    @Column
    private String description ;
    @OneToMany
    private List<Language> languages ;

    @Enumerated(EnumType.STRING)
    private List<Service> services ;
    private  int rating ;
    @Id
    private Long id;



}
