package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
    
    public static Connection getConnection(String dbtype, String dbname, 
    String user, String pwd) {
    Connection con = null; 
    String db_class = ""; 
    String db_url = ""; 
    
    if (dbtype.equals(DBType.MYSQL)) {
db_class = DBType.MYSQL; 
db_url = "jdbc:mysql://localhost/"+ dbname + 
"?user="+ user + "&password=" + pwd;
} else if (dbtype.equals(DBType.SQLSERVER)) {
db_class = DBType.SQLSERVER;
db_url = 
"jdbc:sqlserver://localhost; databaseName="+dbname+
"; user="+user+";password=" +pwd+";" ; 
}

try { 
Class.forName(db_class);
con = DriverManager.getConnection(db_url); 
} catch (ClassNotFoundException ex) {
ex.printStackTrace();
} catch (SQLException ex) {
ex.printStackTrace();
}

return con; 
}
    
}
