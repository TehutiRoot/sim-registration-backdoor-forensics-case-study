package com.netcetera.threeds.sdk.infrastructure;

import java.security.Security;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pe */
/* loaded from: classes5.dex */
public class C9678pe {
    private static Logger valueOf = LoggerFactory.getLogger(C9678pe.class);

    public static boolean valueOf(String str, String str2) {
        for (String str3 : Security.getAlgorithms(str)) {
            if (str3.equalsIgnoreCase(str2)) {
                return true;
            }
        }
        return false;
    }
}