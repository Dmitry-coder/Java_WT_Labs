package by.bsuir.Suharko.Service;

import by.bsuir.Suharko.Exception.ResourceException;
import by.bsuir.Suharko.Exception.ServiceException;
import by.bsuir.Suharko.Entity.Appliance;
import by.bsuir.Suharko.Entity.Feature.Feature;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 * @author Bakunovich Dzmitry
 */
public interface ApplianceService {

    /**
     * Method that finds list of appliance.
     *
     * @param feature the feature
     * @return the list
     * @throws ResourceException the resource exception
     * @throws ServiceException  the service exception
     */
    List<Appliance> find(Feature feature) throws ResourceException, ServiceException;

}
