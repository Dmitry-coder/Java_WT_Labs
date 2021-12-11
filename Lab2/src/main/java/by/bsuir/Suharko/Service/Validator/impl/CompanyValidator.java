package by.bsuir.Suharko.Service.Validator.impl;

import by.bsuir.Suharko.Entity.Enums.Company;
import by.bsuir.Suharko.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Bakunovich Dzmitry
 */
public class CompanyValidator implements FeatureValidator {

    /**
     * Method that checks valid of company.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Company.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}