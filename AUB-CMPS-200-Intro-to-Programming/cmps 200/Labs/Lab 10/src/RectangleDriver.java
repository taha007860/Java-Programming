public class RectangleDriver {
        public static void main(String [] args){
            Rectangle rec = new Rectangle(0,0,3,3);
            System.out.println(rec.getX());
            System.out.println(rec.getY());
            System.out.println(rec.getWidth());
            System.out.println(rec.getHeight());
            System.out.println(rec.toString());
            rec.setHeight(5);
            rec.setWidth(5);
            rec.setX(4);
            rec.setY(4);
            System.out.println(rec.toString());
            System.out.println(rec.union(new Rectangle(0,0,3,3)).toString());
            System.out.println(rec.intersection(new Rectangle(0,0,50,50)).toString());

        }
    }
