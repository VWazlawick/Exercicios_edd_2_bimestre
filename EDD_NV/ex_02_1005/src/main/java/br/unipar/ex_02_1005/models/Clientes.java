package br.unipar.ex_02_1005.models;

import java.util.Date;

public class Clientes {
    private int idCliente;
    private String nmCliente;
    private String dtNasc;
    private String cpf;

    public Clientes() {
    }

    public Clientes(int idCliente, String nmCliente, String dtNasc, String cpf) {
        this.idCliente = idCliente;
        this.nmCliente = nmCliente;
        this.dtNasc = dtNasc;
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nmCliente=" + nmCliente + ", dtNasc=" + dtNasc + ", cpf=" + cpf + '}';
    }
    
    
}
