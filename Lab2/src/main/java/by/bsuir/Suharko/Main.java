package by.bsuir.Suharko;

import by.bsuir.Suharko.Common.ApplianceNameConstant;
import by.bsuir.Suharko.Entity.Appliance;
import by.bsuir.Suharko.Entity.Feature.Feature;
import by.bsuir.Suharko.Entity.Feature.SearchFeature;
import by.bsuir.Suharko.Exception.ResourceException;
import by.bsuir.Suharko.Exception.ServiceException;
import by.bsuir.Suharko.Service.ApplianceService;
import by.bsuir.Suharko.Service.ServiceFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) throws ServiceException, ResourceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Feature featureLaptop = new Feature(ApplianceNameConstant.LAPTOP);
        featureLaptop.add(SearchFeature.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), 10000.0);
        appliances = service.find(featureLaptop);
        PrinterAppliance.print(appliances);

        Feature featureTeapot = new Feature(ApplianceNameConstant.TEAPOT);
        featureTeapot.add(SearchFeature.Teapot.POWER.name(), 1000.0);
        featureTeapot.add(SearchFeature.Teapot.BULK.name(), 2.0);
        appliances = service.find(featureTeapot);
        PrinterAppliance.print(appliances);

        Feature featureSmartphone = new Feature(ApplianceNameConstant.FRIDGE);
        featureSmartphone.add(SearchFeature.Fridge.COLOR.name(), "BLACK");
        featureSmartphone.add(SearchFeature.Fridge.COMPANY.name(), "LG");
        appliances = service.find(featureSmartphone);
        PrinterAppliance.print(appliances);
    }
}
