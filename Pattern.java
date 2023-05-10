package Quarto;

public class Pattern extends Board { //or piece

    //this could be a parent class to a different pattern, once the user sets the difficulty level


    
    // This first method is for identifying horizontal wins withing the 4x4 board.

    public boolean horizontalWin(PieceColor color, PieceHeight height, PieceFill fill, PieceShape shape) {
        TODO piece placed position;
        if (int i = 0; i < 16) {
            if (board[i].getColor() == board[i+1].getColor() &&
                board[i].getColor() == board[i+2].getColor() &&
                board[i].getColor() == board[i+3].getColor()) {
                return true;
            } else if 
                (board[i].getHeight() == board[i+1].getHeight() &&
                board[i].getHeight() == board[i+2].getHeight() &&
                board[i].getHeight() == board[i+3].getHeight()) {
                return true;
            } else if 
                (board[i].getFill() == board[i+1].getFill() &&
                board[i].getFill() == board[i+2].getFill() &&
                board[i].getFill() == board[i+3].getFill()) {
                return true;
            } else if 
                (board[i].getShape() == board[i+1].getShape() &&
                board[i].getShape() == board[i+2].getShape() &&
                board[i].getShape() == board[i+3].getShape()) {
                return true;
            } 
            i++;
        }
        return false;
    }


    // This method is for identifying vertical wins.

    public boolean verticalWin(PieceColor color, PieceHeight height, PieceFill fill, PieceShape shape) {
        TODO piece placed position;
        if (int i = 0; i < 16) { 
            if (board[i].getColor() == board[i+4].getColor() &&
                board[i].getColor() == board[i+8].getColor() &&
                board[i].getColor() == board[i+12].getColor()) {
                return true;
            } else if 
                (board[i].getHeight() == board[i+4].getHeight() &&
                board[i].getHeight() == board[i+8].getHeight() &&
                board[i].getHeight() == board[i+12].getHeight()) {
                return true;
            } else if 
                (board[i].getFill() == board[i+4].getFill() &&
                board[i].getFill() == board[i+8].getFill() &&
                board[i].getFill() == board[i+12].getFill()) {
                return true;
            } else if 
                (board[i].getShape() == board[i+4].getShape() &&
                board[i].getShape() == board[i+8].getShape() &&
                board[i].getShape() == board[i+12].getShape()) {
                return true;
            } 
            i++;
        }
        return false;
    }

    
    // This method is to identify the diagonal win on a 45 degree angle.

    public boolean diagonal_45_Win(PieceColor color, PieceHeight height, PieceFill fill, PieceShape shape) {
        if (int i = 3; i < 16) {
            if (board[i].getColor() == board[i*2].getColor() &&
                board[i].getColor() == board[i*3].getColor() &&
                board[i].getColor() == board[i*4].getColor()) {
                return true;
            } else if 
                (board[i].getHeight() == board[i*2].getHeight() &&
                board[i].getHeight() == board[i*3].getHeight() &&
                board[i].getHeight() == board[i*4].getHeight()) {
                return true;
            } else if 
                (board[i].getFill() == board[i*2].getFill() &&
                board[i].getFill() == board[i*3].getFill() &&
                board[i].getFill() == board[i*4].getFill()) {
                return true;
            } else if 
                (board[i].getShape() == board[i*2].getShape() &&
                board[i].getShape() == board[i*3].getShape() &&
                board[i].getShape() == board[i*4].getShape()) {
                return true;
            } 
        }
        return false;
    }

    
    // This method is to identify the diagonal win on a 135 degree angle.

    public boolean diagonal_135_Win(PieceColor color, PieceHeight height, PieceFill fill, PieceShape shape) {
        if (int i = 0; i < 16) {
            if (board[i].getColor() == board[i+5].getColor() &&
                board[i].getColor() == board[i+10].getColor() &&
                board[i].getColor() == board[i+15].getColor()) {
                return true;
            } else if 
                (board[i].getHeight() == board[i+5].getHeight() &&
                board[i].getHeight() == board[i+10].getHeight() &&
                board[i].getHeight() == board[i+15].getHeight()) {
                return true;
            } else if 
                (board[i].getFill() == board[i+5].getFill() &&
                board[i].getFill() == board[i+10].getFill() &&
                board[i].getFill() == board[i+15].getFill()) {
                return true;
            } else if 
                (board[i].getShape() == board[i+5].getShape() &&
                board[i].getShape() == board[i+10].getShape() &&
                board[i].getShape() == board[i+15].getShape()) {
                return true;
            } 
        }
        return false;
    }
}