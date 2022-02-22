import processing.core.PApplet;

public class fourballschallenge extends PApplet{

    private int x1=0,x2=0,x3=0,x4=0;
    static fourballgetset obj;


    public static void main(String[] args) {
       PApplet.main("fourballschallenge", args);

       obj=new fourballgetset();
       obj.setWidth(680);
       obj.setHeight(480);
       obj.setDiameter(20);
       int a= obj.getDiameter();
       int b=obj.getHeight();
       int c= obj.getWidth();
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
        ellipse(x1++,height/5,obj.getDiameter(),obj.getDiameter());
        ellipse(x2+=2,height*2/5, obj.getDiameter(),obj.getDiameter());
        ellipse(x3+=3,height*3/5, obj.getDiameter(),obj.getDiameter());
        ellipse(x4+=4,height*4/5, obj.getDiameter(),obj.getDiameter());
    }

    private void paintWhite() {
        background(255);
    }
}
