package by.bsuir.Suharko.Service.Validator.impl;

import by.bsuir.Suharko.Entity.Enums.CPU;
import by.bsuir.Suharko.Service.Validator.FeatureValidator;

/**
 * CPUValidator class.
 * @author Bakunovich Dzmitry
 */
public class CPUValidator implements FeatureValidator {

    /**
     * Method that checks valid of cpu.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
