package ss5_access_modifier_static_method_static_property.bai_tap.access_modifier;

import ss5_access_modifier_static_method_static_property.bai_tap.access_modifier.Circle;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println( circle.getRadius());
        System.out.println( circle.getArea());
    }

}
