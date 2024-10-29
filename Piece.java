public class Piece {
    private String pieceName;
    private int pieceId;
    private int points;
    private boolean isWhite;
    private int pieceRank;
    private int pieceFile;

    public Piece(String pieceName, boolean isWhite, int pieceRank, int pieceFile){
        this.pieceName = pieceName;
        this.isWhite = isWhite;
        this.pieceRank = pieceRank;
        this.pieceFile = pieceFile;
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

    public void setPieceRank(int pieceRank){
        this.pieceRank = pieceRank;
    }

    public void setPieceFile(int pieceFile){
        this.pieceFile = pieceFile;
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

    public int getPieceRank(){
        return this.pieceRank;
    }

    public int getPieceFile(){
        return this.pieceFile;
    }
}