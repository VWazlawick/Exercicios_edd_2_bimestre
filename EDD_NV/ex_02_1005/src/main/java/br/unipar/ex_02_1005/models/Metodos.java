package br.unipar.ex_02_1005.models;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {
    
    private ArrayList organizacaoBolha(ArrayList<Integer> lista){
        for(int i=0;i<lista.size()-1;i++){
            for(int j=0;j<lista.size()-i-1;j++){
                if(lista.get(j) > lista.get(j+1)){
                    int aux = lista.get(j);
                    lista.set(j, lista.get(j+1));
                    lista.set(j+1, aux);
                }
                            }
        }
        return lista;
    }
    
    private ArrayList<Integer> ajustarLista(ListaDeClientes lista){
        ArrayList<Integer> listaCodigos = new ArrayList<>();
        for(int i =0;i<lista.getListaCliente().size();i++){
            listaCodigos.add(lista.getListaCliente().get(i).getIdCliente());
        }
        return listaCodigos;
    }
    
    public int pesquisarBinaria(ListaDeClientes listaClientes,int numPesq){
        ArrayList<Integer> lista = new ArrayList<>();
        lista = ajustarLista(listaClientes);
        
        organizacaoBolha(lista);
        int direita, meio, esquerda;
        esquerda = 0;
        direita = lista.size()-1;
        
        while(esquerda<=direita){
            meio = (esquerda+direita)/2;
            if(numPesq==lista.get(meio)){
                return meio;
            }else if(numPesq>lista.get(meio)){
                esquerda = meio+1;
            }else{
                direita = meio -1;
            }
        }
        return -1;
    }
}
