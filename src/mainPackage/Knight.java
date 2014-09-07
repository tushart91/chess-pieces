package mainPackage;

public class Knight extends ChessPiece {

	public Knight(Integer x, Integer y) {
		super(x, y);
	}
	
	public Boolean isLegalMove(Integer newX, Integer newY) {
		
		if (x < 2)
			return false;

		if (y < 1)
			return false;
		
		return false;

	}
	
	public Boolean move(Integer newX, Integer newY) {
		
	}
}
