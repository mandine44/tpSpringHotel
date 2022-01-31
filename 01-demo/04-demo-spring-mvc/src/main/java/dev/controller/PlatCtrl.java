package dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController // @Controller + @ResponseBody
@RequestMapping("plats") // requêtes en /plats
public class PlatCtrl {

    //    @RequestMapping(
//            method = RequestMethod.GET, // Méthode GET
//            path = "hello1"
//    )
    @GetMapping("hello1")
    // au total pour ma requête => GET /plats/hello1
    public String bonjour1() {
        return "hello 1 depuis PlatCtrl";
    }

    //    @RequestMapping(
//            method = RequestMethod.GET, // Méthode GET
//            path = "hello2"
//    )
    @GetMapping("hello2")
    public String bonjour2(@RequestParam String prenom, @RequestParam String nom) {
        return "Hello " + prenom + " " + nom;
    }
}
