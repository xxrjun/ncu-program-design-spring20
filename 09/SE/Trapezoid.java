public class Trapezoid extends Quadrilateral{

    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void setHeight(){
        
    }

    @Override
    public String getAllPoints(){
        return super.getAllPoints();
    }

    public String toString(){ 
        return "Coordinates of Trapezoid are:\n" + getAllPoints() + "\n\n";
    }
    
}
