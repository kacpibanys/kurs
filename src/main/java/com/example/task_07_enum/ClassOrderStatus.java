package com.example.task_07_enum;

public class ClassOrderStatus {
    public enum OrderStatus {
        NEW, PROCESSING, SHIPPED, DELIVERED, CANCELED;

        public boolean isActive(){
            return switch (this) {
                case CANCELED, DELIVERED -> true;
                default -> false;
            };
        }
    }

    static void main(String[] args) {
        OrderStatus orderStatus1 = OrderStatus.NEW;
        OrderStatus orderStatus2 = OrderStatus.PROCESSING;
        OrderStatus orderStatus3 = OrderStatus.DELIVERED;
        System.out.println(orderStatus1.isActive());
        System.out.println(orderStatus2.isActive());
        System.out.println(orderStatus3.isActive());

    }
}
