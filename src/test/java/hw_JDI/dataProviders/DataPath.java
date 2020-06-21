package hw_JDI.dataProviders;

public enum DataPath {

    DATA_PATH("src/test/resources/hw_JDI/JDI_ex8_metalsColorsDataSet.json");

    final String value;

    DataPath(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
