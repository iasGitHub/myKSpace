package sn.isi.mykspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import sn.isi.mykspace.entities.Utilisateur;
import sn.isi.mykspace.service.UtilisateurService;

import java.util.List;

@Controller
public class UtilisateurController {

    private UtilisateurService utilisateurService;
    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }
    @GetMapping("/utilisateurs")
    public String getUsers(Model model) {
        List<Utilisateur> listeUtilisateurs = utilisateurService.getUsers();
        model.addAttribute("utilisateurs", listeUtilisateurs);
        return "utilisateur";
    }

    @PostMapping("/utilisateurs/addNew")
    public String addNew(Utilisateur utilisateur) {
        utilisateurService.save(utilisateur);
        return "redirect:/utilisateurs";
    }
}
