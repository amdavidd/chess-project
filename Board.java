public class Board{
    private Piece[][] board = new Piece[8][8];

    public Board(){
        generateStartPosition();
    }

    public void generateStartPosition(){
        //black row of pieces
        board[0][0] = new Rook(false, a, 8);
        board[0][1] = new Knight(false, a, 8);
        board[0][2] = new Bishop(false, a, 8);
        board[0][3] = new Queen(false, a, 8);
        board[0][4] = new King(false, a, 8);
        board[0][5] = new Bishop(false, a, 3);
        board[0][6] = new Knight(false, a, 2);
        board[0][7] = new Rook(false, a, 1);


        board[1][0] = new Pawn(false);
        board[1][1] = new Pawn(false);
        board[1][2] = new Pawn(false);
        board[1][3] = new Pawn(false);
        board[1][4] = new Pawn(false);
        board[1][5] = new Pawn(false);
        board[1][6] = new Pawn(false);
        board[1][7] = new Pawn(false);

        for (int i = 2; i < 6; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = new Empty();
            }
        }

        board[6][0] = new Pawn(true);
        board[6][1] = new Pawn(true);
        board[6][2] = new Pawn(true);
        board[6][3] = new Pawn(true);
        board[6][4] = new Pawn(true);
        board[6][5] = new Pawn(true);
        board[6][6] = new Pawn(true);
        board[6][7] = new Pawn(true);

        board[7][0] = new Rook(true);
        board[7][1] = new Knight(true);
        board[7][2] = new Bishop(true);
        board[7][3] = new Queen(true);
        board[7][4] = new King(true);
        board[7][5] = new Bishop(true);
        board[7][6] = new Knight(true);
        board[7][7] = new Rook(true);

    }

    public boolean makeMove(Piece piece, int locationX, int locationY){
        return false;
    }
}
