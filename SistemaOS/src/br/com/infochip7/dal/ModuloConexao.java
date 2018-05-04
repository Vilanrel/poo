package br.com.infochip7.dal;

import java.sql.*;

public class ModuloConexao {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/sistemaos";
    }
}
