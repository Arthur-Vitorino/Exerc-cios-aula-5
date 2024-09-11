package com.mycompany.pessoa1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa1 {
    private String nome;
    private LocalDate dataDeNascimento;
    private double altura;

    public Pessoa1(String nome, LocalDate dataDeNascimento, double altura) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        return Period.between(dataDeNascimento, hoje).getYears();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
               "Data de Nascimento: " + dataDeNascimento + "\n" +
               "Altura: " + altura + " metros\n" +
               "Idade: " + calcularIdade() + " anos";
    }

    public void imprimirDados() {
        System.out.println(this.toString());
    }
}
class Main {
    public static void main(String[] args) {
        Pessoa1 pessoa = new Pessoa1("João Silva", LocalDate.of(1990, 3, 15), 1.75);
        pessoa.imprimirDados();
    }
}
