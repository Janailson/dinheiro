package jsadev.com.br.dinheiro.models;

import com.google.gson.annotations.Expose;

import java.io.Serializable;

public class Planejamento implements Serializable {

    @Expose
    private int id;

    @Expose
    private String nome;

    @Expose
    private String parcela;

    @Expose
    private double valor;

    @Expose
    private String data;

    @Expose
    private int mes;

    @Expose
    private int ano;

    @Expose
    private boolean status;

    public Planejamento() {
    }

    public Planejamento(int id, String nome, String parcela, double valor, String data, int mes, int ano, boolean status) {
        this.id = id;
        this.nome = nome;
        this.parcela = parcela;
        this.valor = valor;
        this.data = data;
        this.mes = mes;
        this.ano = ano;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
