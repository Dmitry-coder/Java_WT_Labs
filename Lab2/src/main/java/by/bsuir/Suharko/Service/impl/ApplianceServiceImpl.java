package by.bsuir.Suharko.Service.impl;

import by.bsuir.Suharko.Exception.ResourceException;
import by.bsuir.Suharko.Exception.ServiceException;
import by.bsuir.Suharko.Service.Validator.Validator;
import by.bsuir.Suharko.DAO.ExceptionMessageConstant;
import by.bsuir.Suharko.DAO.ApplianceDAO;
import by.bsuir.Suharko.DAO.DAOFactory;
import by.bsuir.Suharko.Entity.Appliance;
import by.bsuir.Suharko.Entity.Feature.Feature;
import by.bsuir.Suharko.Service.ApplianceService;

import java.util.List;

/**
 * ApplianceServiceImpl class that works with appliances DAO.
 *
 * @author Bakunovich Dzmitry
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * Method that find appliances by criteria.
     *
     * @param feature the criteria
     * @return appliances
     * @throws ServiceException exception
     */
    @Override
    public List<Appliance> find(Feature feature) throws ServiceException {
        if (!Validator.isCriteriaValid(feature)) {
            throw new ServiceException(ExceptionMessageConstant.INVALID_CRITERIA_EXCEPTION_MSG);
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(feature);
        } catch (ResourceException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }

}
