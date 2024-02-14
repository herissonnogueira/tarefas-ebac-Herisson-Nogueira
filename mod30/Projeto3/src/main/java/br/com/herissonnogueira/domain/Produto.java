package br.com.herissonnogueira.domain;

import java.math.BigDecimal;

import anotacao.ColunaTabela;
import anotacao.Tabela;
import anotacao.TipoChave;
import br.com.herissonnogueira.dao.Persistente;

/**
 * @author herisson.nogueira
 *
 */

@Tabela("TB_PRODUTO")
public class Produto implements Persistente {

	@ColunaTabela(dbName = "id", setJavaName = "setId")
	private Long id;

	@TipoChave("getCodigo")
	@ColunaTabela(dbName = "codigo", setJavaName = "setCodigo")
	private String codigo;

	@ColunaTabela(dbName = "nome", setJavaName = "setNome")
	private String nome;

	@ColunaTabela(dbName = "descricao", setJavaName = "setDescricao")
	private String descricao;

	@ColunaTabela(dbName = "valor", setJavaName = "setValor")
	private BigDecimal valor;

	@ColunaTabela(dbName = "outro_campo", setJavaName = "setCampo")
	private BigDecimal campo;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getCampo() {
		return campo;
	}

	public void setCampo(BigDecimal campo) {
		this.campo = campo;
	}

}
