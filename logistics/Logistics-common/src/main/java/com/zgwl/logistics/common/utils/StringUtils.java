package com.zgwl.logistics.common.utils;

/**
 * 字符串工具类
 *
 * @author xds
 */
public class StringUtils {

    /**
     * 判空操作
     *
     * @param
     * @return
     */
    public static boolean isBlank(String value) {
        return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
    }

}
