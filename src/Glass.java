public class Glass {

    private int[] colors = {0,0,0,0};

    public Glass(){

    }

    public Glass(int[] colors){
        this.colors = colors;
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
