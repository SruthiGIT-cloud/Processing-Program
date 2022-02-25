import processing.core.PApplet;

public class FourBallChallenge extends PApplet{
   static Ball[] fourball = new Ball[4]; //array named fourball declaration with size 4


    public static void main(String[] args) {
       PApplet.main("FourBallChallenge", args);
        // initialising array named fourball with the elements
        for(int balls=0;balls<4;balls++)
        {
            fourball[balls]=new Ball(0,700,420,20);
        }
    }

    @Override
    public void settings() {
        super.settings();
        size(width,height);
    }

    @Override
    public void setup() {
        paintWhite();
    }

    @Override
    public void draw() {

        for(int balls=0;balls<4;balls++) {
            ellipse(fourball[balls].speed+=balls+1, (balls + 1) * fourball[balls].getHeight(height), fourball[balls].diameter, fourball[balls].diameter);
        }
    }

    private void paintWhite() {
        background(255);
    }
}
