//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {

        Position p1 = new Position(6, 6);
        Position p2 = new Position(3, 3);
//        Knight k1=new Knight(p1);
//        Position[]s= k1.moves(p1);
//        Bishop b1=new Bishop(p1);
//        Position[]s2= b1.moves(p1);
//        System.out.println(k1);
//        System.out.println(k1.toString().equals("Knight at (5, 2)"));
//        System.out.println(s2.length);
//        for (int i = 0; i < s2.length; i++) {
//            System.out.println(s2[i]);
//        }
//        ChessBoard s=new ChessBoard();
        ChessBoard board = new ChessBoard();
        board.addPiece(new Knight(new Position(5, 2)));
        board.addPiece(new Bishop(new Position(3, 3)));
        board.addPiece(new Knight(new Position(6, 6)));
        System.out.println(board);
        System.out.println(board.threats(0, 1));
        System.out.println(board.whoThreatsWho());
        System.out.println(board.whoThreatsWho().equals("Knight at (5, 2) threats Bishop at (3, 3)\n" +
                "Bishop at (3, 3) threats Knight at (6, 6)\n"));



    }
}