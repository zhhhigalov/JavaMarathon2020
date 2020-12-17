package day17;

public class ChessBoard {

    private ChessPiece[][] array;

    public ChessBoard(ChessPiece[][] array) {
        this.array = array;
    }

    public void print(){
        for (ChessPiece[] i : array) {
            for (ChessPiece j : i)
                System.out.print(j);
            System.out.println();
        }
    }

}
