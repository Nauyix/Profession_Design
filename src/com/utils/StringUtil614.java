package com.utils;

public class StringUtil614 {
    public static boolean isEmpty(String str){
        return str==null || "".equals(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
