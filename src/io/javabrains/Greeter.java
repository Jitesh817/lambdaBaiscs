package io.javabrains;

public class Greeter {

    private void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main (String[] args){

        Greeter greeter = new Greeter();

        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello World");

        greeter.greet(helloWorldGreeting);
        helloWorldGreeting.perform();
        lambdaGreeting.perform();
    }
}

