package by.bsuir.Suharko.Service.Validator.impl;

import by.bsuir.Suharko.Service.Validator.FeatureValidator;

/**
 * IntValidator class.
 * @author Bakunovich Dzmitry
 */
public class IntValidator implements FeatureValidator {

    /**
     * Method that checks valid of int.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Integer) {
            return (Integer) value > 0;
        } else {
            return false;
        }
    }

}
