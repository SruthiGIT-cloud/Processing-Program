import processing.core.PApplet;

public class fourballschallenge extends PApplet{

    private int WIDTH;
    private int HEIGHT;
    private int DIAMETER;
    private int x1=0,x2=0,x3=0,x4=0;

    public int getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(int WIDTH) {
        this.WIDTH = WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(int HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public int getDIAMETER() {
        return DIAMETER;
    }

    public void setDIAMETER(int DIAMETER) {
        this.DIAMETER = DIAMETER;
    }

    public static void main(String[] args) {
       PApplet.main("fourballschallenge", args);
       fourballschallenge object1=new fourballschallenge();
       object1.setWIDTH(680);
        object1.setHEIGHT(480);
       object1.setDIAMETER(20);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        paintWhite();
    }

    @Override
    public void draw() {
        ellipse(x1++,HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(x2+=2,HEIGHT*2/5, DIAMETER, DIAMETER);
        ellipse(x3+=3,HEIGHT*3/5, DIAMETER, DIAMETER);
        ellipse(x4+=4,HEIGHT*4/5, DIAMETER, DIAMETER);
    }

    private void paintWhite() {
        background(255);
    }
}
