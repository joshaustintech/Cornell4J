package tech.joshaustin.cornell4j.image;

import tech.joshaustin.cornell4j.common.Vec3;

public class Image {

    private final Vec3.RGB[][] pixels;

    public Image(int width, int height) {
        this.pixels = new Vec3.RGB[width][height];
    }

    public synchronized void setPixel(int row, int column, Vec3.RGB color) {
        this.pixels[row][column] = color;
    }

    public Vec3.RGB getPixel(int row, int column) {
        return this.pixels[row][column];
    }

}
