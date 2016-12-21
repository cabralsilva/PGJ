package com.iboltpag.services;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.iboltpag.models.Empresa;
import com.iboltpag.models.RetornoWS;

public class EmpresaServices extends ControlServices {
	
	public RetornoWS<Empresa> autenticarAcesso(String usr, String pwd) throws SQLException {
		RetornoWS<Empresa> retorno = new RetornoWS<Empresa>();
		String sql = "SELECT empresa.* FROM empresa WHERE empresa.CNPJ = '" + usr + "' AND empresa.SENHA = '" + pwd + "'";
		ResultSet rs = this.sttm.executeQuery(sql);
        rs.last();
        int numeroRegistros = rs.getRow();
        rs.beforeFirst();
        if (numeroRegistros == 1) {
            while (rs.next()) {
                int inicio;
                Empresa empresa = new Empresa();
                empresa.setCodigoEmpresa(Long.valueOf(rs.getLong("CODIGO")));
                empresa.setCnpj(rs.getString("CNPJ"));
                empresa.setEmail(rs.getString("EMAIL"));
                empresa.setLogin(rs.getString("LOGIN"));
                empresa.setSenha(rs.getString("SENHA"));
                empresa.setTipoInscricao(Long.valueOf(rs.getLong("TIPO_INSCRICAO_EMPRESA")));

                retorno.setModel(empresa);
                retorno.setCodStatus(Long.valueOf(1));
                retorno.setMsg("Empresa Encontrada");
            }
        } else if (numeroRegistros > 1) {
            retorno.setCodStatus(Long.valueOf(2));
            retorno.setMsg("Há mais de uma empresa com este login cadastrado! Contate o administrador do sistema.");
            retorno.setModel(null);
        } else {
            retorno.setCodStatus(Long.valueOf(3));
            retorno.setMsg("Usuário ou senha inválido! Tente novamente.");
            retorno.setModel(null);
        }
        rs.close();
		
		return retorno;
	}
	
	
}