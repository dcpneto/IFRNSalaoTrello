package Java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AgentamentoDAO {
    
    PreparedStatement pst;
    ResultSet rs;
    String sql;
    Connection conexao;
    
    public void agendar(Agendamento agendamento){
        sql="INSERT INTO Agendamentos(cliente,mes,dia,hora,valor) values(?,?,?,?,?)";
        
        try {
            Connection conecta = DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA);
            
            pst = conecta.prepareStatement(sql);
            
            pst.setString(1, agendamento.getCliente());
            pst.setInt(2, agendamento.getMes());
            pst.setInt(3, agendamento.getDia());
            pst.setInt(4, agendamento.getHora());
            pst.setInt(5, agendamento.getValor());
            
            pst.execute();
            
            DBCon.getConnection(TIPOBANCO, NOMEBANCO, USUARIO, SENHA).close();
            System.out.println("Agendamento Efetuado");
        } catch (Exception e) {
            System.out.println("Agendamento falhou");
        }
    }
    
}
