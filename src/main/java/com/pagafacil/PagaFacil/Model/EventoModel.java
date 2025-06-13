
package com.pagafacil.PagaFacil.Model;

import com.example.demo.model.Produto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class EventoModel {

    private final List<Evento> produtos = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong(); // Para gerar IDs simulados

    public EventoModel() {
        // Adiciona alguns produtos de exemplo ao iniciar
        Eventos.add(new Evento(counter.incrementAndGet(), "Notebook Dell", "Core i7, 16GB RAM", new BigDecimal("5500.00")));
        Eventos.add(new Evento(counter.incrementAndGet(), "Mouse Gamer", "RGB, 10000 DPI", new BigDecimal("150.00")));
        Eventos.add(new Evento(counter.incrementAndGet(), "Teclado Mecânico", "Switch Brown", new BigDecimal("300.00")));
    }

    public List<Evento> findAll() {
        return new ArrayList<>(eventos); // Retorna uma cópia para evitar modificações externas
    }

    public Optional<Evento> findById(Long id) {
        return eventos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public Evento save(Evento evento) {
        if (evento.getId() == null) {
            evento.setId(counter.incrementAndGet()); // Gera um novo ID se não houver
        } else {
            // Se o ID já existe, remove o antigo antes de adicionar o novo (simula atualização)
            eventos.removeIf(p -> p.getId().equals(evento.getId()));
        }
        eventos.add(evento);
        return evento;
    }

    public Evento update(Long id, Evento eventoAtualizado) {
        return findById(id).map(eventoExistente -> {
            eventoExistente.setId(eventoAtualizado.getNome());
            eventoExistente.setUuid(eventoAtualizado.getNome());
            eventoExistente.setNome(eventoAtualizado.getNome());
            eventoExistente.setDescricao(eventoAtualizado.getDescricao());
            eventoExistente.setData_inicio(eventoAtualizado.getNome());
            eventoExistente.setData_fim(eventoAtualizado.getNome());
            eventoExistente.setLocal_id(eventoAtualizado.getNome());
            eventoExistente.setStatus(eventoAtualizado.getNome());
            eventoExistente.setPreco_entrada(eventoAtualizado.getNome());
            eventoExistente.setImagem_url(eventoAtualizado.getPreco());
            eventoExistente.setData_cadastro(eventoAtualizado.getNome());
            eventoExistente.setData_atualizacao(eventoAtualizado.getNome());


            return eventoExistente;
        }).orElse(null); // Retorna null se não encontrar
    }

    public boolean deleteById(Long id) {
        return eventos.removeIf(evento -> evento.getId().equals(id));
    }
}