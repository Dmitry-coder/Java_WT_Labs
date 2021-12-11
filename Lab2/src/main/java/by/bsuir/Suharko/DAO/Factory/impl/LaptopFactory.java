package by.bsuir.Suharko.DAO.Factory.impl;

import by.bsuir.Suharko.Entity.Appliance;
import by.bsuir.Suharko.Entity.Laptop;
import by.bsuir.Suharko.Entity.Enums.CPU;
import by.bsuir.Suharko.Entity.Enums.OS;
import by.bsuir.Suharko.Entity.Feature.SearchFeature;
import by.bsuir.Suharko.DAO.ExceptionMessageConstant;
import by.bsuir.Suharko.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LaptopFactory extends ApplianceFactory {
    int price;
    double batteryCapacity;
    double memoryRom;
    double displayInches;
    CPU cpu;
    OS os;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchFeature.Laptop laptopSearchCriteria = SearchFeature.Laptop.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (laptopSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case BATTERY_CAPACITY:
                        batteryCapacity = Double.parseDouble(value);
                        break;
                    case OS:
                        os = OS.valueOf(value);
                        break;
                    case MEMORY_ROM:
                        memoryRom = Double.parseDouble(value);
                        break;
                    case CPU:
                        cpu = CPU.valueOf(value);
                        break;
                    case DISPLAY_INCHES:
                        displayInches = Double.parseDouble(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }

        return new Laptop(price, batteryCapacity, os, memoryRom, cpu, displayInches);
    }

}
