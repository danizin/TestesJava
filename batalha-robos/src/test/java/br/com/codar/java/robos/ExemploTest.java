package br.com.codar.java.robos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import br.com.codar.robos.modelo.Batalha;
import br.com.codar.robos.modelo.Habilidade;
import br.com.codar.robos.modelo.Robo;
import br.com.codar.robos.notificador.NotificadorVencedor;

public class ExemploTest {

	@Test
	public void testaPoderDosRobos() {
		// parte 1: cenário
		NotificadorVencedor notificador = new NotificadorVencedor();
		Robo roboUm = new Robo(70, 40, Habilidade.LANCA_CHAMAS);
		Robo roboDois = new Robo(30, 70, Habilidade.ESCUDO_ENERGIA);

		// parte2: ação
		Batalha batalha = new Batalha(notificador);
		batalha.adicionarParticipantes(roboUm, roboDois);
		batalha.realizar();

		// parte 3: validação
		int roboMaisForte = 125;
		int roboMaisFraco = 110;
		
		assertEquals(roboMaisForte, roboUm.getPoder());
		assertEquals(roboMaisFraco,roboDois.getPoder());
		
	}
	
	@Test
	public void testaRoboVencedor() {
		// parte 1: cenário
		NotificadorVencedor notificador = new NotificadorVencedor();
		Robo roboUm = new Robo(70, 40, Habilidade.LANCA_CHAMAS);
		Robo roboDois = new Robo(30, 70, Habilidade.ESCUDO_ENERGIA);

		// parte2: ação
		Batalha batalha = new Batalha(notificador);
		batalha.adicionarParticipantes(roboUm, roboDois);
		Robo vencedor = batalha.realizar();

		// parte 3: validação
		int roboMaisForte = 125;
	
		
		assertEquals(roboMaisForte, vencedor.getPoder());
	
	}
}
