package by.bsuir.Suharko.Entity.Feature;

public final class SearchFeature {

    public enum General {
        NAME, PRICE
    }

    public enum Teapot {
        PRICE, POWER, WEIGHT, BULK, COLOR
    }

    public enum Laptop {
        PRICE, BATTERY_CAPACITY, OS, MEMORY_ROM, CPU, DISPLAY_INCHES
    }

    public enum Fridge {
        PRICE, COLOR, COMPANY
    }

    public enum Mouse {
        PRICE, WEIGHT, LENGTH, HEIGHT, WIDTH, DPI
    }

    public enum PriceFilter {
        MORE_THAN_CURRENT_PRICE, LESS_THAN_CURRENT_PRICE, EQUAL_CURRENT_PRICE
    }

    private SearchFeature() {
    }
}

