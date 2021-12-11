package by.bsuir.Suharko.Entity;

import by.bsuir.Suharko.Common.SearchFeatureConstant;
import by.bsuir.Suharko.Entity.Enums.Color;

import java.io.Serializable;
import java.util.Objects;

public class Appliance implements Serializable {
    protected Color color;
    private double price;

    public Appliance() {
    }

    public Appliance(double price) {
        this.price = price;
    }

    public boolean isMatchesCriteria(String criteriaName, Object value) {
        switch (criteriaName) {
            case SearchFeatureConstant.MORE_THAN_CURRENT_PRICE:
                return price > (double) value;
            case SearchFeatureConstant.LESS_THAN_CURRENT_PRICE:
                return price < (double) value;
            case SearchFeatureConstant.PRICE:
            case SearchFeatureConstant.EQUAL_CURRENT_PRICE:
                return price == (double) value;
            default:
                return false;
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return Double.compare(appliance.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Appliance [" +
                "price - " + price +
                ']';
    }
}