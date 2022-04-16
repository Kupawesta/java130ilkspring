package com.Veli.java130ilkspring.controller;

import com.Veli.java130ilkspring.repository.entity.Urun;
import com.Veli.java130ilkspring.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/urun")
public class UrunController {

    @Autowired
    private UrunService service;
    @PostMapping("/save")
    public void save(String ad, String marka,
                     String model, double fiyat){
        Urun urun = new Urun (ad,"",marka,model,fiyat,100);
        service.save(urun);
    }
    @GetMapping("/findall")
    public ResponseEntity<List<Urun>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
}
