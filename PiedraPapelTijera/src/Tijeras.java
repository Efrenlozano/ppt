import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tijeras {

	@Test
	public void Tijeras(){
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("TIJERAS", "PAPEL"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("TIJERAS", "LAGARTIJA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("TIJERAS", "PIEDRA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("TIJERAS", "SPOCK"));
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner("TIJERAS", "TIJERAS"));
	}
}