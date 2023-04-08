package com.fkp.spring.framework.context.util;

import java.util.Locale;

public class StringUtils {
    private StringUtils(){}

    public static String getSetterMethodNameByFieldName(String fieldName){
        return "set" + fieldName.substring(0, 1).toUpperCase(Locale.ROOT) + fieldName.substring(1);
    }
}
