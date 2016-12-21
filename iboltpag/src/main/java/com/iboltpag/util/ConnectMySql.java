package com.iboltpag.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLWarning;
import java.sql.Statement;

public class ConnectMySql {
    private Connection con;
    private Statement stmt;

    public Connection getCon() {
        return this.con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStmt() {
        return this.stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

    public ConnectMySql() throws Exception {
        //Class.forName("com.mysql.jdbc.Driver").newInstance();
    	Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
    	this.con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sii?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
        
        SQLWarning warning = null;
        warning = this.con.getWarnings();
        while (warning != null) {
            System.out.println("Warning: " + warning);
            warning = warning.getNextWarning();
        }
    }
}