package com.iboltpag.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Normalizer;

import com.iboltpag.models.Empresa;
import com.iboltpag.models.RetornoWS;
import com.iboltpag.models.Transacao;

public class TransacaoServices extends ControlServices {

	public RetornoWS<Transacao> insertTransaco(Transacao t) throws SQLException {
		String nome = Normalizer.normalize(t.getNomePagador(), Normalizer.Form.NFD);
		String logradouro = Normalizer.normalize(t.getLogradouroPagador(), Normalizer.Form.NFD);
		String complemento = Normalizer.normalize(t.getComplementoPagador(), Normalizer.Form.NFD);
		String bairro = Normalizer.normalize(t.getBairroPagador(), Normalizer.Form.NFD);
		String cidade = Normalizer.normalize(t.getCidadePagador(), Normalizer.Form.NFD);
		nome = nome.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		logradouro = logradouro.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		complemento = complemento.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		bairro = bairro.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		cidade = cidade.replaceAll("[^\\p{ASCII}]", "").toUpperCase();
		
		t.setNomePagador(nome);
		t.setLogradouroPagador(logradouro);
		t.setComplementoPagador(complemento);
		t.setBairroPagador(bairro);
		t.setCidadePagador(cidade);
		
		RetornoWS<Transacao> retorno = new RetornoWS<Transacao>();
	
		String sql = "INSERT INTO transacao (tipo_cobranca, fk_pedido_pagamento, fk_pedido, fk_forma_pagamento_operadora_empresa, "
				+ "valor_transacao, num_parcelas, valor_parcela,"
				+ "data_hora_pedido, data_vencimento_boleto,"
				+ "tipo_inscricao_pagador, inscricao_pagador, cep_pagador, nome_pagador, logradouro_pagador, numero_end_pagador, "
				+ "complemento_end_pagador, bairro_pagador, cidade_pagador, uf_pagador) " + "values ("
				+ t.getTipoCobranca() + ", " + t.getFkPedidoPagamento() + ", " + t.getFkPedido() + ", " + t.getFkFormaPgtoOperadoraEmpresa() + ", " 
				+ t.getValorTransacao() + ", " + t.getNumParcelas() + ", " + t.getValorTransacao() + ", DATE '"
				+ t.getDataHoraPedido() + "', " + "DATE '" + t.getDataVencimentoBoleto() + "', "
				+ t.getTipoInscricaoPagador() + ", " + "'" + t.getInscricaoPagador() + "', '" + t.getCepPagador() + "', '" + t.getNomePagador() + "', '"
				+ t.getLogradouroPagador() + "', '" + t.getNumeroPagador() + "', '" + t.getComplementoPagador() + "', '" + t.getBairroPagador() + "', '"
				+ t.getCidadePagador() + "', '" + t.getUfPagador() + "')";
		System.out.println(sql);
		this.sttm.execute(sql, 1);
		ResultSet rs = this.sttm.getGeneratedKeys();
		while (rs.next()) {
			t.setCodigoTransacao(Long.valueOf(rs.getLong(1)));
			retorno.setCodStatus(Long.valueOf(1));
			retorno.setMsg("Pedido inserido com sucesso");
			retorno.setModel(t);
		}
		rs.close();
		return retorno;
	}

	public RetornoWS<Transacao> getFormaPagamentoOperadoraEmpresa(Empresa empresa, Long idOperadora) throws SQLException {
		RetornoWS<Transacao> retorno = new RetornoWS<Transacao>();
		String sql = "SELECT forma_pagamento_operadora_empresa.id_forma_pagamento_operadora_empresa FROM forma_pagamento_operadora_empresa"
					+ " LEFT OUTER JOIN operadora_empresa ON forma_pagamento_operadora_empresa.fk_operadora_empresa = operadora_empresa.id_operadora_empresa"
					+ " LEFT OUTER JOIN forma_pagamento ON forma_pagamento_operadora_empresa.fk_forma_pagamento = forma_pagamento.id_forma_pagamento"
					+ "	WHERE operadora_empresa.fk_empresa = " + empresa.getCodigoEmpresa() + " AND forma_pagamento_operadora_empresa.fk_forma_pagamento = 22 AND operadora_empresa.fk_operadora = " + idOperadora;
		
		System.out.println(sql);
		ResultSet rs = this.sttm.executeQuery(sql);
        rs.last();
        int numeroRegistros = rs.getRow();
        rs.beforeFirst();
        if (numeroRegistros == 1) {
            while (rs.next()) {
                Transacao transacao = new Transacao();
                transacao.setFkFormaPgtoOperadoraEmpresa(rs.getLong("id_forma_pagamento_operadora_empresa"));

                retorno.setModel(transacao);
                retorno.setCodStatus(Long.valueOf(1));
                retorno.setMsg("Success");
            }
        } else if (numeroRegistros > 1) {
            retorno.setCodStatus(Long.valueOf(2));
            retorno.setMsg("Há mais de uma operadora cadastrada para esta forma de pagamento. Corrija e tente novamente");
            retorno.setModel(null);
        } else {
            retorno.setCodStatus(Long.valueOf(3));
            retorno.setMsg("Nenhuma operadora cadastrada para esta forma de pagamento!");
            retorno.setModel(null);
        }
        rs.close();
		
		return retorno;
	}
}