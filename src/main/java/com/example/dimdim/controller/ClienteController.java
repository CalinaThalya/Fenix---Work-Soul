package com.example.dimdim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.dimdim.model.Cliente;
import com.example.dimdim.repository.ClienteRepository;
import org.springframework.ui.Model;

@Controller

@RequestMapping("/cliente")

public class ClienteController {

    @Autowired

    private ClienteRepository clienteRepository;

    @GetMapping

    public String listarClientes(Model model) {

        model.addAttribute("cliente", clienteRepository.findAll());

        return "cliente";

    }

    @GetMapping("/novo")

    public String novoCliente(Model model) {

        model.addAttribute("cliente", new Cliente());

        return "cliente_form";

    }

    @GetMapping("/editar/{id}")

    public String editarCliente(@PathVariable Integer id, Model model) {

        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Cliente inválido"));

        model.addAttribute("cliente", cliente);

        return "cliente_form";

    }

    @PostMapping("/salvar")

    public String salvarCliente(@ModelAttribute Cliente cliente) {

        clienteRepository.save(cliente);

        return "redirect:/cliente";

    }

    @GetMapping("/deletar/{id}")

    public String deletarCliente(@PathVariable Integer id) {

        clienteRepository.deleteById(id);

        return "redirect:/cliente";

    }

}
