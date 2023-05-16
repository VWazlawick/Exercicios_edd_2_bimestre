package br.unipar.ex_01_1005.models;

import javax.swing.JOptionPane;

public class Metodos {
    
    private int solicitarPesquisa(){
        String input = JOptionPane.showInputDialog("Qual número deseja pesquisar:");
        return Integer.parseInt(input);
    }
    
    public int pesquisaLinear(int[]vetor){
        int numPesq = solicitarPesquisa();
        for(int i=0;i<vetor.length;i++){
            if(numPesq==vetor[i]){
                return i;
            }
        }
        return -1;
    }
    
    public int pesquisarBinaria(int[]vetor){
        int numPesq = solicitarPesquisa();
        int direita, meio, esquerda;
        esquerda = 0;
        direita = vetor.length-1;
        
        while(esquerda<=direita){
            meio = (esquerda+direita)/2;
            if(numPesq==vetor[meio]){
                return meio;
            }else if(numPesq>vetor[meio]){
                esquerda = meio+1;
            }else{
                direita = meio -1;
            }
        }
        return -1;
    }
}
