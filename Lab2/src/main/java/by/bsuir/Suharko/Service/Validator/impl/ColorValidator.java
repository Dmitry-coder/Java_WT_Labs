package by.bsuir.Suharko.Service.Validator.impl;

import by.bsuir.Suharko.Entity.Enums.Color;
import by.bsuir.Suharko.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Bakunovich Dzmitry
 */
public class ColorValidator implements FeatureValidator {

    /**
     * Method that checks valid of color.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
