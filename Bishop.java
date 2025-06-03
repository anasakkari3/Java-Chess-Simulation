public class Bishop extends ChessPiece{
    public Bishop(Position p) {
        if(p.getCol()>8||p.getCol()<1||p.getRow()>8||p.getRow()<1){
            p16=new Position(1,1);
        }
        p16=new Position(p.getRow(),p.getCol());
    }

    public static int posOptions(Position p){
        int x= p.getRow();
        int y =p.getCol();
        int count=0;
        while (x<8&&y<8){
            count++;
            x++;
            y++;
        }
         x= p.getRow();
         y =p.getCol();
        while (x>1&&y>1){
            x--;
            y--;
            count++;
        }
        x= p.getRow();
        y =p.getCol();
        while (x<8&&y>1){
            count++;
            x++;
            y--;
        }
        x= p.getRow();
        y =p.getCol();
        while (x>1&&y<8){
            count++;
            x--;
            y++;
        }
        return count;
    }
    @Override
    public Position[] moves(Position p) {
        int x= p.getRow();
        int y =p.getCol();
        int i =0;

        Position [] newp =new Position[posOptions(p)];
        while (x<8&&y<8){

            x++;
            y++;
            newp[i]=new Position(x,y);
            i++;
        }
        x= p.getRow();
        y =p.getCol();
        while (x>1&&y>1){
            x--;
            y--;
            newp[i]=new Position(x,y);
            i++;
        }
        x= p.getRow();
        y =p.getCol();
        while (x<8&&y>1){

            x++;
            y--;
            newp[i]=new Position(x,y);
            i++;
        }
        x= p.getRow();
        y =p.getCol();
        while (x>1&&y<8){
            x--;
            y++;
            newp[i]=new Position(x,y);
            i++;
        }
        return newp;
    }

    @Override
    public Position getPosition() {
        return new Position(p16.getRow(), p16.getCol());
    }

    @Override
    public String toString() {
        return "Bishop at " +'('+p16.getRow()+", "+p16.getCol()+')';

    }
}
