package sn.isi.mykspace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilisateurController {

    @GetMapping("/utilisateurs")
    public String getUsers() {
        return "utilisateur";
    }
}
