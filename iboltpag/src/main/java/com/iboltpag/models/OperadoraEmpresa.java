package com.iboltpag.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="model")
public class OperadoraEmpresa {
    @XmlElement
    private Long codigoOperadoraEmpresa;
    @XmlElement
    private Empresa fkEmpresa;
    @XmlElement
    private Operadoras fkOperadora;
    @XmlElement
    private String numeroOperadoraCielo;
    @XmlElement
    private String chaveOperadoraCielo;
    @XmlElement
    private String numeroFiliacaoRede;
    @XmlElement
    private String userRede;
    @XmlElement
    private String pwdRede;
    @XmlElement
    private Boolean capturaAutomatica;
    @XmlElement
    private String codigoEmpresaBanco;
    @XmlElement
    private Integer numeroAgencia;
    @XmlElement
    private Integer digitoAgencia;
    @XmlElement
    private Integer numeroConta;
    @XmlElement
    private Integer digitoConta;
    @XmlElement
    private Integer digitoAgenciaConta;
    @XmlElement
    private Long numeroSequencialRemessa;
    @XmlElement
    private Integer codigoCarteira;
    @XmlElement
    private Integer temMulta;
    @XmlElement
    private Double percentualAtraso;
    @XmlElement
    private Double valorDesconto;
    @XmlElement
    private Double valorMora;
    @XmlElement
    private Integer numeroDiasDesconto;
    @XmlElement
    private String rateio;
    @XmlElement
    private Integer especieTitulo;
    @XmlElement
    private String mensagemBoleto;
    @XmlElement
    private String numeroConvenioLiderBancodoBrasil;
    @XmlElement
    private String numeroConvenioBancodoBrasil;
    @XmlElement
    private Long codigoVariacaoCarteiraBancodoBrasil;
    @XmlElement
    private String tipoCobrancaBancodoBrasil;
	public Long getCodigoOperadoraEmpresa() {
		return codigoOperadoraEmpresa;
	}
	public void setCodigoOperadoraEmpresa(Long codigoOperadoraEmpresa) {
		this.codigoOperadoraEmpresa = codigoOperadoraEmpresa;
	}
	public Empresa getFkEmpresa() {
		return fkEmpresa;
	}
	public void setFkEmpresa(Empresa fkEmpresa) {
		this.fkEmpresa = fkEmpresa;
	}
	public Operadoras getFkOperadora() {
		return fkOperadora;
	}
	public void setFkOperadora(Operadoras fkOperadora) {
		this.fkOperadora = fkOperadora;
	}
	public String getNumeroOperadoraCielo() {
		return numeroOperadoraCielo;
	}
	public void setNumeroOperadoraCielo(String numeroOperadoraCielo) {
		this.numeroOperadoraCielo = numeroOperadoraCielo;
	}
	public String getChaveOperadoraCielo() {
		return chaveOperadoraCielo;
	}
	public void setChaveOperadoraCielo(String chaveOperadoraCielo) {
		this.chaveOperadoraCielo = chaveOperadoraCielo;
	}
	public String getNumeroFiliacaoRede() {
		return numeroFiliacaoRede;
	}
	public void setNumeroFiliacaoRede(String numeroFiliacaoRede) {
		this.numeroFiliacaoRede = numeroFiliacaoRede;
	}
	public String getUserRede() {
		return userRede;
	}
	public void setUserRede(String userRede) {
		this.userRede = userRede;
	}
	public String getPwdRede() {
		return pwdRede;
	}
	public void setPwdRede(String pwdRede) {
		this.pwdRede = pwdRede;
	}
	public Boolean getCapturaAutomatica() {
		return capturaAutomatica;
	}
	public void setCapturaAutomatica(Boolean capturaAutomatica) {
		this.capturaAutomatica = capturaAutomatica;
	}
	public String getCodigoEmpresaBanco() {
		return codigoEmpresaBanco;
	}
	public void setCodigoEmpresaBanco(String codigoEmpresaBanco) {
		this.codigoEmpresaBanco = codigoEmpresaBanco;
	}
	public Integer getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(Integer numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public Integer getDigitoAgencia() {
		return digitoAgencia;
	}
	public void setDigitoAgencia(Integer digitoAgencia) {
		this.digitoAgencia = digitoAgencia;
	}
	public Integer getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}
	public Integer getDigitoConta() {
		return digitoConta;
	}
	public void setDigitoConta(Integer digitoConta) {
		this.digitoConta = digitoConta;
	}
	public Integer getDigitoAgenciaConta() {
		return digitoAgenciaConta;
	}
	public void setDigitoAgenciaConta(Integer digitoAgenciaConta) {
		this.digitoAgenciaConta = digitoAgenciaConta;
	}
	public Long getNumeroSequencialRemessa() {
		return numeroSequencialRemessa;
	}
	public void setNumeroSequencialRemessa(Long numeroSequencialRemessa) {
		this.numeroSequencialRemessa = numeroSequencialRemessa;
	}
	public Integer getCodigoCarteira() {
		return codigoCarteira;
	}
	public void setCodigoCarteira(Integer codigoCarteira) {
		this.codigoCarteira = codigoCarteira;
	}
	public Integer getTemMulta() {
		return temMulta;
	}
	public void setTemMulta(Integer temMulta) {
		this.temMulta = temMulta;
	}
	public Double getPercentualAtraso() {
		return percentualAtraso;
	}
	public void setPercentualAtraso(Double percentualAtraso) {
		this.percentualAtraso = percentualAtraso;
	}
	public Double getValorDesconto() {
		return valorDesconto;
	}
	public void setValorDesconto(Double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	public Double getValorMora() {
		return valorMora;
	}
	public void setValorMora(Double valorMora) {
		this.valorMora = valorMora;
	}
	public Integer getNumeroDiasDesconto() {
		return numeroDiasDesconto;
	}
	public void setNumeroDiasDesconto(Integer numeroDiasDesconto) {
		this.numeroDiasDesconto = numeroDiasDesconto;
	}
	public String getRateio() {
		return rateio;
	}
	public void setRateio(String rateio) {
		this.rateio = rateio;
	}
	public Integer getEspecieTitulo() {
		return especieTitulo;
	}
	public void setEspecieTitulo(Integer especieTitulo) {
		this.especieTitulo = especieTitulo;
	}
	public String getMensagemBoleto() {
		return mensagemBoleto;
	}
	public void setMensagemBoleto(String mensagemBoleto) {
		this.mensagemBoleto = mensagemBoleto;
	}
	public String getNumeroConvenioLiderBancodoBrasil() {
		return numeroConvenioLiderBancodoBrasil;
	}
	public void setNumeroConvenioLiderBancodoBrasil(String numeroConvenioLiderBancodoBrasil) {
		this.numeroConvenioLiderBancodoBrasil = numeroConvenioLiderBancodoBrasil;
	}
	public String getNumeroConvenioBancodoBrasil() {
		return numeroConvenioBancodoBrasil;
	}
	public void setNumeroConvenioBancodoBrasil(String numeroConvenioBancodoBrasil) {
		this.numeroConvenioBancodoBrasil = numeroConvenioBancodoBrasil;
	}
	public Long getCodigoVariacaoCarteiraBancodoBrasil() {
		return codigoVariacaoCarteiraBancodoBrasil;
	}
	public void setCodigoVariacaoCarteiraBancodoBrasil(Long codigoVariacaoCarteiraBancodoBrasil) {
		this.codigoVariacaoCarteiraBancodoBrasil = codigoVariacaoCarteiraBancodoBrasil;
	}
	public String getTipoCobrancaBancodoBrasil() {
		return tipoCobrancaBancodoBrasil;
	}
	public void setTipoCobrancaBancodoBrasil(String tipoCobrancaBancodoBrasil) {
		this.tipoCobrancaBancodoBrasil = tipoCobrancaBancodoBrasil;
	}
}