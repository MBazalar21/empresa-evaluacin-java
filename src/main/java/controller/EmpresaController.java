package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.EmpresaDAO;
import repository.EmpresaRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/api/empresa")
public class EmpresaController{
    @Autowired
    private EmpresaRepository empresaRepository;

    @PostMapping
    public EmpresaDAO create(@RequestBody EmpresaDAO empresa){
        return empresaRepository.save(empresa);
    }

    @GetMapping
    public List<EmpresaDAO> findLastThree(){
        List<EmpresaDAO> empresas = empresaRepository.findAll();
        int size = empresas.size();
        return empresas.subList(size-3, size);
    }
}