package Triangle;

import java.util.Scanner;

public class triangle {
    private float side_1;
    private float side_2;
    private float side_3;
    private float base;
    private float height;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getSide_1() {
        return side_1;
    }

    public void setSide_1(float side_1) {
        this.side_1 = side_1;
    }

    public float getSide_2() {
        return side_2;
    }

    public void setSide_2(float side_2) {
        this.side_2 = side_2;
    }

    public float getSide_3() {
        return side_3;
    }

    public void setSide_3(float side_3) {
        this.side_3 = side_3;
    }
    public void trianglePerimeter(){
        float resultPerimeter = side_1+side_2+side_3;
        System.out.println("The perimeter of the triangle is : "+resultPerimeter);
    }
    public void triangleArea(){
        float resultArea = (height*base)/2;
        System.out.println(resultArea);
    }
    public void modifySizeTriangle(){
        Scanner enter = new Scanner(System.in);

        System.out.println("enter new values for the base");
         float enterUserBase = enter.nextFloat();

    }
}
