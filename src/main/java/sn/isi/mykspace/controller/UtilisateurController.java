package sn.isi.mykspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sn.isi.mykspace.entities.Utilisateur;
import sn.isi.mykspace.service.UtilisateurService;
import java.util.List;
import java.util.Optional;

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

    @RequestMapping("/utilisateurs/findById")
    @ResponseBody
    public Optional<Utilisateur> findById(int id) {
        return utilisateurService.findById(id);
    }

    @RequestMapping(value = "/utilisateurs/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Utilisateur utilisateur) {
        utilisateurService.save(utilisateur);
        return "redirect:/utilisateurs";
    }

    @RequestMapping(value = "/utilisateurs/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        utilisateurService.delete(id);
        return "redirect:/utilisateurs";
    }
}
