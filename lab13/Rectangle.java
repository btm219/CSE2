public class Rectangle{
    
    double width = 0;
    double height = 0;
    
    public static void main(String [] args){
       Rectangle r1 = new Rectangle();
       r1.setHeight(5.3);
       r1.setWidth(7.3);
       System.out.println(r1.getArea());
    }
    
    public void setWidth(double x){
        width = x;
    }
    public void setHeight(double y){
        height = y;
    }
    public double getArea(){
        return height * width;
    }
}