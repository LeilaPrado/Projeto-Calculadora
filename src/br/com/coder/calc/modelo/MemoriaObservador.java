package br.com.coder.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
	
	//publico por padrao
	void valorAlterado(String novoValor);
}
