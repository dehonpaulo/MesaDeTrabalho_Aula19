package com.dehon.MesaDeTrabalho_Aula19.controller;

import com.dehon.MesaDeTrabalho_Aula19.domain.Dentista;
import com.dehon.MesaDeTrabalho_Aula19.domain.Paciente;
import com.dehon.MesaDeTrabalho_Aula19.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("paciente")
public class PacienteRestController {

    @Autowired
    private PacienteService service;

    @GetMapping("listar")
    public List<Paciente> pacientes() {
        return service.listarPacientes();
    }

    @GetMapping("email/{email}")
    public Paciente pacientePorEmail(@PathVariable String email) {
        return service.pacientePorEmail(email);
    }

    @GetMapping("listardentistas")
    public List<Dentista> dentistas(){
        return service.listarDentistas();
    }

    @GetMapping("matricula/{matricula}")
    public Dentista dentistaPorMatricula(@PathVariable String matricula) {
        return service.dentistaPorMatricula(matricula);
    }

}