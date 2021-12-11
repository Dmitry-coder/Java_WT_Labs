package by.bsuir.Suharko.Service.Validator;

/**
 * CriteriaValidator interface.
 * @author Bakunovich Dzmitry
 */
public interface FeatureValidator {

    /**
     * Validate value of a search criteria
     *
     * @param value - value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}
