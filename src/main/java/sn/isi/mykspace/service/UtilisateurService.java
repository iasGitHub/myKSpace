package sn.isi.mykspace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sn.isi.mykspace.entities.Utilisateur;
import sn.isi.mykspace.repository.UtilisateurRepository;

import java.util.List;

@Service
public class UtilisateurService {


    private UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }
    public List<Utilisateur> getUsers() {
        return utilisateurRepository.findAll();
    }

    // Ajout nouvel utilisateur
    public void save(Utilisateur utilisateur) {
        utilisateurRepository.save(utilisateur);
    }
}
