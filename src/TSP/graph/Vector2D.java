package TSP.graph;

public class Vector2D {
    private double x;
    private double y;
    public Vector2D(double x , double y){
        this.x = x;
        this.y = y;
    }

    public void set(double x , double y)
    {
        this.x = x;
        this.y = y;
    }
    public void set(Vector2D vector2D)
    {
        this.x = vector2D.getX();
        this.y = vector2D.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Vector2D destination)
    {
        return Math.sqrt(Math.pow(destination.getX()-this.getX() , 2) +
                Math.pow(destination.getY()-this.getY() , 2)
        );
    }

    @Override
    public String toString() {
        return "("+x+ " , "+y+")";
    }

    @Override
    public Vector2D clone()  {
        return new Vector2D(this.x , this.y);
    }
}
