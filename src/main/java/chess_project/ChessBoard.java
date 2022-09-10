package chess_project;

public class ChessBoard {
    public static void main(String arg[]) {

        Pawn pawn = new Pawn();
        measure(pawn);
    }
    private static void measure(Pawn pawn) {
        System.out.println(pawn.getClass());
    }
}
