public class Tile{

    public int value;
    public boolean guessed;

    public Tile(int v){

        this.value = v;
        this.guessed = false;
    }

    public void setValue(int v){
        this.value = v;
    }

    public int getValue(int v){
        return this.value;
    }

    public void setGuessed(boolean g){
        this.guessed = g;
    }

    public boolean getGuessed(){
        return guessed;
    }

}
