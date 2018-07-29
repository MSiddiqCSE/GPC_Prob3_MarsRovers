package mars.rovers;

public class CommandProcessor {

    public void processCommand(int xm, int ym, int x, int y, char dir, String command) {

        for(char cmd: command.toCharArray()) {

            switch (cmd) {
                case 'L':
                    dir = (dir == 'N') ? 'W' : (dir == 'W') ? 'S' : (dir == 'S') ? 'E' : 'N';
                    break;

                case 'R':
                    dir = (dir == 'N') ? 'E' : (dir == 'E') ? 'S' : (dir == 'S') ? 'W' : 'N';
                    break;

                case 'M':

                    if (dir == 'E' && x < xm) x++;
                    else if (dir == 'W' && x > 0) x--;
                    else if (dir == 'N' && y < ym) y++;
                    else if (dir == 'S' && y > 0) y--;
            }
        }

        System.out.println(x + " " + y + " " + dir);

    }
}
