package Quest�o_01;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DataTest {
	Data data = new Data(2018, 8, 29);

	@Before
	public void setup() throws Exception {
	}

	@Test
	void testAdicionaDias() {
		data.adicionaDias(3);
		String novaData = data.getData().toString();
		assertEquals("2018-09-01", novaData);
	}

	@Test
	void testDiasNoMes() {
		int mesAtual = data.diasNoMes();
		assertEquals(31, mesAtual);
	}

	@Test
	void testDiaDaSemana() {
		String diaDaSemana = data.diaDaSemana();
		assertEquals("WEDNESDAY", diaDaSemana);
	}

	@Test
	void testEAnoBissexto() {
		boolean eAnoBissexto = data.eAnoBissexto();
		assertEquals(false, eAnoBissexto);
	}

	@Test
	void testProximoDia() {
		data.proximoDia();
		int proximoDia = data.getDia();
		assertEquals(30, proximoDia);
	}
}
