package by.bsuir.Suharko.DAO.Factory;

import by.bsuir.Suharko.Common.ApplianceNameConstant;
import by.bsuir.Suharko.DAO.Factory.impl.LaptopFactory;
import by.bsuir.Suharko.DAO.Factory.impl.FridgeFactory;
import by.bsuir.Suharko.DAO.Factory.impl.TeapotFactory;
import by.bsuir.Suharko.Entity.Appliance;
import by.bsuir.Suharko.DAO.ExceptionMessageConstant;
import org.w3c.dom.NodeList;

public abstract class ApplianceFactory {

    public abstract Appliance createAppliance(NodeList nodeList);

    public static ApplianceFactory getApplianceFactory(String applianceName) {
        switch (applianceName) {
            case ApplianceNameConstant.LAPTOP:
                return new LaptopFactory();
            case ApplianceNameConstant.TEAPOT:
                return new TeapotFactory();
            case ApplianceNameConstant.FRIDGE:
                return new FridgeFactory();
            default:
                throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_FACTORY_EXCEPTION_MSG);
        }
    }

}
