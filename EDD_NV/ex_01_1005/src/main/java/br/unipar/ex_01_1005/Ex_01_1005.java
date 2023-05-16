package br.unipar.ex_01_1005;

import br.unipar.ex_01_1005.models.Metodos;
import javax.swing.JOptionPane;

public class Ex_01_1005 {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        
        String input = JOptionPane.showInputDialog("Informe o tamanho do seu vetor:");
        int valor = Integer.parseInt(input);
        int[]vetor = new int[valor];
        //CRIAÇÃO DO VETOR COM O TAMANHO DEFINIDO PELO USUÁRIO
        
        for(int i =0;i<vetor.length;i++){
            String inputVetor = JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor:");
            vetor[i] = Integer.parseInt(inputVetor);   
        }
        //INSERIR VALORES NO VETOR
        
        for(int i=0;i<vetor.length-1;i++){
            for(int j=0;j<vetor.length-i-1;j++){
                if(vetor[j]>vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        //ORDENAÇÃO BOLHA - ORDENA O VETOR EM CRESCENTE
        
        String opcao = JOptionPane.showInputDialog("Deseja pesquisar o número em Linear(L) ou Binária(B):");
        
        switch (opcao.toUpperCase()) {
            case "L":
                JOptionPane.showMessageDialog(null, "O número está no vetor["+m.pesquisaLinear(vetor)+"]");                
                break;
            case "B":
                JOptionPane.showMessageDialog(null, "O número está no vetor["+m.pesquisarBinaria(vetor)+"]");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
                break;
        }
        
        
               
    }
}
