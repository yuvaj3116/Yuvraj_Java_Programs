package com.yuvraj;

class Dad {
    public void bike() {
        System.out.println("Ninja Z-X10R");
    }

    public void car() {
        System.out.println("Defender");
    }
}

class Son1 extends Dad {
    public void cycle() {
        System.out.println("Hero");
    }
}

class Son2 extends Dad {
    public void skateboard() {
        System.out.println("Yonex");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Son1 obj = new Son1();
        obj.bike();
        obj.car();
        obj.cycle();
    }
}
