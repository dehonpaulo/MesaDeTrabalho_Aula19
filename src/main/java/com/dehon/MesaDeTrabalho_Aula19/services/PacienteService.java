package com.dehon.MesaDeTrabalho_Aula19.services;

import com.dehon.MesaDeTrabalho_Aula19.domain.Dentista;
import com.dehon.MesaDeTrabalho_Aula19.domain.Endereco;
import com.dehon.MesaDeTrabalho_Aula19.domain.Paciente;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PacienteService implements IPaciente {

    private List<Paciente> pacientesList;
    private Map<String, Paciente> pacientesMap;
    private List<Dentista> dentistasList;
    private Map<String, Dentista> dentistasMap;

    public PacienteService() {

        this.pacientesList = new ArrayList<>();
        this.pacientesMap = new HashMap<>();
        this.dentistasList = new ArrayList<>();
        this.dentistasMap = new HashMap<>();

        Endereco endereco1 = new Endereco("Rua dos Eucaliptos", "100", "Florânia", "RN");
        Endereco endereco2 = new Endereco("Rua das Figueiras", "200", "Florânia", "RN");
        Endereco endereco3 = new Endereco("Rua dos Cajueiros", "300", "Florânia", "RN");

        Dentista dentista1 = new Dentista(1, "Mateus", "Dantas", "123456");
        Dentista dentista2 = new Dentista(2, "Pedro", "Costa", "654321");

        Paciente paciente1 = new Paciente(1, "João", "Alves", "joaoalves@mail.com", "700.900.100-10", new Date(), endereco1, dentista1);
        Paciente paciente2 = new Paciente(57490, "Thiago", "Silva", "thiagosilva@mail.com", "700.900.100-10", new Date(), endereco2, dentista2);
        Paciente paciente3 = new Paciente(36594, "Paulo", "Dehon", "paulodehon@mail.com", "700.900.100-10", new Date(), endereco3, dentista2);

        pacientesList.add(paciente1);
        pacientesList.add(paciente2);
        pacientesList.add(paciente3);
        pacientesMap.put(paciente1.getEmail(), paciente1);
        pacientesMap.put(paciente2.getEmail(), paciente2);
        pacientesMap.put(paciente3.getEmail(), paciente3);

        dentistasList.add(dentista1);
        dentistasList.add(dentista2);
        dentistasMap.put(dentista1.getMatricula(), dentista1);
        dentistasMap.put(dentista2.getMatricula(), dentista2);

    }

    @Override
    public List<Paciente> listarPacientes() {
        return this.pacientesList;
    }

    @Override
    public Paciente pacientePorEmail(String email) {
        return this.pacientesMap.get(email);
    }

    @Override
    public List<Dentista> listarDentistas() {
        return this.dentistasList;
    }

    @Override
    public Dentista dentistaPorMatricula(String matricula) {
        return this.dentistasMap.get(matricula);
    }

}
