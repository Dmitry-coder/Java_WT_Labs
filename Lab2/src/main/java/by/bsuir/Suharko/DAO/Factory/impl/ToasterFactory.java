package by.bsuir.Suharko.DAO.Factory.impl;

import by.bsuir.Suharko.Entity.Appliance;
import by.bsuir.Suharko.Entity.Fridge;
import by.bsuir.Suharko.Entity.Enums.Color;
import by.bsuir.Suharko.Entity.Enums.Company;
import by.bsuir.Suharko.Entity.Feature.SearchFeature;
import by.bsuir.Suharko.DAO.ExceptionMessageConstant;
import by.bsuir.Suharko.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ToasterFactory extends ApplianceFactory {
    int price;
    Color color;
    Company company;

    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchFeature.Fridge tabletPCSearchCriteria = SearchFeature.Fridge.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (tabletPCSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    case COMPANY:
                        company = Company.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new Fridge(price, color, company);
    }

}
