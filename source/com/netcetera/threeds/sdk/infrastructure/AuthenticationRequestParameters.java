package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class AuthenticationRequestParameters {
    private static final InterfaceC9652ns values = C9653nt.ThreeDS2ServiceInstance(AuthenticationRequestParameters.class);
    private static Map<Class<? extends getMessageVersion>, getMessageVersion> ThreeDS2ServiceInstance = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static void ThreeDS2Service(getMessageVersion getmessageversion) {
        getmessageversion.getClass();
        if (!valueOf(getmessageversion)) {
            if (ThreeDS2ServiceInstance(getmessageversion) && ThreeDS2ServiceInstance()) {
                throw new getSDKAppID("Root module already installed. Only single root module allowed.");
            }
            if (!ThreeDS2ServiceInstance(getmessageversion) && !get(getmessageversion)) {
                throw new getSDKAppID("The parent module of [" + getmessageversion.getClass().getSimpleName() + "] is not installed. The parent module is [" + getmessageversion.get().getSimpleName() + "]");
            }
            ThreeDS2ServiceInstance.put(getmessageversion.getClass(), getmessageversion);
            return;
        }
        throw new getSDKAppID("Module [" + getmessageversion.getClass() + "] already installed.");
    }

    private static boolean ThreeDS2ServiceInstance() {
        for (getMessageVersion getmessageversion : ThreeDS2ServiceInstance.values()) {
            if (getmessageversion.get() == null) {
                return true;
            }
        }
        return false;
    }

    private static boolean get(getMessageVersion getmessageversion) {
        return ThreeDS2ServiceInstance.containsKey(getmessageversion.get());
    }

    public static <T> T valueOf(Class<T> cls) {
        for (getMessageVersion getmessageversion : ThreeDS2ServiceInstance.values()) {
            T t = (T) getmessageversion.values(cls);
            if (t != null) {
                return t;
            }
        }
        throw new getSDKAppID(cls.getSimpleName() + " not registered in any module.");
    }

    private static boolean ThreeDS2ServiceInstance(getMessageVersion getmessageversion) {
        return getmessageversion.get() == null;
    }

    private static boolean valueOf(getMessageVersion getmessageversion) {
        return ThreeDS2ServiceInstance.containsKey(getmessageversion.getClass());
    }

    public static void ThreeDS2Service(Class<? extends getMessageVersion> cls) {
        getMessageVersion remove = ThreeDS2ServiceInstance.remove(cls);
        if (remove != null) {
            cls.getSimpleName();
            Iterator it = new ArrayList(ThreeDS2ServiceInstance.values()).iterator();
            while (it.hasNext()) {
                getMessageVersion getmessageversion = (getMessageVersion) it.next();
                getmessageversion.getClass();
                if (remove.getClass().equals(getmessageversion.get())) {
                    ThreeDS2Service((Class<? extends getMessageVersion>) getmessageversion.getClass());
                }
            }
            return;
        }
        cls.getSimpleName();
    }
}
