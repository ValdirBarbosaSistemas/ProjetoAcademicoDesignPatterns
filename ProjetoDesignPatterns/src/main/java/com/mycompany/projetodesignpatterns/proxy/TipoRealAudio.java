package com.mycompany.projetodesignpatterns.proxy;

public class TipoRealAudio implements AudioIF {
	private String nomeArquivo;

	public TipoRealAudio(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
		carregandoArquivo(nomeArquivo);
	}

	@Override
	public void play() {
		System.out.println("Tocando o arquivo de nome" + nomeArquivo);
	}

	public void carregandoArquivo(String carregandoArquivo) {
		System.out.println("Carregando o arquivo " + nomeArquivo + " do disco.");
	}
	
	// TODO VER OUTRA MANEIRA DE ESTUDAR O PADRÃO PROXY
}
