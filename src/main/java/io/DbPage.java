package io;

import java.util.List;

public class DbPage {

    public byte pageType;    

    /*
     * Field which identifies the number of records in the page.
     */
    public  byte numberOfRecords;

    public short startingAddress;

    public int rightNodeAddress;

    public int leftNodeAddress;

    public List<Short> recordAddressList;

    public List<String> pageRecords;

    public int pageNumber;
    
    public static short PAGE_SIZE = 512;
    public static final byte INTERIOR_PAGE_TYPE = 0x05;
    public static final byte LEAF_PAGE_TYPE = 0x0D;
    public static final byte RIGHTMOST_PAGE_ID = 0xFFFFFFFF;
}
