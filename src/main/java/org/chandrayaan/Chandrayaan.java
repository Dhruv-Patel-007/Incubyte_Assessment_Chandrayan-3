package org.chandrayaan;

public class Chandrayaan {
    private int x, y, z;
    private char direction;

    public Chandrayaan(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.direction = ' ';
    }
    public Chandrayaan(int x_coord, int y_coord, int z_coord, char intialDirection) {
        this.x = x_coord;
        this.y = y_coord;
        this.z = z_coord;
        this.direction = intialDirection;
    }

    public String finalDirection(char[] commands) {
        String finalLocation = "(";

        for (char command : commands) {
            switch (command) {
                case 'f':
                    goForward();
                    break;
                case 'r':
                    goRight();
                    break;
                case 'l':
                    goLeft();
                    break;
                case 'b':
                    goBackward();
                    break;
                case 'u':
                    goUp();
                    break;
                case 'd':
                    goDown();
                    break;
            }
        }

        finalLocation += Integer.toString(x) + "," + Integer.toString(y) + "," + Integer.toString(z) + "," + direction + ")";

        return finalLocation;
    }

    private void goBackward() {
        switch (direction) {
            case 'N':
                y--;
                break;
            case 'S':
                y++;
                break;
            case 'E':
                x--;
                break;
            case 'W':
                x++;
                break;
            case 'U':
                z--;
                break;
            case 'D':
                z++;
                break;
        }
    }

    private void goForward() {
        switch (direction) {
            case 'N':
                y++;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            case 'W':
                x--;
                break;
            case 'U':
                z++;
                break;
            case 'D':
                z--;
                break;
        }
    }

    private void goRight(){
        switch (direction) {
            case 'N':
                direction = 'E';
                break;
            case 'S':
                direction = 'W';
                break;
            case 'E':
                direction = 'S';
                break;
            case 'W':
                direction = 'N';
                break;
            case 'U':
                direction = 'W';
                break;
            case 'D':
                direction = 'E';
                break;
        }
    }

    private void goLeft() {
        switch (direction) {
            case 'N':
                direction = 'W';
                break;
            case 'S':
                direction = 'E';
                break;
            case 'E':
                direction = 'N';
                break;
            case 'W':
                direction = 'S';
                break;
            case 'U':
                direction = 'W';
                break;
            case 'D':
                direction = 'E';
                break;
        }
    }
    private void goUp() {
        switch (direction) {
            case 'N':
                direction = 'U';
                break;
            case 'S':
                direction = 'D';
                break;
            case 'E':
                direction = 'U';
                break;
            case 'W':
                direction = 'U';
                break;
            case 'U':
                break;
            case 'D':
                break;
        }
    }

    private void goDown() {
        switch (direction) {
            case 'N':
                direction = 'D';
                break;
            case 'S':
                direction = 'U';
                break;
            case 'E':
                direction = 'D';
                break;
            case 'W':
                direction = 'D';
                break;
            case 'U':
                break;
            case 'D':
                break;
        }
    }
}
