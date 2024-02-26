package fsts.mrurespect.dyafatocom.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tourist extends User{

    @Column
    private String country ;
    @Column
    private String numPassport ;
    @Id
    private Long id;

}
