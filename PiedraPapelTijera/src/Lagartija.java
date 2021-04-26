import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lagartija {

	@Test
	public void Lagartija(){
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("LAGARTIJA", "SPOCK"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("LAGARTIJA", "PAPEL"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("LAGARTIJA", "TIJERAS"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("LAGARTIJA", "PIEDRA"));
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner("LAGARTIJA", "LAGARTIJA"));
	}
}