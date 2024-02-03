public class Point {
    private int x;
    private int y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public double distance(Point p)
    {
        double dx = p.x - x;
        double dy = p.y - y;
        return Math.sqrt(dx * dx + dy * dy);
} public String toString()
    {
        return "(" + x + "," + y + ")";
    } public int[] getXY(){
    int[] a=new int[2];
    a[0]=x;
    a[1]=y;
    return a;
    } public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }
}
