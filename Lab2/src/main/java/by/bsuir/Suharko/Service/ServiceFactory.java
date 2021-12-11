package by.bsuir.Suharko.Service;

import by.bsuir.Suharko.Service.impl.ApplianceServiceImpl;

/**
 * ServiceFactory class.
 * @author Bakunovich Dzmitry
 */
public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();
    private final ApplianceService applianceService = new ApplianceServiceImpl();

    private ServiceFactory() {
    }

    /**
     * Gets appliance service.
     *
     * @return the appliance service
     */
    public ApplianceService getApplianceService() {
        return applianceService;
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static ServiceFactory getInstance() {
        return instance;
    }

}
