package Associoados;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import socioavanti.planos.PlanoBronze;
import socioavanti.planos.PlanoOuro;
import socioavanti.planos.PlanoPrata;
import socioavanti.planos.Planos;

public class cadastroDeSocios {
    
    ArrayList <Planos> associadosAvanti = new ArrayList<>();    
    
           
        public void cadastrarSocioOuro(){
            Planos novoSocioO = new PlanoOuro();
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String cpf = JOptionPane.showInputDialog("Digite o CPF:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua Idade:"));
            novoSocioO.setNome(nome);
            novoSocioO.setCpf(cpf);
            novoSocioO.setIdade(idade);
            associadosAvanti.add(novoSocioO);
        }
        
        public void cadastrarSocioPrata(){
            Planos novoSocioP = new PlanoPrata();
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String cpf = JOptionPane.showInputDialog("Digite o CPF:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            novoSocioP.setNome(nome);
            novoSocioP.setCpf(cpf);
            novoSocioP.setIdade(idade);
            associadosAvanti.add(novoSocioP);
        }
        
        public void cadastrarSocioBronze(){
            Planos novoSocioB = new PlanoBronze();
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String cpf = JOptionPane.showInputDialog("Digite o CPF:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
            novoSocioB.setNome(nome);
            novoSocioB.setCpf(cpf);
            novoSocioB.setIdade(idade);
            associadosAvanti.add(novoSocioB);                       
        }
        
           
        public int localizaSocio(){                        
            int desc = 0;
            String id = JOptionPane.showInputDialog("Login");
            for (Planos p : associadosAvanti)
                if (p.getCpf().equals(id)) {
                    desc = p.getDesconto();
                    System.out.println(desc);
                }
            return desc;
            }
            
        
        
        public void exibirSocios(){
            for (Planos p : associadosAvanti)
            System.out.println(p);
        }
}