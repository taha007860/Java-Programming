public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    public Rectangle(int x,int y,int width, int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public void setX(int x){
        this.x= x;
    }
    public void setY(int y){
        this.y=y;
    }
    public String toString(){
        return "Rectangle[x="+x+",y="+y+",width="+width+",height="+height+"]";

    }
    public Rectangle union(Rectangle rect) {
        int newX = Math.min(this.getX(), rect.getX());
        int newY = Math.min(this.getY(), rect.getY());
        int newWidth = Math.max(rect.getX() + rect.getWidth() - newX,
                this.getX() + this.getWidth() - newX);
        int newHeight = Math.max(rect.getY() + rect.getHeight() - newY,
                this.getY() + this.getHeight() - newY);
        return new Rectangle(newX, newY, newWidth, newHeight);
    }
    public Rectangle intersection(Rectangle rect) {
        if(     this.getX() + this.getWidth() < rect.getX() ||
                rect.getX() + rect.getWidth() < this.getX() ||
                this.getY() + this.getHeight() < rect.getY() ||
                rect.getY() + rect.getHeight() < this.getY())
            return null;

        int startX = Math.max(this.getX(), rect.getX());
        int endX = Math.min(this.getX() + this.getWidth(),
                rect.getX() + rect.getWidth());
        int startY = Math.max(this.getY(), rect.getY());
        int endY = Math.min(this.getY() + this.getHeight(),
                rect.getY() + rect.getHeight());

        return new Rectangle(startX, startY, endX - startX, endY - startY);
    }
}

