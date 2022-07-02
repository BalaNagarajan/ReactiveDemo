package com.jcircle.reactive.processor.utils;

import org.springframework.util.CollectionUtils;

import java.net.InetAddress;
import java.util.Collection;

public class CommonUtils {

    private CommonUtils() {

    }

    /**
     * Validates the input Collection
     */
    public static <E> boolean isNotEmpty(final Collection<E> collection) {
        return !CollectionUtils.isEmpty(collection);
    }

    /**
     * Validates the input String
     */
    public static boolean isNotEmpty(final String input) {
        return org.springframework.util.StringUtils.hasLength(input);
    }

    /**
     * Returns the Host Name
     */
    public static String getHostNameFromSystem() {
        String result = "Unknown";
        try {
            InetAddress ia = InetAddress.getLocalHost();
            result = ia.getHostName();
            int indx = result.indexOf('.');
            if (indx > 0) {
                result = result.substring(0, indx);
            }
        } catch (Exception e) {
            //  log.error("Could not get hostname. Exception:: {}", e);
        }
        return result;
    }

}
