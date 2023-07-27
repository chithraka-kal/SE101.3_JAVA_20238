public class Main {
    public static void main(String[] args) {
        RedLightThread red = new RedLightThread();
        GreenLightThread green = new GreenLightThread();
        YellowLightThread yellow = new YellowLightThread();

        red.start();
        green.start();
        yellow.start();


        
    }
}