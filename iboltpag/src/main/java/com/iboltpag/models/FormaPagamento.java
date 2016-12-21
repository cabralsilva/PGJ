package com.iboltpag.models;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.iboltpag.models.Empresa;
import com.iboltpag.models.Operadoras;
import com.iboltpag.models.OperadoraEmpresa;

@XmlRootElement(name="model")
public class FormaPagamento {
    @XmlElement
    private Long codigoFormaPagamento;
    @XmlElement
    private String descricaoFormaPagamento;
    @XmlElement
    private String bandeiraCartao;
    @XmlElement
    private String codigoCieloVista;
    @XmlElement
    private String codigoCieloPrazo;
    @XmlElement
    private String codigoRedeVista;
    @XmlElement
    private String codigoRedePrazo;
	public Long getCodigoFormaPagamento() {
		return codigoFormaPagamento;
	}
	public void setCodigoFormaPagamento(Long codigoFormaPagamento) {
		this.codigoFormaPagamento = codigoFormaPagamento;
	}
	public String getDescricaoFormaPagamento() {
		return descricaoFormaPagamento;
	}
	public void setDescricaoFormaPagamento(String descricaoFormaPagamento) {
		this.descricaoFormaPagamento = descricaoFormaPagamento;
	}
	public String getBandeiraCartao() {
		return bandeiraCartao;
	}
	public void setBandeiraCartao(String bandeiraCartao) {
		this.bandeiraCartao = bandeiraCartao;
	}
	public String getCodigoCieloVista() {
		return codigoCieloVista;
	}
	public void setCodigoCieloVista(String codigoCieloVista) {
		this.codigoCieloVista = codigoCieloVista;
	}
	public String getCodigoCieloPrazo() {
		return codigoCieloPrazo;
	}
	public void setCodigoCieloPrazo(String codigoCieloPrazo) {
		this.codigoCieloPrazo = codigoCieloPrazo;
	}
	public String getCodigoRedeVista() {
		return codigoRedeVista;
	}
	public void setCodigoRedeVista(String codigoRedeVista) {
		this.codigoRedeVista = codigoRedeVista;
	}
	public String getCodigoRedePrazo() {
		return codigoRedePrazo;
	}
	public void setCodigoRedePrazo(String codigoRedePrazo) {
		this.codigoRedePrazo = codigoRedePrazo;
	}
    
    
}
