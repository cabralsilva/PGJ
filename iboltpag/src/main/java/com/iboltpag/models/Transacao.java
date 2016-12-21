package com.iboltpag.models;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="model")
public class Transacao {
    @XmlElement
    private Long codigoTransacao;
    @XmlElement
    private Long tipoCobranca;
    @XmlElement
    private String tidTransacaoCielo;
    @XmlElement
    private String numeroSequencialRede;
    @XmlElement
    private String identificadorBoleto;
    
    @XmlElement
    private Long fkFormaPgtoOperadoraEmpresa;
    @XmlElement
    private Long fkPedido;
    @XmlElement
    private Long fkPedidoPagamento;
    
    @XmlElement
    private FormaPagamento fkFormaPagamento;
    @XmlElement
    private OperadoraEmpresa fkOperadoraEmpresa;
    
    @XmlElement
    private Double valorTransacao;
    @XmlElement
    private Double valorLiquido;
    @XmlElement
    private Double taxa;
    @XmlElement
    private Double valorDescontoBoleto;
    @XmlElement
    private Long numParcelas;
    @XmlElement
    private Double valorParcela;
    
    @XmlElement
    private String dataHoraPedido;
    @XmlElement
    private String dataHoraRetornoAutorizacao;
    @XmlElement
    private String dataHoraRetornoAutenticacao;
    @XmlElement
    private String dataHoraRetornoCaptura;
    @XmlElement
    private String dataHoraRetornoCancelamento;
    @XmlElement
    private String dataVencimentoBoleto;
    
    
    @XmlElement
    private Integer statusGeral;
    
    @XmlElement
    private Integer tipoInscricaoPagador;
    @XmlElement
    private String inscricaoPagador;
    @XmlElement
    private String cepPagador;
    @XmlElement
    private String nomePagador;
    @XmlElement
    private String logradouroPagador;
    @XmlElement
    private String complementoPagador;
    @XmlElement
    private String numeroPagador;
    @XmlElement
    private String bairroPagador;
    @XmlElement
    private String cidadePagador;
    @XmlElement
    private String ufPagador;
    
    
    @XmlElement
    private String dataArquivoRemessa;
    @XmlElement
    private Long sequencialRemessa;
    @XmlElement
    private String nomeArquivoRemessa;
    
    /*ESPECÍFICOS BANCO DO BRASIL*/
    private String tipoCobrancaBancoBrasil;
    /*FIM BANCO DO BRASIL*/
    
    /*ESPECÍFICOS BRADESCO*/
    private Integer primeiraInstrucaoBradesco;
    private Integer segundaInstrucaoBradesco;
    private Integer identificacaoOcorrenciaBradesco;
    /*FIM BRADESCO*/
    
    @XmlElement
    private String usr;
    @XmlElement
    private String pwd;
    
    
	public String getUsr() {
		return usr;
	}
	public void setUsr(String usr) {
		this.usr = usr;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
    
	public Long getCodigoTransacao() {
		return codigoTransacao;
	}
	public void setCodigoTransacao(Long codigoTransacao) {
		this.codigoTransacao = codigoTransacao;
	}
	public String getTidTransacaoCielo() {
		return tidTransacaoCielo;
	}
	public void setTidTransacaoCielo(String tidTransacaoCielo) {
		this.tidTransacaoCielo = tidTransacaoCielo;
	}
	public String getNumeroSequencialRede() {
		return numeroSequencialRede;
	}
	public void setNumeroSequencialRede(String numeroSequencialRede) {
		this.numeroSequencialRede = numeroSequencialRede;
	}
	public String getIdentificadorBoleto() {
		return identificadorBoleto;
	}
	public void setIdentificadorBoleto(String identificadorBoleto) {
		this.identificadorBoleto = identificadorBoleto;
	}
	public Long getFkFormaPgtoOperadoraEmpresa() {
		return fkFormaPgtoOperadoraEmpresa;
	}
	public void setFkFormaPgtoOperadoraEmpresa(Long fkFormaPgtoOperadoraEmpresa) {
		this.fkFormaPgtoOperadoraEmpresa = fkFormaPgtoOperadoraEmpresa;
	}
	public Long getFkPedido() {
		return fkPedido;
	}
	public void setFkPedido(Long fkPedido) {
		this.fkPedido = fkPedido;
	}
	public FormaPagamento getFkFormaPagamento() {
		return fkFormaPagamento;
	}
	public void setFkFormaPagamento(FormaPagamento fkFormaPagamento) {
		this.fkFormaPagamento = fkFormaPagamento;
	}
	public OperadoraEmpresa getFkOperadoraEmpresa() {
		return fkOperadoraEmpresa;
	}
	public void setFkOperadoraEmpresa(OperadoraEmpresa fkOperadoraEmpresa) {
		this.fkOperadoraEmpresa = fkOperadoraEmpresa;
	}
	public Double getValorTransacao() {
		return valorTransacao;
	}
	public void setValorTransacao(Double valorTransacao) {
		this.valorTransacao = valorTransacao;
	}
	public Double getValorLiquido() {
		return valorLiquido;
	}
	public void setValorLiquido(Double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}
	public Double getTaxa() {
		return taxa;
	}
	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	public Double getValorDescontoBoleto() {
		return valorDescontoBoleto;
	}
	public void setValorDescontoBoleto(Double valorDescontoBoleto) {
		this.valorDescontoBoleto = valorDescontoBoleto;
	}
	public String getDataHoraPedido() {
		return dataHoraPedido;
	}
	public void setDataHoraPedido(String dataHoraPedido) {
		this.dataHoraPedido = dataHoraPedido;
	}
	public String getDataHoraRetornoAutorizacao() {
		return dataHoraRetornoAutorizacao;
	}
	public void setDataHoraRetornoAutorizacao(String dataHoraRetornoAutorizacao) {
		this.dataHoraRetornoAutorizacao = dataHoraRetornoAutorizacao;
	}
	public String getDataHoraRetornoAutenticacao() {
		return dataHoraRetornoAutenticacao;
	}
	public void setDataHoraRetornoAutenticacao(String dataHoraRetornoAutenticacao) {
		this.dataHoraRetornoAutenticacao = dataHoraRetornoAutenticacao;
	}
	public String getDataHoraRetornoCaptura() {
		return dataHoraRetornoCaptura;
	}
	public void setDataHoraRetornoCaptura(String dataHoraRetornoCaptura) {
		this.dataHoraRetornoCaptura = dataHoraRetornoCaptura;
	}
	public String getDataHoraRetornoCancelamento() {
		return dataHoraRetornoCancelamento;
	}
	public void setDataHoraRetornoCancelamento(String dataHoraRetornoCancelamento) {
		this.dataHoraRetornoCancelamento = dataHoraRetornoCancelamento;
	}
	public String getDataVencimentoBoleto() {
		return dataVencimentoBoleto;
	}
	public void setDataVencimentoBoleto(String dataVencimentoBoleto) {
		this.dataVencimentoBoleto = dataVencimentoBoleto;
	}
	public Integer getStatusGeral() {
		return statusGeral;
	}
	public void setStatusGeral(Integer statusGeral) {
		this.statusGeral = statusGeral;
	}
	public Integer getTipoInscricaoPagador() {
		return tipoInscricaoPagador;
	}
	public void setTipoInscricaoPagador(Integer tipoInscricaoPagador) {
		this.tipoInscricaoPagador = tipoInscricaoPagador;
	}
	public String getInscricaoPagador() {
		return inscricaoPagador;
	}
	public void setInscricaoPagador(String inscricaoPagador) {
		this.inscricaoPagador = inscricaoPagador;
	}
	public String getCepPagador() {
		return cepPagador;
	}
	public void setCepPagador(String cepPagador) {
		this.cepPagador = cepPagador;
	}
	public String getNomePagador() {
		return nomePagador;
	}
	public void setNomePagador(String nomePagador) {
		this.nomePagador = nomePagador;
	}
	public String getDataArquivoRemessa() {
		return dataArquivoRemessa;
	}
	public void setDataArquivoRemessa(String dataArquivoRemessa) {
		this.dataArquivoRemessa = dataArquivoRemessa;
	}
	public Long getSequencialRemessa() {
		return sequencialRemessa;
	}
	public void setSequencialRemessa(Long sequencialRemessa) {
		this.sequencialRemessa = sequencialRemessa;
	}
	public String getNomeArquivoRemessa() {
		return nomeArquivoRemessa;
	}
	public void setNomeArquivoRemessa(String nomeArquivoRemessa) {
		this.nomeArquivoRemessa = nomeArquivoRemessa;
	}
	public String getTipoCobrancaBancoBrasil() {
		return tipoCobrancaBancoBrasil;
	}
	public void setTipoCobrancaBancoBrasil(String tipoCobrancaBancoBrasil) {
		this.tipoCobrancaBancoBrasil = tipoCobrancaBancoBrasil;
	}
	public Integer getPrimeiraInstrucaoBradesco() {
		return primeiraInstrucaoBradesco;
	}
	public void setPrimeiraInstrucaoBradesco(Integer primeiraInstrucaoBradesco) {
		this.primeiraInstrucaoBradesco = primeiraInstrucaoBradesco;
	}
	public Integer getSegundaInstrucaoBradesco() {
		return segundaInstrucaoBradesco;
	}
	public void setSegundaInstrucaoBradesco(Integer segundaInstrucaoBradesco) {
		this.segundaInstrucaoBradesco = segundaInstrucaoBradesco;
	}
	public Integer getIdentificacaoOcorrenciaBradesco() {
		return identificacaoOcorrenciaBradesco;
	}
	public void setIdentificacaoOcorrenciaBradesco(Integer identificacaoOcorrenciaBradesco) {
		this.identificacaoOcorrenciaBradesco = identificacaoOcorrenciaBradesco;
	}
	
	
	
	public String getLogradouroPagador() {
		return logradouroPagador;
	}
	public void setLogradouroPagador(String logradouroPagador) {
		this.logradouroPagador = logradouroPagador;
	}
	public String getComplementoPagador() {
		return complementoPagador;
	}
	public void setComplementoPagador(String complementoPagador) {
		this.complementoPagador = complementoPagador;
	}
	public String getNumeroPagador() {
		return numeroPagador;
	}
	public void setNumeroPagador(String numeroPagador) {
		this.numeroPagador = numeroPagador;
	}
	public String getBairroPagador() {
		return bairroPagador;
	}
	public void setBairroPagador(String bairroPagador) {
		this.bairroPagador = bairroPagador;
	}
	public String getCidadePagador() {
		return cidadePagador;
	}
	public void setCidadePagador(String cidadePagador) {
		this.cidadePagador = cidadePagador;
	}
	public String getUfPagador() {
		return ufPagador;
	}
	public void setUfPagador(String ufPagador) {
		this.ufPagador = ufPagador;
	}
	public Long getNumParcelas() {
		return numParcelas;
	}
	public void setNumParcelas(Long numParcelas) {
		this.numParcelas = numParcelas;
	}
	public Double getValorParcela() {
		return valorParcela;
	}
	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	public Long getTipoCobranca() {
		return tipoCobranca;
	}
	public void setTipoCobranca(Long tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}
	public Long getFkPedidoPagamento() {
		return fkPedidoPagamento;
	}
	public void setFkPedidoPagamento(Long fkPedidoPagamento) {
		this.fkPedidoPagamento = fkPedidoPagamento;
	}
	@Override
	public String toString() {
		return "Transacao [codigoTransacao=" + codigoTransacao + ", fkFormaPgtoOperadoraEmpresa=" + fkFormaPgtoOperadoraEmpresa
				+ ", fkPedido=" + fkPedido + ", valorTransacao=" + valorTransacao + ", dataHoraPedido=" + dataHoraPedido
				+ ", dataVencimentoBoleto=" + dataVencimentoBoleto + ", tipoInscricaoPagador=" + tipoInscricaoPagador
				+ ", inscricaoPagador=" + inscricaoPagador + ", cepPagador=" + cepPagador + ", nomePagador="
				+ nomePagador + ", usr="
				+ usr + ", pwd="
				+ pwd + "]";
	}
    
    
}