
package socioavanti.planos;

public abstract class Planos {
        
    private String nome ;
    private String cpf;
    private int idade;   
    private int desconto;
    private String mensagem;
    
    
    public Planos(){
        
    }
    public Planos(String nome, String cpf, int idade, int desconto, String mensagem){            
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.desconto = desconto;
        this.mensagem = mensagem;
    }        
    
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public final void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDesconto() {
        return desconto;
    }

    public final void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public final void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    @Override
     public String toString() {
        return "Nome: "+this.nome+" Idade: "+this.idade+" Desconto: "+this.desconto+"%"+" Informacção "+this.mensagem; 
    }
}
