package com.pagafacil.PagaFacil.Dominio.Evento;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Evento {

    // --- Attributes (Fields) ---
    private int id;
    private String UUID;
    private String nome;
    private LocalDate data_inicio;
    private LocalDate data_fim;
    private Long localId;
    private String status;
    private BigDecimal precoEntrada;
    private int capacidade;
    private String descricao;
    private String imagem_url;
    private LocalDate data_cadastro;
    private LocalDate data_atualizacao;


    // --- Constructor ---
    // A constructor is a special method used to create objects of this class.
    // It initializes the attributes of the object.
    public Evento(
            int id,
            UUID uuid,
            String nome,
            LocalDate dataInicio,
            LocalDate dataFim,
            Long localId,
            String status,
            BigDecimal precoEntrada,
            int capacidade,
            String descricao,
            String imagemUrl,
            LocalDate dataCadastro,
            LocalDate dataAtualizacao
    ) {
        this.id = id;
        this.UUID = UUID;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.localId = localId;
        this.status = status;
        this.precoEntrada = precoEntrada;
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.imagemUrl = imagemUrl;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    // --- Getter Methods ---
    // Getters are used to retrieve the values of the private attributes.
    public int getId() {return id;}
    public UUID getUuid() {return uuid;}
    public String getNome() {return nome;}
    public LocalDate getDataInicio() {return dataInicio;}
    public LocalDate getDataFim() {return dataFim;}
    public Long getLocalId() {return localId;}
    public String getStatus() {return status;}
    public BigDecimal getPrecoEntrada() {return precoEntrada;}
    public String getCapacidade() {return capacidade;}
    public String getDescricao() {return descricao;}
    public String getImagemUrl() {return imagemUrl;}
    public LocalDate getDataCadastro() {return dataCadastro;}
    public LocalDate getDataAtualizacao() {return dataAtualizacao;}


    // --- Setter Methods ---
    // Setters are used to modify the values of the private attributes.
    // They often include validation logic if needed.
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0) { // Example of simple validation
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity >= 0) { // Example of simple validation
            this.stockQuantity = stockQuantity;
        } else {
            System.out.println("Stock quantity cannot be negative.");
        }
    }

    // --- Optional: toString() method ---
    // The toString() method provides a string representation of the object,
    // which is very useful for debugging and logging.
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                '}';
    }

    // --- Example of a custom method (business logic) ---
    public void decreaseStock(int quantity) {
        if (this.stockQuantity >= quantity) {
            this.stockQuantity -= quantity;
            System.out.println(quantity + " units of " + name + " removed from stock.");
        } else {
            System.out.println("Not enough " + name + " in stock to remove " + quantity + " units.");
        }
    }
}