package com.insightfullogic.java8.jxf;

public class MessageImpl implements Message{
    @Override
    public void print() {
        System.out.println("正常写法");
    }

    public static void main(String[] args) {
        MessageImpl td = new MessageImpl();

        Message message1 = new Message() {
            @Override
            public void print() {
                System.out.println("接口正常写法");
            }
        };

        Message message2 = () -> System.out.println("lambda写法");

        td.print();
        message1.print();
        message2.print();
    }
}
