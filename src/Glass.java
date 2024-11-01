public class Glass {

    private int[] colors = {0,0,0,0};

    public Glass(){

    }

    public Glass(char a, char b, char c, char d){
        this.colors[0] = a;
        this.colors[1] = b;
        this.colors[2] = c;
        this.colors[3] = d;

    }

    public int[] getColors(){
        return colors;
    }

    public int getTopColor(){
        return colors[0];
    }

    public int setColor(){
        return 1;
    }
}
