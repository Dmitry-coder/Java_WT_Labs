package by.bsuir.Suharko.Entity;

import by.bsuir.Suharko.Common.ApplianceNameConstant;
import by.bsuir.Suharko.Common.SearchFeatureConstant;
import by.bsuir.Suharko.Entity.Enums.Color;

import java.util.Objects;

public class Teapot extends Appliance {
    private double power;
    private double weight;
    private double bulk;
    private Color color;

    public Teapot() {
    }

    public Teapot(double price,
                double power,
                double weight,
                double bulk,
                Color color) {
        super(price);
        this.power = power;
        this.weight = weight;
        this.bulk = bulk;
        this.color = color;

    }

    @Override
    public boolean isMatchesCriteria(String featureName, Object value) {
        switch (featureName) {
            case SearchFeatureConstant.PRICE:
            case SearchFeatureConstant.MORE_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.LESS_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.EQUAL_CURRENT_PRICE:
                return super.isMatchesCriteria(featureName, value);
            case SearchFeatureConstant.APPLIANCE_NAME:
                return ApplianceNameConstant.TEAPOT.equals(value);
            case SearchFeatureConstant.POWER:
                return (double) value == power;
            case SearchFeatureConstant.WEIGHT:
                return (double) value == weight;
            case SearchFeatureConstant.BULK:
                return (double) value == bulk;
            case SearchFeatureConstant.COLOR:
                return color.equals(Color.valueOf((String) value));
            default:
                return false;
        }
    }

    public double getPower() {
        return power;
    }

    public double getWidth() {
        return weight;
    }

    public double getBulk() {
        return bulk;
    }

    public Color getColor() {
        return color;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Teapot teapot = (Teapot) o;
        return Double.compare(teapot.power, power) == 0 && Double.compare(teapot.bulk, bulk) == 0 &&  Double.compare(teapot.weight, weight) == 0 && color == teapot.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power, weight, bulk);
    }

    @Override
    public String toString() {
        return "Teapot [" +
                "price - " + super.getPrice() +
                " | power - " + power +
                " | weight - " + weight +
                " | bulk - " + bulk +
                " | color - " + color +
                ']';
    }
}
