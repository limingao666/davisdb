package query.contracts;

public enum DataType {

    TINYINT(1, "0x01"),SMALLINT(2,"0x02"),INT(4,"0x03"),
    BIGINT(8,"0x04"),FLOAT(4,"0x05"),DOUBLE(8,"0x06"),
    DATETIME(8,"0x07"),DATE(8,"0x08"),TEXT(Integer.MAX_VALUE,"0x0A");

    public final int size;
    public String dataTypeCode;

    DataType(int i, String dataTypeCode) {
        this.size = i;
        this.dataTypeCode = dataTypeCode;
    }
}
