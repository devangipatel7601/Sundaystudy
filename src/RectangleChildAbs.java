public class RectangleChildAbs extends ShapeParentAbs{
    //normal method
    void draw(){
        System.out.println("Drawing Rectangle");
    }
    public static void main(String[] args){
        ShapeParentAbs shapeParentAbs = new RectangleChildAbs();
        shapeParentAbs.draw();
    }
}
