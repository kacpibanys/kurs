package com.example.task_07_enum;

public class Task16 {
    public enum Logger{
        INSTANCE;

        void log(String msg){
            System.out.println(msg);
        }
    }

    static void main(String[] args) {
        Logger logger = Logger.INSTANCE;
        logger.log("test");
        Logger.INSTANCE.log("hello");
    }
}
