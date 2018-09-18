
package socioavanti;

import Associoados.cadastroDeSocios;
import Compras.Compras;
import JogosCampeonato.Jogos;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class SocioAvanti {


    public static void main(String[] args) {
        
        // BASE CADASTRAL PARA LISTA DE JOGOS
        ArrayList <Jogos> campeonato = new ArrayList();               
        
        Jogos novaPartida = new Jogos("Palmeiras","Corinthians","Alianz Parque");                      
        campeonato.add(novaPartida);
        Jogos novaPartida1 = new Jogos("Palmeiras","Flamengo","Alianz Parque");                    
        campeonato.add(novaPartida1);
        Jogos novaPartida2 = new Jogos("Palmeiras","São Paulo","Alianz Parque");                      
        campeonato.add(novaPartida2);
        Jogos novaPartida3 = new Jogos("Palmeiras","Grêmio","Alianz Parque");                      
        campeonato.add(novaPartida3);
        Jogos novaPartida4 = new Jogos("Palmeiras","Chapecoense","Alianz Parque");                      
        campeonato.add(novaPartida4);
        Jogos novaPartida5 = new Jogos("Palmeiras","Paraná","Alianz Parque");                      
        campeonato.add(novaPartida5);
        Jogos novaPartida6 = new Jogos("Palmeiras","Internacional","Alianz Parque");                      
        campeonato.add(novaPartida6);
        Jogos novaPartida7 = new Jogos("Palmeiras","Ceara","Alianz Parque");                      
        campeonato.add(novaPartida7);
        
        cadastroDeSocios novo = new cadastroDeSocios();
        Compras novaCompra = new Compras();
        
        
        int aux = -1;
        while (0 != aux) {
        try {int opcao = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o que deseja fazer:"
                        + "\n1 - Me Cadastrar"
                        + "\n2 - Comprar Ingressos e Bebidas"
                        + "\n3 - Consultar Socios"
                        + "\n4 - Consultar jogos"
                        + "\n5 - Listar Vendas"
                        + "\n6 - Sair"));
        switch (opcao) {
            case 1:
                int plano = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o que deseja fazer:"
                        + "\n1 - Plano Ouro"
                        + "\n2 - Plano Prata"
                        + "\n3 - Plano Bronze"
                ));
                    switch (plano) {
                        case 1:      
                        novo.cadastrarSocioOuro();  
                            break;
                        case 2:
                            novo.cadastrarSocioPrata();
                            break;
                        case 3:                            
                            novo.cadastrarSocioBronze();
                            break;                                   
                        }break;                  
                           
            case 2:
                int compras = Integer.parseInt(
                JOptionPane.showInputDialog("Escolha o que deseja fazer:"
                        + "\n1 - Comprar Cervejas"
                        + "\n2 - Comprar Refrigerantes"
                        + "\n3 - Comprar Ingressos"
                ));
                    switch (compras) {
                        case 1:
                            novaCompra.comprarCerveja();
                            break;
                        case 2:
                            novaCompra.comprarRefrigerante();
                            break;
                        case 3:                            
                            novaCompra.compraIngresso();
                            break;            
                    }break;                    
                                   
            case 3:
                novo.exibirSocios();
                break;
            case 4:
                for (Jogos j : campeonato)
                //JOptionPane.showMessageDialog(null, j);
                System.out.println(j);
                break;
                
             case 5:                            
                novaCompra.exibirCompras();
                break;                 
                
            case 6:                
                aux = 0;
                break;
                 }}catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Opção inválida, insira uma das opções informadas!");;                    
                        }
            }
        }            
    }
