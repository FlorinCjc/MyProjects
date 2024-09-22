package comGoogle.TrafficLight;
import static comGoogle.TrafficLight.TrafficSignal.*;

public class Main {
    public static void main(String[] args) {
        TrafficSignal red = RED;
        TrafficSignal green = GREEN;
        TrafficSignal yellow = YELLOW;
        Thread t1 = new Thread();
        for (int i = 0; i <= 30; i++) {
            if (i < red.getDuration()) {
                System.out.println(red.getMessage());
                System.out.println("(wait for 30 seconds)");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
            }

            for (int j = 0; j <= 5; j++) {
                if (j < yellow.getDuration()) {
                    System.out.println(yellow.getMessage());
                    System.out.println("(wait for 5 seconds)");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.getMessage();

                    }
                }
            }
            for (int k = 0; k <= 60; k++) {
                if (k < green.getDuration()) {
                    System.out.println(green.getMessage());
                    System.out.println("(wait for 60 seconds)");
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.getMessage();
                }

            }


        }


    }





