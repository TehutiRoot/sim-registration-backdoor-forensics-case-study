package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.oh */
/* loaded from: classes5.dex */
public class C9653oh {
    public static <T> T ThreeDS2Service(T t, T t2) {
        return t != null ? t : t2;
    }

    public static boolean ThreeDS2ServiceInstance(Object... objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean get(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return false;
            }
        }
        return true;
    }
}