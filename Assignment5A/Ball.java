package Assignment5A;

public class Ball
{
    //Variables
    private int Y;
    private int X;
    private int velocityX;
    private int velocityY;

    private final int height = 10;
    private final int width = 10;


    //Constructor
    public Ball(int x, int y, int velocity_x, int velocity_y)
    {
        this.X=x;
        this.Y=y;
        this.velocityX = velocity_x;
        this.velocityY= velocity_y;
    }

    //Methods
    public void move()
    {
        X += velocityX;
        Y += velocityY;

        //Low boundary check
        if (X < 0) {
            velocityX = 0 - velocityX;
            X = X + (2 * velocityX);
        }
        if (Y < 0) {
            velocityY = 0 - velocityY;
            Y = Y + (2 * velocityY);
        }

        //High boundary check
        if (X > 9) {
            velocityX = 0 - velocityX;
            X = X + (2 * velocityX);
        }
        if (Y > 9) {
            velocityY = 0 - velocityY;
            Y = Y + (2 * velocityY);
        }
    }
    public void print()
    {
        System.out.println("X:" + X + " Y:" + Y);
    }

}
