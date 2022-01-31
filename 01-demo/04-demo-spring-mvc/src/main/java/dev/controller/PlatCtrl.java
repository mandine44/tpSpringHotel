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
    // hello2?nom=?&prenom=?
    public String bonjour2(@RequestParam String prenom, @RequestParam String nom) {
        return "Hello " + prenom + " " + nom;
    }

    // http://localhost:8080/a1/b1/c1?p1=?&p2=?
    // PROTOCOL://MACHINE:PORT/PATH?PARAMS

    @GetMapping("hello3/{nom}/{prenom}/details")
    // hello3/{nom}/{prenom}/details?age=X
    public String bonjour3(@RequestParam Integer age, @PathVariable String prenom, @PathVariable String nom) {
        return "Hello " + prenom + " " + nom + " age : " + age;
    }

    @GetMapping("hello4/{nom}/{prenom}/details")
    // hello4/{nom}/{prenom}/details?age=X
    public String bonjour4(
            @RequestParam Integer age,
            @PathVariable String prenom,
            @PathVariable String nom,
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader("mon-entete-a-moi") String monEntete,
            @RequestBody String texte) {
        return "Hello " + prenom + " " + nom + " age : " + age
                + " User Agent : " + userAgent + " mon entête : " + monEntete
                + " corps : " + texte;
    }
}
