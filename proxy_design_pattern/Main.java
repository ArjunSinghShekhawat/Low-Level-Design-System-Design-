package structural_design_pattern.proxy_design_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RemoteProxy remoteProxy = new RemoteProxy();

        while (true){
            Scanner scanner = new Scanner(System.in);
            String action = scanner.next();

            switch (action){
                case "left":
                    remoteProxy.turnLeft();
                    break;
                case"right":
                    remoteProxy.turnRight();
                    break;
                case "straight":
                    remoteProxy.goStraight();
                    break;
                default:
                    System.out.println("Please enter valid action");
            }
        }


    }
}
