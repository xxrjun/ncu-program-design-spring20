//rjun

public class Quadrilateral{
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        setPoint(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void setPoint(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);
        point4 = new Point(x4, y4);
    }

    public void setHeight(){

    }

    public Point getPoint1(){
        return point1;
    }
    public Point getPoint2(){
        return point2;
    }
    public Point getPoint3(){
        return point3;
    }
    public Point getPoint4(){
        return point4;
    }

    public String getAllPoints(){ 
        return String.format("%s %s %s %s",point1,point2,point3,point4);
    }

    public String toString(){ 
        return "Coordinates of Quadrilateral are:\n" + getAllPoints() + "\n\n";
    }
   
}