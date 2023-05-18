package com.github.acnaweb.study_thymeleaf.repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import com.github.acnaweb.study_thymeleaf.model.Pessoa;
import com.github.acnaweb.study_thymeleaf.model.SexoType;

public class PessoaMockup {

    public static List<Pessoa> list() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(1L, "Pelé", LocalDate.now(), SexoType.M));
        pessoas.add(new Pessoa(2L, "Maradona", LocalDate.now(), SexoType.M));
        pessoas.add(new Pessoa(3L, "Madonna", LocalDate.now(), SexoType.F));
        pessoas.add(new Pessoa(4L, "Rainha Beth",
                LocalDate.of(1870, Month.MAY, 30), SexoType.F));
        return pessoas;
    }

}
