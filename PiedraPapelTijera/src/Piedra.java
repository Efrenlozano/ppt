import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Piedra {

	@Test
	public void Piedra(){
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("PIEDRA", "TIJERAS"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("PIEDRA", "LAGARTIJA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("PIEDRA", "PAPEL"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("PIEDRA", "SPOCK"));
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner("PIEDRA", "PIEDRA"));
	}
}
