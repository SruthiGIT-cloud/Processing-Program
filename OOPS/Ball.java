public class Ball {
    public int width;
    public int height;
    public int diameter;
    public int speed;
    public Ball(int speed,int width, int height, int diameter) {
        this.speed=speed;
        this.width=width;
        this.height=height;
        this.diameter=diameter;
    }

    public int getHeight(int height)
    {
        return height/5;
    }
}
