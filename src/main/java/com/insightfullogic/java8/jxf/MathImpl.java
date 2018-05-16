package com.insightfullogic.java8.jxf;

public class MathImpl implements Math {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        MathImpl mathImpl = new MathImpl();
        Math math1 = (x, y) -> {
            System.out.println("lambda多行表达式需要大括号");
            return x+y+1;
        };

        int i1 = mathImpl.add(1, 2);
        int i2 = math1.add(1, 2);

        System.out.println(i1);
        System.out.println(i2);

    }
}
