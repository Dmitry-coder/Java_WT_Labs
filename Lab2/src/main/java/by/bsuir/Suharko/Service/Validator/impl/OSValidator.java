package by.bsuir.Suharko.Service.Validator.impl;

import by.bsuir.Suharko.Entity.Enums.OS;
import by.bsuir.Suharko.Service.Validator.FeatureValidator;

/**
 * OSValidator class.
 * @author Bakunovich Dzmitry
 */
public class OSValidator implements FeatureValidator {

    /**
     * Method that checks valid of os.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
