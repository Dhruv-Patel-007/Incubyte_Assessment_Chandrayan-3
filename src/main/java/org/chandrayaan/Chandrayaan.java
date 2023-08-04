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
}
