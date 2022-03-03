import javax.swing.JPanel;

public class GameBoard extends JPanel{

	Player player;
	Castle castle;
	Meeple meeple;
	Tile tile;
	Domino domino;
	
	public GameBoard(Player player, Castle castle, Meeple meeple, Tile tile, Domino domino)
	{
		this.player = player;
		this.castle = castle;
		this.meeple = meeple;
		this.tile = tile;
		this.domino = domino;
	}
}
