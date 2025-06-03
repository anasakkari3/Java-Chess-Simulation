public class Knight extends ChessPiece {

    public Knight(Position p) {
        p16=p;
    }

    @Override
    public Position[] moves(Position p) {

        Position [] newP = new Position[8];
        int x =p.getRow();
        int y= p.getCol();
        int count=0;
        int i=0;
        if (x<7&&y<8){
            newP[i]=new Position(x+2,y+1);
            count++;
            i++;
        }
        if (x<8&&y<7){
            newP[i]=new Position(x+1,y+2);
            count++;
            i++;
        }
        if (x>2&&y<8){
            newP[i]=new Position(x-2,y+1);
            count++;
            i++;
        }
        if (x>1&&y<7){
            newP[i]=new Position(x-1,y+2);
            count++;
            i++;
        }
        if (x>2&&y>1){
            newP[i]=new Position(x-2,y-1);
            count++;
            i++;
        }
        if (x>1&&y>2){
            newP[i]=new Position(x-1,y-2);
            count++;
            i++;
        }
        if (x<8&&y>2){
            newP[i]=new Position(x+1,y-2);
            count++;
            i++;
        }
        if (x<7&&y>1){
            newP[i]=new Position(x+2,y-1);
            count++;
            i++;
        }
        Position []finalb=new Position[count];
        for (int j = 0; j < count; j++) {
            finalb[j]=newP[j];

        }



        return finalb;
    }

    @Override
    public Position getPosition() {
        return new Position(p16.getRow(), p16.getCol());
    }
    @Override
    public String toString() {
        return "Knight at " +'('+p16.getRow()+", "+p16.getCol()+')';

    }
}
