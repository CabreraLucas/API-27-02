package application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import application.repository.FilmeRepository;

import java.util.List;


@RestController
public class FilmeController {

    @Autowired
    FilmeRepository filmeRepo;
    
    @GetMapping("/filme")
    public List<Filme> listarFilmes() {
        return filmeRepo.findAll();
    }
}