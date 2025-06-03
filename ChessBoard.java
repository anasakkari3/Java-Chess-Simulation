import java.util.Arrays;

public class ChessBoard {
    ChessPiece[] pieces;

    public ChessBoard() {
        this.pieces =new ChessPiece[10];
    }
    public void addPiece(ChessPiece p){
        for (int i = 0; i < pieces.length-1; i++) {
            if(pieces[i]==null){
                pieces[i]=p;
                break;
            }
        }
    }

    @Override
    public String toString() {
        String s="";
        for (int i = 0; i < pieces.length; i++) {
            if(pieces[i]!=null&&pieces[i+1]!=null) {
                s += pieces[i].toString()+"\n";
            }
              else  if (pieces[i]!=null&&pieces[i+1]==null) {
                    s += pieces[i].toString();
                }
            
        }
        return s;
    }

    public boolean threats(int p1, int p2){
        if(p1<pieces.length-1&&p1>=0&&p2>=0&&p2<pieces.length-1){
            Position[] test=  pieces[p1].moves(pieces[p1].p16);
            ChessPiece x=pieces[p2];
            for (int i = 0; i < test.length; i++) {
                if (test[i].getRow()==x.getPosition().getRow()&&test[i].getCol()==x.getPosition().getCol()){
                    return true;
                }
            }
        }
        return false;
    }
    public String whoThreatsWho(){
        String s="";
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces.length; j++) {
                if (pieces[i]!=null&&pieces[j]!=null&&pieces[i+1]!=null&&pieces[j+1]!=null){
                    if (threats(i,j)){
                        s+=pieces[i].toString()+" threats "+pieces[j].toString();
                        if (i < pieces.length - 1) {
                            s += "\n";
                        }
                    }

                }
                else  if (pieces[i]!=null&&pieces[j]!=null&&pieces[i]!=null&&pieces[i+1]==null) {
                    s += pieces[i].toString();
                }
            }
        }
        return s;
    }
}
