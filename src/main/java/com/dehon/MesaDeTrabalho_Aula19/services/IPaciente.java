package com.dehon.MesaDeTrabalho_Aula19.services;

import com.dehon.MesaDeTrabalho_Aula19.domain.Dentista;
import com.dehon.MesaDeTrabalho_Aula19.domain.Paciente;

import java.util.List;

public interface IPaciente {
    List<Paciente> listarPacientes();

    Paciente pacientePorEmail(String email);

    List<Dentista> listarDentistas();

    Dentista dentistaPorMatricula(String matricula);
}
