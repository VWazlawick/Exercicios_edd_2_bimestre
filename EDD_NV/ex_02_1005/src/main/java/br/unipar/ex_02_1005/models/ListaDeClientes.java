package br.unipar.ex_02_1005.models;

import java.util.ArrayList;

public class ListaDeClientes {
    private ArrayList<Clientes> listaCliente = new ArrayList<>();
    private String msg = "";

    public ListaDeClientes() {
    }

    public ArrayList<Clientes> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(Clientes cliente) {
        this.listaCliente.add(cliente);
    }

    private void mensagemLista(){
        for(int i=0;i<listaCliente.size();i++){
            msg += "\n" + listaCliente.get(i);
        }
    }
    
    @Override
    public String toString() {
        mensagemLista();
        return "ListaDeClientes{" + "listaCliente=" + msg + '}';
    }
    
    
    
    
}
