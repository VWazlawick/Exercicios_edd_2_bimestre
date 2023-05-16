package br.unipar.ex_02_1005;

import br.unipar.ex_02_1005.models.Clientes;
import br.unipar.ex_02_1005.models.ListaDeClientes;
import br.unipar.ex_02_1005.models.Metodos;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Ex_02_1005 {

    public static void main(String[] args) {
        
        Clientes c1 = new Clientes(1, "Victor", "30/10/2003", "05889512935");
        
        Clientes c2 = new Clientes(2, "João", "27/05/2010", "03326168942");

        Clientes c3 = new Clientes(3,"Maria","29/11/1950","05812387421");

        Clientes c4 = new Clientes(4,"Mateus","11/01/2001", "05221345123");        
        
        ListaDeClientes lc1 = new ListaDeClientes();
        lc1.setListaCliente(c1);
        lc1.setListaCliente(c2);
        lc1.setListaCliente(c3);
        lc1.setListaCliente(c4);
        
        boolean op=true;
        
        while(op==true){
            String opcao = JOptionPane.showInputDialog("Deseja adicionar um novo cliente? ");
            
            switch (opcao.toUpperCase()) {
                case "A":
                    String inputCodigo = JOptionPane.showInputDialog("Informe o código:");
                    String inputNome = JOptionPane.showInputDialog("Informe o nome:");
                    String inputDtNasc = JOptionPane.showInputDialog("Informe a data de nascimento:");
                    String inputCpf = JOptionPane.showInputDialog("Informe o cpf:");
                    
                    lc1.setListaCliente(new Clientes(Integer.parseInt(inputCodigo), inputNome, inputDtNasc, inputCpf));
                    break;
                case "S":
                    op=false;
                    break;
                default:
                    op=false;
                    break;
            }
            
        }
        
        String codPesq = JOptionPane.showInputDialog("Informe o código de pesquisa:");
                
        Metodos m1 = new Metodos();
        int pos = m1.pesquisarBinaria(lc1, Integer.parseInt(codPesq));
        
        System.out.println(lc1.getListaCliente().get(pos));
    }
}
