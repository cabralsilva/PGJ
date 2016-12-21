package com.iboltpag.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "model")
public class Operadoras {
	@XmlElement
	private Long codigoOperadora;
	@XmlElement
	private String nomeOperadora;
	@XmlElement
	private String urlWebService;
	@XmlElement
	private Boolean autorizacaoAutomaticaCielo;
	@XmlElement
	private String urlRetornoCielo;
	@XmlElement
	private String urlWSDLRede;
	@XmlElement
	private Boolean capturaAutomatica;
	@XmlElement
	private String codigoBanco;
	public Long getCodigoOperadora() {
		return codigoOperadora;
	}
	public void setCodigoOperadora(Long codigoOperadora) {
		this.codigoOperadora = codigoOperadora;
	}
	public String getNomeOperadora() {
		return nomeOperadora;
	}
	public void setNomeOperadora(String nomeOperadora) {
		this.nomeOperadora = nomeOperadora;
	}
	public String getUrlWebService() {
		return urlWebService;
	}
	public void setUrlWebService(String urlWebService) {
		this.urlWebService = urlWebService;
	}
	public Boolean getAutorizacaoAutomaticaCielo() {
		return autorizacaoAutomaticaCielo;
	}
	public void setAutorizacaoAutomaticaCielo(Boolean autorizacaoAutomaticaCielo) {
		this.autorizacaoAutomaticaCielo = autorizacaoAutomaticaCielo;
	}
	public String getUrlRetornoCielo() {
		return urlRetornoCielo;
	}
	public void setUrlRetornoCielo(String urlRetornoCielo) {
		this.urlRetornoCielo = urlRetornoCielo;
	}
	public String getUrlWSDLRede() {
		return urlWSDLRede;
	}
	public void setUrlWSDLRede(String urlWSDLRede) {
		this.urlWSDLRede = urlWSDLRede;
	}
	public Boolean getCapturaAutomatica() {
		return capturaAutomatica;
	}
	public void setCapturaAutomatica(Boolean capturaAutomatica) {
		this.capturaAutomatica = capturaAutomatica;
	}
	public String getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(String codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	
	
}