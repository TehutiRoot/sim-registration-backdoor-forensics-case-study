package com.netcetera.threeds.sdk.infrastructure;

import java.lang.reflect.Array;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.of */
/* loaded from: classes5.dex */
public class C9651of {
    public static final byte[] ThreeDS2ServiceInstance = new byte[0];
    public static final String[] ThreeDS2Service = new String[0];

    public static String[] ThreeDS2Service(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        if (objArr.length == 0) {
            return ThreeDS2Service;
        }
        String[] strArr = new String[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            strArr[i] = objArr[i].toString();
        }
        return strArr;
    }

    public static int ThreeDS2ServiceInstance(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static boolean get(Object[] objArr, Object obj) {
        return ThreeDS2Service(objArr, obj) != -1;
    }

    public static boolean values(Object[] objArr) {
        if (ThreeDS2ServiceInstance(objArr) == 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean get(T[] tArr) {
        return !values(tArr);
    }

    public static int ThreeDS2Service(Object[] objArr, Object obj) {
        return ThreeDS2Service(objArr, obj, 0);
    }

    public static int ThreeDS2Service(Object[] objArr, Object obj, int i) {
        if (objArr == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}