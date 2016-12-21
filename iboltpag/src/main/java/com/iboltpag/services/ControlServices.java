package com.iboltpag.services;

import com.iboltpag.util.ConnectMySql;

import java.sql.SQLException;
import java.sql.Statement;

public class ControlServices {
    ConnectMySql cf;
    Statement sttm;

    public void CreateConnection() throws Exception {
        System.out.println("Criou a Conexão");
        this.cf = new ConnectMySql();
        this.sttm = this.cf.getCon().createStatement();
    }
    

    public void CloseConnection() {
        System.out.println("Fechou a Conexão");
        try {
            this.sttm.close();
            this.cf.getCon().close();
            super.finalize();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public ConnectMySql getCf() {
        return this.cf;
    }

    public void setCf(ConnectMySql cf) {
        this.cf = cf;
    }

    public Statement getSttm() {
        return this.sttm;
    }

    public void setSttm(Statement sttm) {
        this.sttm = sttm;
    }
}