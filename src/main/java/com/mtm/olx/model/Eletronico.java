package com.mtm.olx.model;

import java.util.List;

public class Eletronico
{

	
	private String nome;
	private String descricao;
	private double valor;
	private List<Tipo> tipo;
	
	
	
	public Eletronico(String nome, String descricao, double valor,List<Tipo> tipo)
	{
		this.nome=nome;
		this.descricao=descricao;
		this.valor=valor;
		this.tipo=tipo;
	}
	
	
	public String getNome()
	{
		return nome;
	}

	public List<Tipo> getTipo()
	{
		return tipo;
	}
	
	public void setTipo(List<Tipo> tipo)
	{
		this.tipo = tipo;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}



	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}


	public double getValor()
	{
		return valor;
	}


	public void setValor(double valor)
	{
		this.valor = valor;
	}	

}