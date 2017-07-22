package Java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FuncionarioDAO {
    
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    Connection conexao;
    
    public void salvarFuncionario(Funcionario funcionario){
        
        sql="INSERT INTO Funcionarios(Nome,CPF,Telefone,Endereco) values(?,?,?,?)";
        try {
            //Inserir os dados do banco de dados
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            //Nome na primeira coluna
            pst.setString(1, funcionario.getNome());
            //CPF na segunda coluna
            pst.setInt(2, funcionario.getCPF());
            //Telefone na terceira coluna
            pst.setInt(3, funcionario.getTelefone());
            //Endereco na quarta coluna
            pst.setString(4, funcionario.getEndereco());
            
            //Cadastra no Banco
            pst.execute();
            
            //Fecha conexao do banco
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Cadastro Efetuado");
        } catch (Exception e) {
            System.out.println("Não Cadastrou");
        }
    }
    
    public void adicionarServico(Funcionario funcionario){
        sql="INSERT INTO Servicos(Servico, ValorServico) values(?,?)";
        try {
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            //Servicos na primeira coluna
            pst.setString(1, funcionario.getServicos());
            //Valores na segunda coluna
            pst.setInt(2, funcionario.getValorServico());
            
            //Cadastra no Banco
            pst.execute();
            
            //Fecha conexao do banco
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Serviço Adicionado!");
        } catch (Exception e) {
            System.out.println("Não Adicionou");
        }
    }
    
    public void removerServico(Funcionario funcionario){
        sql="DELETE FROM Servicos WHERE Servico = ?";
        
        try {
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            pst.setString(1,funcionario.getServicos());
            pst.setInt(2,funcionario.getValorServico());
            pst.execute();
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Servico Removido");
            
        } catch (Exception e) {
            System.out.println("Nao Removeu");
        }
    }
    
    public void alterarValor(Funcionario funcionario){
        sql = "UPDATE Servicos SET ValorServico = ?";
        
        try {
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            pst.setInt(2,funcionario.getValorServico());
            pst.execute();
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Preço Alterado");
        } catch (Exception e) {
            System.out.println("Preço inalterado");
        }
    }
    
    public void verAgenda(Funcionario funcionario){
        sql = "SELECT * FROM Agendamentos";
        
        try {
            while(rs.next()){
                rs.getString("Nome");
                rs.getInt("Horario");
            }
        } catch (Exception e) {
            System.out.println("Falha na Consulta");
        }
    }
}
