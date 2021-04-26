import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Papel {

	@Test
	public void Papel(){
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("PAPEL", "PIEDRA"));
		assertEquals(MoveWords.GANA, MoveWords.checkWinner("PAPEL", "SPOCK"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("PAPEL", "LAGARTIJA"));
		assertEquals(MoveWords.PIERDE, MoveWords.checkWinner("PAPEL", "TIJERAS"));
		assertEquals(MoveWords.EMPATE, MoveWords.checkWinner("PAPEL", "PAPEL"));
	}
}