package sn.isi.mykspace.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100, nullable = false)
    private String nom;
    @Column(length = 100, nullable = false)
    private String prenom;
    @Column(length = 150, nullable = false, unique = true)
    private String pseudo;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(length = 150, nullable = false)
    private String motDePasse;
    @Column(length = 17, nullable = false, unique = true)
    private String telephone;
    @Column(length = 80, nullable = false)
    private Boolean statut;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();

}