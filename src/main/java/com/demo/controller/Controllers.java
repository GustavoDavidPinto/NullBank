package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controllers {

    @PostMapping("/salvar")
    @ResponseBody
    public String salvar(@RequestParam("nome") String nome) {

        String nomeUsuario = nome;

        System.out.println("Nome recebido: " + nomeUsuario);

        return "Nome armazenado na variável: " + nomeUsuario;
    }
}
