package day17;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] array = new ChessPiece[8];
        for (int i = 0; i < 4; i++) {
            array[i] = ChessPiece.PAWN_WHITE;
            array[i+4] = ChessPiece.ROOK_BLACK;
        }

        for (ChessPiece i : array) {
            System.out.print(i.toString() + " ");
        }
    }
}