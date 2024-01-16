public class Triangle extends Shape {

    private float base;
    private float height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    
    @Override
    float getArea() {
        return 0.5f * base * height;
    }
    
}
