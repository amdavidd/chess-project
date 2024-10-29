public class Piece {
    private String pieceName;
    private int pieceId;
    private int points;
    private boolean isWhite;

    public Piece(String pieceName, boolean isWhite){
        this.pieceName = pieceName;
        this.isWhite = isWhite;
        assignPieceIdAndPoints(pieceName);
    }

    public void assignPieceIdAndPoints(String pieceName){
        switch(pieceName){
            case "King" -> {
                setPieceId(0);
                setPoints(1000);
            }
            case "Queen" -> {
                setPieceId(1);
                setPoints(9);
            }
            case "Rook" -> {
                setPieceId(2);
                setPoints(5);
            }
            case "Bishop" -> {
                setPieceId(3);
                setPoints(3);
            }
            case "Knight" -> {
                setPieceId(4);
                setPoints(3);
            }
            case "Pawn" -> {
                setPieceId(5);
                setPoints(1);
            }
        }
    }

    public void setPieceId(int pieceId){
        this.pieceId = pieceId;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public void setPieceName(String pieceName){
        this.pieceName = pieceName;
        assignPieceIdAndPoints(pieceName);
    }

    public int getPieceId(){
        return this.pieceId;
    }

    public int getPoints(){
        return this.points;
    }

    public String getPieceName(){
        return this.pieceName;
    }
}