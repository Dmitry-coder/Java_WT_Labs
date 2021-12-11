package by.bsuir.Suharko.Service.Validator.impl;

import by.bsuir.Suharko.Service.Validator.FeatureValidator;

/**
 * DoubleValidator class.
 * @author Bakunovich Dzmitry
 */
public class DoubleValidator implements FeatureValidator {

    /**
     * Method that checks valid of double.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}
