package com.pagafacil.PagaFacil.Dominio.Evento;

import java.time.LocalDate;

public class Local {

    // --- Attributes (Fields) ---
    private int id;
    private String nome;
    private String cep;
    private int capacidade;
    private String descricao;
    private String imagem_url;
    private LocalDate data_cadastro;


    // --- Constructor ---
    // A constructor is a special method used to create objects of this class.
    // It initializes the attributes of the object.
    public Local(int id, String name, double price, int stockQuantity) {
        this.id = id; // 'this' refers to the current object
        this.nome = nome;
        this.cep = cep;
        this.capacidade = capacidade;
        this.descricao = descricao;
        this.imagem_url = imagem_url;
        this.data_cadastro = data_cadastro;

    }

    // --- Getter Methods ---
    // Getters are used to retrieve the values of the private attributes.
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getCep(){return cep;}
    public int getCapacidade(){return capacidade;}
    public String getDescricao(){return descricao;}
    public string getImagem_url(){return imagem_url;}
    public LocalDate getData_cadastro(){return data_cadastro;}

    // --- Setter Methods ---
    // Setters are used to modify the values of the private attributes.
    // They often include validation logic if needed.
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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
}