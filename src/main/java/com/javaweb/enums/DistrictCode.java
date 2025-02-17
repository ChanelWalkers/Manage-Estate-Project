package com.javaweb.enums;

import java.util.Map;
import java.util.TreeMap;

public enum DistrictCode {
    QUAN_1("Quận 1"),
    QUAN_3("Quận 3"),
    QUAN_4("Quận 4"),
    QUAN_5("Quận 5"),
    QUAN_6("Quận 6"),
    QUAN_7("Quận 7"),
    QUAN_8("Quận 8"),
    QUAN_PN("Quận Phú Nhuận"),
    QUAN_BTH("Quận Bình Thạnh");
    private final String districtName;
    DistrictCode(String districtName){
        this.districtName = districtName;
    }
    public String getDistrictName(){
        return districtName;
    }
    public static Map<String,String> getDistrict(){
        Map<String,String> map = new TreeMap<>();
        for(DistrictCode x : DistrictCode.values()){
            map.put(x.toString(),x.getDistrictName());
        }
        return map;
    }
}
