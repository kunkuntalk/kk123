package com.mck.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection{
    private final String DBDriver ="com.mysql.cj.jdbc.Driver";
    private final String DBURL ="jdbc:mysql://localhost:3306/middleware";
    private final String DBUSER ="root";
    private final String DBPASSWORD ="mck666";
    private Connection conn = null;
//������
    public DataBaseConnection(){
       try{
           Class.forName(DBDriver);
           conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);
           }
        catch(Exception e){  }
                                 }

//�������
public Connection getConnection(){
return this.conn; }

//�ر�����
public void close() throws SQLException{
    this.conn.close(); }
} 
