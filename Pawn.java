public class Pawn extends Piece {

    public boolean canMoveTwoSquares;
    public boolean canEnPassant;
    
    public Pawn(boolean isWhite, int pieceRank, int pieceFile){
        super("pawn", isWhite, pieceRank, pieceFile);
    }

    public boolean canPromotePawn(){
        return true;
    }
}