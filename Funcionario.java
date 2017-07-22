package Java;

public class Funcionario {
private static final long serialVersionUID = 1L;

    private int CPF;
    private String Nome;
    private int Telefone;
    private String Endereco;
    private String Servicos;
    private int ValorServico;
    
    public Funcionario(){
        
    }

    public int getValorServico() {
        return ValorServico;
    }

    public void setValorServico(int ValorServico) {
        this.ValorServico = ValorServico;
    }
    
    
    
    public String getServicos() {
        return Servicos;
    }

    public void setServicos(String Servicos) {
        this.Servicos = Servicos;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    

}
