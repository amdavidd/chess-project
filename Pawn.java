public class Pawn extends Piece {

    public boolean canMoveTwoSquares;
    
    public Pawn(boolean isWhite){
        super("pawn", isWhite);
    }

    public boolean canPromotePawn(){
        return true;
    }
}