package Java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ClienteDAO {
    
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    Connection conexao;
    
    public void salvarCliente(Cliente cliente){
        
        sql="INSERT INTO Clientes(Nome,CPF,Telefone,Endereco) values(?,?,?,?)";
        try {
            //Inserir os dados do banco de dados
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            //Nome na primeira coluna
            pst.setString(1, cliente.getNome());
            //CPF na segunda coluna
            pst.setInt(2, cliente.getCPF());
            //Telefone na terceira coluna
            pst.setInt(3, cliente.getTelefone());
            //Endereco na quarta coluna
            pst.setString(4, cliente.getEndereco());
            
            //Cadastra no Banco
            pst.execute();
            
            //Fecha conexao do banco
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Cadastro Efetuado");
        } catch (Exception e) {
            System.out.println("Não Cadastrou");
        }
    }
    
    public void alterarEndereco(Cliente cliente){
        sql = "UPDATE Clientes SET Endereco = ?";
        
        try {
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            pst.setString(4,cliente.getEndereco());
            pst.execute();
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Endereço Alterado");
        } catch (Exception e) {
            System.out.println("Endereço inalterado");
        }
    }
    
    public void alterarTelefone(Cliente cliente){
        sql = "UPDATE Clientes SET Telefone = ?";
        
        try {
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            pst.setInt(3,cliente.getTelefone());
            pst.execute();
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Telefone Alterado");
        } catch (Exception e) {
            System.out.println("Telefone inalterado");
        }
    }
}
