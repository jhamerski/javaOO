package br.com.classesauxiliares;

import br.com.interfaces.PermitirAcesso;

/*Somente receber quem tem o contrato da interface de permitir acesso e chamar o autenticar()*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;

	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}

	public FuncaoAutenticacao(PermitirAcesso acesso) {
		this.permitirAcesso = acesso;
	}
}
