package com.netcetera.threeds.sdk.infrastructure;

import androidx.core.p005os.EnvironmentCompat;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.List;
import java.util.Map;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.rn */
/* loaded from: classes5.dex */
public class C9729rn {
    public static String ThreeDS2ServiceInstance(Map<String, Object> map, String str) throws C9727rl {
        Object obj = map.get(str);
        try {
            return (String) obj;
        } catch (ClassCastException unused) {
            throw new C9727rl(OperatorName.SHOW_TEXT_LINE + str + "' parameter was " + values(obj) + " type but is required to be a String.");
        }
    }

    public static Long get(Map<String, ?> map, String str) {
        Object obj = map.get(str);
        if (obj != null) {
            return Long.valueOf(((Number) obj).longValue());
        }
        return null;
    }

    public static List<String> valueOf(Map<String, Object> map, String str) {
        return (List) map.get(str);
    }

    public static String values(Map<String, Object> map, String str) {
        return (String) map.get(str);
    }

    public static String values(Object obj) {
        if (obj instanceof Number) {
            return "Number";
        }
        if (obj instanceof Boolean) {
            return "Boolean";
        }
        if (obj instanceof List) {
            return "Array";
        }
        if (obj instanceof Map) {
            return "Object";
        }
        if (obj instanceof String) {
            return "String";
        }
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }
}
