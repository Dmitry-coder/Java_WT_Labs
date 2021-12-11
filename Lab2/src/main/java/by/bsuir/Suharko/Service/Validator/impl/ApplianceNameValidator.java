package by.bsuir.Suharko.Service.Validator.impl;

import by.bsuir.Suharko.Common.ApplianceNameConstant;
import by.bsuir.Suharko.Service.Validator.FeatureValidator;

/**
 * ApplianceNameValidator class.
 * @author Bakunovich Dzmitry
 */
public class ApplianceNameValidator implements FeatureValidator {

    /**
     * Method that checks valid of criteria name.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            switch ((String) value) {
                case ApplianceNameConstant.LAPTOP:
                case ApplianceNameConstant.TEAPOT:
                case ApplianceNameConstant.FRIDGE:
                    return true;
                default:
                    return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
