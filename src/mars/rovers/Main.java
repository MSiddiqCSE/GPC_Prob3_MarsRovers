package mars.rovers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int  xm = 0, ym = 0; // upper right corner is (xm, ym) and lower left corner is by default (0, 0)
        int x, y; // (x,y) = current position
        char dir; // current direction
        String command;

        CommandProcessor cp = new CommandProcessor();

        String fileName = "INPUT.txt";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {

            if(scanner.hasNext()) {
                xm = scanner.nextInt();
                ym = scanner.nextInt();
            }

            while (scanner.hasNext()){
                x = scanner.nextInt();
                y = scanner.nextInt();

                dir = scanner.nextLine().charAt(1);
                command = scanner.nextLine();

                cp.processCommand(xm, ym, x, y, dir, command);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
