package by.bsuir.Suharko.Entity;

import by.bsuir.Suharko.Common.ApplianceNameConstant;
import by.bsuir.Suharko.Common.SearchFeatureConstant;
import by.bsuir.Suharko.Entity.Enums.Color;
import by.bsuir.Suharko.Entity.Enums.Company;

import java.util.Objects;

public class Fridge extends Appliance {

    private Color color;
    private Company company;
    public Fridge() {
    }

    public Fridge(double price,
                  Color color,
                  Company company) {
        super(price);
        this.color = color;
        this.company = company;
    }

    @Override
    public boolean isMatchesCriteria(String criteriaName, Object value) {
        switch (criteriaName) {
            case SearchFeatureConstant.PRICE:
            case SearchFeatureConstant.MORE_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.LESS_THAN_CURRENT_PRICE:
            case SearchFeatureConstant.EQUAL_CURRENT_PRICE:
                return super.isMatchesCriteria(criteriaName, value);
            case SearchFeatureConstant.APPLIANCE_NAME:
                return ApplianceNameConstant.FRIDGE.equals(value);
            case SearchFeatureConstant.COLOR:
                return color.equals(Color.valueOf((String) value));
            case SearchFeatureConstant.COMPANY:
                return company.equals(Company.valueOf((String) value));
            default:
                return false;
        }
    }

    public Color getColor() {
        return color;
    }

    public Company getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fridge smartphone = (Fridge) o;
        return color == smartphone.color && company == smartphone.company;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, company);
    }

    @Override
    public String toString() {
        return "Fridge [" +
                "price - " + super.getPrice() +
                " | color - " + color +
                " | company - " + company +
                ']';
    }
}
