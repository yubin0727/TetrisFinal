import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import tetris.GameArea;
import tetris.NextBlockArea;
import tetris.TetrisBlock;

class NextBlockAreaTest {

	final GameArea ga = new GameArea(600, 450, 10);
	private NextBlockArea nba = new NextBlockArea(600, 450);
	private TetrisBlock nextBlock = ga.getBlock();


	@Test
	void testInitNextBlockArea() {
		nba.initNextBlockArea();
		assertFalse(nba.getIsItem());
	}

	@Test
	void testUpdateNBA() {
		nba.updateNextBlock();
		assertNotNull(nextBlock);
	}

	@Test
	void testSetIsItem() {
		nba.setIsItem(true);
		assertTrue(nba.getIsItem() == true );
	}

	@Test
	void testPaintComponentGraphics() {
		assertNotNull(nba.getIsItem());
	}
	
	@Test
	void testUpdateNextItem() {
		nba.updateNextBlock();
		assertNotNull(nba.getRandIndex());
		assertNotNull(nba.getBlockIndex());
	}

}