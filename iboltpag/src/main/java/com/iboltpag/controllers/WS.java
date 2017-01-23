package com.iboltpag.controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.SQLException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import com.iboltpag.models.Empresa;
import com.iboltpag.models.RetornoWS;
import com.iboltpag.models.Transacao;
import com.iboltpag.services.EmpresaServices;
import com.iboltpag.services.TransacaoServices;

@Path(value = "/")
public class WS {
	@GET
	@Path(value = "/testeWS")
	@Produces(value = { "application/json; charset=UTF-8" })
	public Response TesteWs(@QueryParam(value = "texto") String texto) throws InterruptedException {
		System.out.println("Texto: " + texto);
		RetornoWS<String> retorno = new RetornoWS<String>();
		retorno.setCodStatus(Long.valueOf(1));
		retorno.setMsg("WS OK");
		retorno.setModel(texto);
		System.out.println((Object) retorno);
		return Response.ok((Object) retorno).build();
	}

	@POST
	@Path(value = "/newtransctions")
	@Produces(value = { "application/json; charset=UTF-8" })
	public Response setTransction(Transacao t) {
		System.out.println("Inserindo transações: " + (Object) t);
		EmpresaServices es = new EmpresaServices();
		TransacaoServices ts = new TransacaoServices();
		RetornoWS<Transacao> retorno = new RetornoWS<Transacao>();
		try {
			es.CreateConnection();
		} catch (Exception erro) {
			System.out.println("Erro ao criar a conexão: " + erro);
			RetornoWS<Object> retornoE = new RetornoWS<Object>();
			retornoE.setCodStatus(Long.valueOf(4));
			retornoE.setMsg("Não foi possível acessar o banco de dados!" + erro.getMessage());
			retornoE.setModel((Object) null);
			erro.printStackTrace();
			return Response.ok((Object) retornoE).build();
		}
		
		RetornoWS<Empresa> retornoAutenticacao = new RetornoWS<Empresa>();
		try {
			retornoAutenticacao = es.autenticarAcesso(t.getUsr(), t.getPwd());
			System.out.println((Object) retornoAutenticacao);
			if (retornoAutenticacao.getCodStatus() == 2)
				return Response.ok((Object)retornoAutenticacao).build();
			else if(retornoAutenticacao.getCodStatus() == 3)
				return Response.status(404).build();
			else{
				ts.setSttm(es.getSttm());
				t.setFkFormaPgtoOperadoraEmpresa(ts.getFormaPagamentoOperadoraEmpresa(retornoAutenticacao.getModel(), 4L).getModel().getFkFormaPgtoOperadoraEmpresa());
			}
		} catch (SQLException erro) {
			RetornoWS<Object> retornoE = new RetornoWS<Object>();
			retornoE.setCodStatus(Long.valueOf(4));
			retornoE.setMsg("Erro ao autenticar acesso!" + erro.getMessage());
			retornoE.setModel((Object) null);
			es.CloseConnection();
			System.out.println((Object) retornoE);
			return Response.ok((Object) retornoE).build();
		}
		
		
		
		try {
			
			retorno = ts.insertTransaco(t);
			es.CloseConnection();
			return Response.ok((Object) retorno).build();
		} catch (Exception erro) {
			es.CloseConnection();
			System.out.println("Erro ao inserir registro IBOLTPAG: " + erro);
			RetornoWS<Object> retornoE = new RetornoWS<Object>();
			retornoE.setCodStatus(Long.valueOf(4));
			retornoE.setMsg("Erro ao inserir registro IBOLTPAG: " + erro.getMessage());
			retornoE.setModel((Object) null);
			erro.printStackTrace();
			return Response.ok((Object) retornoE).build();
		}
	}	
	@POST
	@Path(value = "/newtransctions2")
	@Produces(value = { "application/json; charset=UTF-8" })
//	@Produces("text/plain")
	public Response setTransction2(	@FormParam("origem") Long origem, @FormParam("id_pedido") Long idPedido, 
									@FormParam("id_pagamento") Long idPagamento, @FormParam("forma_pagamento") Long formaPagamento,
									@FormParam("operador") Long operador, @FormParam("valor") Double valorTransacao,
									@FormParam("dataVencimentoDocumento") String dataVencimentoDocumento, @FormParam("num_parcelas") Long numParcelas,
									@FormParam("nome_pagador") String nomePagador, @FormParam("tipo_inscricao") Integer tipoInscricaoPagador,
									@FormParam("inscricao_pagador") String inscricaoPagador, @FormParam("cep_pagador") String cepPagador,
									@FormParam("logradouro_pagador") String logradouro, @FormParam("complemento_pagador") String complementoPagador,
									@FormParam("num_pagador") String numeroPagador, @FormParam("bairro_pagador") String bairroPagador,
									@FormParam("cidade_pagador") String cidadePagador, @FormParam("uf_pagador") String ufPagador,
									@FormParam("usr") String usr, @FormParam("pwd") String pwd, @FormParam("dataDocumento") String dataDocumento,
									@FormParam("valor_parcelas") Double valorParcela) {
		System.out.println("Verificando...");
		if(	origem != null && idPedido != null && idPagamento != null && formaPagamento != null && operador != null && valorTransacao != null && dataVencimentoDocumento != null && 
			numParcelas != null && nomePagador != null && tipoInscricaoPagador != null && inscricaoPagador != null && cepPagador != null && logradouro != null && complementoPagador != null && 
			numeroPagador != null && bairroPagador != null && cidadePagador != null && ufPagador != null && usr != null && pwd != null){
			
			
			EmpresaServices es = new EmpresaServices();
			TransacaoServices ts = new TransacaoServices();
			RetornoWS<Transacao> retorno = new RetornoWS<Transacao>();
			Transacao t = new Transacao();
			try {
				es.CreateConnection();
			} catch (Exception erro) {
				System.out.println("Erro ao criar a conexão: " + erro);
				RetornoWS<Object> retornoE = new RetornoWS<Object>();
				retornoE.setCodStatus(Long.valueOf(4));
				retornoE.setMsg("Não foi possível acessar o banco de dados!" + erro.getMessage());
				retornoE.setModel((Object) null);
				erro.printStackTrace();
				return Response.ok((Object) retornoE)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.allow("OPTIONS").build();
			}
			
			
			RetornoWS<Empresa> retornoAutenticacao = new RetornoWS<Empresa>();
			try {
				retornoAutenticacao = es.autenticarAcesso(usr, pwd);
				System.out.println((Object) retornoAutenticacao);
				if (retornoAutenticacao.getCodStatus() == 2)
					return Response.ok((Object)retornoAutenticacao)
							.header("Access-Control-Allow-Origin", "*")
							.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
							.allow("OPTIONS").build();
				else if(retornoAutenticacao.getCodStatus() == 3)
					return Response.status(404)
							.header("Access-Control-Allow-Origin", "*")
							.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
							.allow("OPTIONS").build();
				else{
					ts.setSttm(es.getSttm());
					t.setFkFormaPgtoOperadoraEmpresa(ts.getFormaPagamentoOperadoraEmpresa(retornoAutenticacao.getModel(), operador).getModel().getFkFormaPgtoOperadoraEmpresa());
				}
			} catch (SQLException erro) {
				RetornoWS<Object> retornoE = new RetornoWS<Object>();
				retornoE.setCodStatus(Long.valueOf(4));
				retornoE.setMsg("Erro ao autenticar acesso!" + erro.getMessage());
				retornoE.setModel((Object) null);
				es.CloseConnection();
				System.out.println((Object) retornoE);
				return Response.ok((Object) retornoE)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.allow("OPTIONS").build();
			}
			
			
			try {
				t.setTipoCobranca(origem);
				t.setFkPedido(idPedido);
				t.setFkPedidoPagamento(idPagamento);
				t.setDataHoraPedido(dataDocumento);
				t.setDataVencimentoBoleto(dataVencimentoDocumento);
				
				t.setValorTransacao(valorTransacao);
				t.setNumParcelas(numParcelas);
				t.setValorParcela(valorParcela);
				
				t.setNomePagador(nomePagador);
				t.setTipoInscricaoPagador(tipoInscricaoPagador);
				t.setInscricaoPagador(inscricaoPagador);
				t.setCepPagador(cepPagador);
				t.setLogradouroPagador(logradouro);
				t.setComplementoPagador(complementoPagador);
				t.setNumeroPagador(numeroPagador);
				t.setBairroPagador(bairroPagador);
				t.setCidadePagador(cidadePagador);
				t.setUfPagador(ufPagador);
				retorno = ts.insertTransaco(t);
				es.CloseConnection();
				
				
				URL url = new URL("http://192.168.100.11:8080/sii/iboltpag/controllers/boletoController.php?idT="+t.getCodigoTransacao()+"&usr="+usr+"&pwd="+pwd);
				BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));


		        String inputLine;
		        String html = "";
		        while ((inputLine = in.readLine()) != null) {
		        	html += inputLine;
		        }
				in.close();
				//System.out.println("http://192.168.100.11:8080/sii/iboltpag/controllers/boletoController.php?idT="+t.getCodigoTransacao()+"&usr="+usr+"&pwd="+pwd); 
				//System.out.println(html);
				
				
				return Response.ok(html)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.allow("OPTIONS").build();
			} catch (Exception erro) {
				es.CloseConnection();
				System.out.println("Erro ao inserir registro IBOLTPAG: " + erro);
				RetornoWS<Object> retornoE = new RetornoWS<Object>();
				retornoE.setCodStatus(Long.valueOf(4));
				retornoE.setMsg("Erro ao inserir registro IBOLTPAG: " + erro.getMessage());
				retornoE.setModel((Object) null);
				erro.printStackTrace();
				return Response.ok((Object) retornoE)
						.header("Access-Control-Allow-Origin", "*")
						.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
						.allow("OPTIONS").build();
			}

			
		}else{
			return Response.ok("error")
					.header("Access-Control-Allow-Origin", "*")
					.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
					.allow("OPTIONS").build();
		}	
		
	}
}
