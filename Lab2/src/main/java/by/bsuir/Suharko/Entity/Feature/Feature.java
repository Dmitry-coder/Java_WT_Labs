package by.bsuir.Suharko.Entity.Feature;

import java.util.HashMap;
import java.util.Map;

public class Feature {
    private final Map<String, Object> featureMap = new HashMap<>();
    private final String groupSearchName;

    public Feature(String groupSearchName) {
        this.groupSearchName = groupSearchName;
    }

    public String getGroupSearchName() {
        return groupSearchName;
    }

    public Map<String, Object> getFeatureMap() {
        return featureMap;
    }

    public void add(String searchFeature, Object value) {
        featureMap.put(searchFeature, value);
    }
}
