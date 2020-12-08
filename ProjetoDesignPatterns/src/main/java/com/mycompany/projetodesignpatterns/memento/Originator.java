package com.mycompany.projetodesignpatterns.memento;

public class Originator {
	private String estado;

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estadoASalvar) {
		this.estado = estadoASalvar;
	}

	public Memento salvarEstadoMemento() {
		return new Memento(estado);
	}

	public void getEstadoSalvoMemento(Memento ultimoEstado) {
		estado = ultimoEstado.getEstado();
	}
}
