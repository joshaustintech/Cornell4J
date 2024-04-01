package tech.joshaustin.cornell4j.common;

public sealed interface Vec3 permits Vec3.Point, Vec3.RGB {

    double first();
    double second();
    double third();

    record Point(double x, double y, double z) implements Vec3 {
        public double first() {
            return x;
        }

        public double second() {
            return y;
        }

        public double third() {
            return z;
        }
    }

    record RGB(double r, double g, double b) implements Vec3 {
        public double first() {
            return r;
        }

        public double second() {
            return g;
        }

        public double third() {
            return b;
        }
    }

}
