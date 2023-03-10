package org.simpleframework.util;

import java.util.Collection;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author zhaodb 2023/1/3
 * @since 3.0.1
 */
public class ValidationUtil {

    public static boolean isEmpty(Collection<?> obj) {
        return obj == null || obj.isEmpty();
    }

    public static boolean isEmpty(String obj) {
        return obj == null || obj.equals("");
    }

    public static boolean isEmpty(Object[] obj) {
        return obj == null || obj.length == 0;
    }


    public static boolean isEmpty(Map<?, ?> obj) {
        return obj == null || obj.isEmpty();
    }
}
