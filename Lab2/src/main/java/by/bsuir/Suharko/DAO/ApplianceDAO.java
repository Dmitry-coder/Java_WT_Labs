package by.bsuir.Suharko.DAO;

import by.bsuir.Suharko.Entity.Appliance;
import by.bsuir.Suharko.Entity.Feature.Feature;
import by.bsuir.Suharko.Exception.ResourceException;

import java.util.List;

public interface ApplianceDAO {

    List<Appliance> find(Feature feature) throws ResourceException;
}
