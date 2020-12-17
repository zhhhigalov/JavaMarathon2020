package day17;

import static day17.ChessPiece.*;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece[][] array = new ChessPiece[][]{{ROOK_BLACK, EMPTY, EMPTY, EMPTY, EMPTY, ROOK_BLACK, KING_BLACK, EMPTY},
                {EMPTY, ROOK_WHITE, EMPTY, EMPTY, PAWN_BLACK, PAWN_BLACK, EMPTY, PAWN_BLACK},
                {PAWN_BLACK, EMPTY, KNIGHT_BLACK, EMPTY, EMPTY, EMPTY, PAWN_BLACK, EMPTY},
                {QUEEN_BLACK, EMPTY, EMPTY, BISHOP_WHITE, EMPTY, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, BISHOP_BLACK, PAWN_WHITE, EMPTY, EMPTY, EMPTY},
                {EMPTY, EMPTY, EMPTY, EMPTY, BISHOP_WHITE, PAWN_WHITE, EMPTY, EMPTY},
                {PAWN_WHITE, EMPTY, EMPTY, QUEEN_WHITE, EMPTY, PAWN_WHITE, EMPTY, PAWN_WHITE},
                {EMPTY, EMPTY, EMPTY, EMPTY, EMPTY, ROOK_WHITE, KING_WHITE, EMPTY}};

        ChessBoard board = new ChessBoard(array);
        board.print();
    }
}
