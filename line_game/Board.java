public class Board{

    public int num_spaces;
    public Tile [] line_board;
    public int guess;
    // Default Constructor - 10 pieces
    public Board(){
        this.num_spaces = 10;
        this.line_board = new Tile [10]; // array of 10 uninitialized tiles

        int i = 0;
        while (i < 10){
            this.line_board[i] = new Tile(i); // array is Tiles with value 0,1,2,3,4,5,6,7,8,9
            i+=1;
        }
    }

    public void setCorrectGuess(int guess){
        this.guess = guess;
    }

    public int getCorrectGuess(){
        return this.guess;
    }

    public boolean getAlreadyGuessed(int i){
        return this.line_board[i].getGuessed();
    }

    public void setAlreadyGuessed(int i){
        this.line_board[i].setGuessed(true); 
    }
}
