public class Glass {

    private int[] colors = new int[]{0,0,0,0};

    public Glass(){
        // Do nothing (Empty glass)
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
        if (colors[0] != 0) return colors[0];
        else if (colors[1] != 0) return colors[1];
        else if (colors[2] != 0) return colors[2];
        else if (colors[3] != 0) return colors[3];
        else return 0;
    }

    public int setColor(){
        return 1;
    }

    public boolean isSolved(){
        return colors[0]==colors[1]&&
                colors[1]==colors[2] &&
                colors[2] == colors[3];
    }

    public boolean hasOpenSlot(){
        return colors[0] == 0;
    }
}
