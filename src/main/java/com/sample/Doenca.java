package com.sample;

public class Doenca {

	private int encaminhamento = 0;
	private int has = 0;
	private int dm = 0;

	public int getDm() {
		return dm;
	}

	public void setDm(int dm) {
		this.dm = dm;
	}

	public int getHas() {
		return has;
	}

	public void setHas(int has) {
		this.has = has;
	}

	public int getEncaminhamento() {
		return encaminhamento;
	}

	public void setEncaminhamento(int encaminhamento) {
		this.encaminhamento = encaminhamento;
	}

	public Doenca(int encaminhamento, int  has, int dm) {
		super();
		this.encaminhamento = encaminhamento;
		this.has = has;
		this.dm = dm;
	}
	
	

}
