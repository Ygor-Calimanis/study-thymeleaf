package com.github.acnaweb.study_thymeleaf.controller;


import com.github.acnaweb.study_thymeleaf.model.Pessoa;
import com.github.acnaweb.study_thymeleaf.repository.PessoaMockup;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.acnaweb.study_thymeleaf.model.Pessoa;
import com.github.acnaweb.study_thymeleaf.repository.PessoaMockup;


@Controller
@RequestMapping("/pessoas")
public class PessoaController {


    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "pessoa/form.html";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("pessoas", PessoaMockup.list());
        return "pessoa/list.html";
    }

    // pessoas save
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Pessoa pessoa) {
        System.out.println(pessoa.getId());
        System.out.println(pessoa.getNome());
        return "pessoa/form.html";
    }
}
