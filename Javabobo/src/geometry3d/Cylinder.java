package geometry3d;

import geometry2d.Figure;
import exceptions.InvalidHeightException;

public class Cylinder {
    private Figure base;
    private double height;

    public Cylinder(Figure base, double height) {
        if (height <= 0) {
            throw new InvalidHeightException("Высота должна быть положительным числом.");
        }
        this.base = base;
        this.height = height;
    }

    // Метод для вычисления объема цилиндра
    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return String.format("Цилиндр [основание = %s, высота = %.2f]", base, height);
    }
}