package demo.pattern.factory.simple;

import demo.pattern.factory.entity.DellMouse;
import demo.pattern.factory.entity.HpMouse;
import demo.pattern.factory.entity.LevenoMouse;
import demo.pattern.factory.entity.Mouse;

public class MouseFactory {

    public static Mouse createMouse(int type) {
        switch (type) {
            case 1:
                return new DellMouse();
            case 2:
                return new HpMouse();
            case 3:
                return new LevenoMouse();
            default:
                return new DellMouse();
        }
    }

    public static void main(String[] args) {
        Mouse mouse = createMouse(4);
        mouse.sayHi();
    }

}
