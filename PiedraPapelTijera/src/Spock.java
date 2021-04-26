import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Spock {

	@Test
	public void Spock(){
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("SPOCK", "TIJERAS"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("SPOCK", "PIEDRA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("SPOCK", "PAPEL"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("SPOCK", "LAGARTIJA"));
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner("SPOCK", "SPOCK"));
	}
}