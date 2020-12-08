package com.mycompany.projetodesignpatterns.proxy;

public class ProxyAudio implements AudioIF {
	private TipoRealAudio meuAudio;
	private String nomeArquivo;

	public ProxyAudio(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public void play() {
		if (meuAudio == null) {
			System.out.println("Instancia não existia... Criando instancia do tipo");
			// TODO VER OUTRA MANEIRA DE ESTUDAR O PADRÃO PROXY
		}
	}
}
