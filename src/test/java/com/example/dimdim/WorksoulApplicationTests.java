package com.example.dimdim;

import com.example.dimdim.model.Cliente;
import com.example.dimdim.repository.ClienteRepository;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class WorksoulApplicationTests {

    @Autowired
    private ClienteRepository clienteRepository;

    private static Integer clienteId;

    @Test
    @Order(1)
    void testarInsercaoCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome("Teste Automatizado");
        cliente.setCpf("12345678900");
        clienteRepository.save(cliente);
        clienteId = cliente.getId();

        assertNotNull(clienteId, "O cliente não foi salvo corretamente.");
    }

    @Test
    @Order(2)
    void testarConsultaCliente() {
        Optional<Cliente> cliente = clienteRepository.findById(clienteId);
        assertTrue(cliente.isPresent(), "Cliente não encontrado no banco.");
    }

    @Test
    @Order(3)
    void testarRemocaoCliente() {
        clienteRepository.deleteById(clienteId);
        Optional<Cliente> cliente = clienteRepository.findById(clienteId);
        assertFalse(cliente.isPresent(), "Cliente não foi removido do banco.");
    }
}