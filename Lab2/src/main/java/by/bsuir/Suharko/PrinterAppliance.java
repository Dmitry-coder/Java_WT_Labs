package by.bsuir.Suharko;

import by.bsuir.Suharko.DAO.ExceptionMessageConstant;
import by.bsuir.Suharko.Entity.Appliance;

import java.util.List;

public class PrinterAppliance {

    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_NULL_EXCEPTION_MSG);
        } else if (appliances.isEmpty()) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_EMPTY_EXCEPTION_MSG);
        } else {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
    }

}
