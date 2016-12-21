package com.iboltpag.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="model")
public class Empresa {
    @XmlElement
    private Long codigoEmpresa;
    @XmlElement
    private String cnpj;
    @XmlElement
    private String email;
    @XmlElement
    private String login;
    @XmlElement
    private String senha;
    @XmlElement
    private String hostBanco;
    @XmlElement
    private String nomeBanco;
    @XmlElement
    private String userBanco;
    @XmlElement
    private String senhaBanco;
    @XmlElement
    private Long tipoInscricao;
	public Long getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(Long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getHostBanco() {
		return hostBanco;
	}
	public void setHostBanco(String hostBanco) {
		this.hostBanco = hostBanco;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getUserBanco() {
		return userBanco;
	}
	public void setUserBanco(String userBanco) {
		this.userBanco = userBanco;
	}
	public String getSenhaBanco() {
		return senhaBanco;
	}
	public void setSenhaBanco(String senhaBanco) {
		this.senhaBanco = senhaBanco;
	}
	public Long getTipoInscricao() {
		return tipoInscricao;
	}
	public void setTipoInscricao(Long tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}
    
    
}