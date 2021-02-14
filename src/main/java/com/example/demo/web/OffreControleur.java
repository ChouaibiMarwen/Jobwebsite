package com.example.demo.web;

import com.example.demo.dao.OffreRepository;
import com.example.demo.dao.RecruteurRepository;
import com.example.demo.entities.Offre;
import com.example.demo.entities.Recruteur;
import com.example.demo.entities.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/offre")
public class OffreControleur {
    @Autowired
    private OffreRepository offreRepository;
    @Autowired
    private RecruteurRepository recruteurRepository;

    @PostMapping("/ajouter/{id}")
    public Offre ajouterOffre(@RequestBody Offre offre,@PathVariable  Long id) {
        Recruteur recruteur=recruteurRepository.getOne(id );
        offre.setR(recruteur);
        return offreRepository.saveAndFlush(offre);
    }
    @GetMapping("/all")
    public List<Offre> getall() {
        return offreRepository.findAll();
    }

    @PutMapping("/update/{ido}/{idr}")
    public Offre updateOffre(@RequestBody Offre offre,@PathVariable Long ido, @PathVariable Long idr) {
    Recruteur recruteur=recruteurRepository.getOne(idr);
    offre.setId(ido);
    offre.setR(recruteur);

        return offreRepository.saveAndFlush(offre);
    }
    @DeleteMapping("/delete/{id}")
    public HashMap<String, String> deleteOffre(@PathVariable Long id) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            offreRepository.deleteById(id);
            hashMap.put("state", "yes");
        } catch (Exception e) {
            hashMap.put("state", "no");
        }

        return hashMap;

    }
    @GetMapping("/getprofil/{id}")
    public Offre getbyId(@PathVariable Long id) {

        return offreRepository.getOne(id);
    }
}
