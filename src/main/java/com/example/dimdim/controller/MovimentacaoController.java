package com.example.dimdim.controller;

import com.example.dimdim.model.MovimentacaoFinanceira;

import com.example.dimdim.model.Cliente;

import com.example.dimdim.repository.MovimentacaoRepository;

import com.example.dimdim.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

@RequestMapping("/movimentacao")

public class MovimentacaoController {

    @Autowired

    private MovimentacaoRepository movimentacaoRepository;

    @Autowired

    private ClienteRepository clienteRepository;

    // Listar movimentações

    @GetMapping

    public String listarMovimentacoes(Model model) {

        List<MovimentacaoFinanceira> movimentacoes = movimentacaoRepository.findAll();

        model.addAttribute("movimentacoes", movimentacoes);

        return "movimentacoes";

    }

    // Formulário de nova movimentação

    @GetMapping("/nova")

    public String novaMovimentacao(Model model) {

        model.addAttribute("movimentacao", new MovimentacaoFinanceira());

        model.addAttribute("clientes", clienteRepository.findAll());

        return "movimentacao_form";

    }

    // Editar movimentação

    @GetMapping("/editar/{id}")

    public String editarMovimentacao(@PathVariable Integer id, Model model) {

        MovimentacaoFinanceira movimentacao = movimentacaoRepository.findById(id)

                .orElseThrow(() -> new IllegalArgumentException("Movimentação inválida"));

        model.addAttribute("movimentacao", movimentacao);

        model.addAttribute("clientes", clienteRepository.findAll());

        return "movimentacao_form";

    }

    // Salvar movimentação (novo ou edição)

    @PostMapping("/salvar")

    public String salvarMovimentacao(@ModelAttribute MovimentacaoFinanceira movimentacao) {

        if (movimentacao.getCliente() != null && movimentacao.getCliente().getId() != null) {

            Cliente cliente = clienteRepository.findById(movimentacao.getCliente().getId())

                    .orElseThrow(() -> new IllegalArgumentException("Cliente inválido"));

            movimentacao.setCliente(cliente);

        }

        movimentacaoRepository.save(movimentacao);

        return "redirect:/movimentacao";

    }

    // Deletar movimentação

    @GetMapping("/deletar/{id}")

    public String deletarMovimentacao(@PathVariable Integer id) {

        movimentacaoRepository.deleteById(id);

        return "redirect:/movimentacao";

    }

}