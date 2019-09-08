package io.javabrains;

public class RunnableExample {

    public static void main( String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("from anonymous inner class");
            }
        });
        myThread.run();

        Thread myLambdaThread = new Thread(()->System.out.println("from Lambda expression"));
        myLambdaThread.run();
    }
}
