package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.qv */
/* loaded from: classes5.dex */
public class C9699qv {
    public static String valueOf(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (str == null) {
                str = "";
            }
            sb.append(str);
            if (i != strArr.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    public static String[] values(String str) {
        String[] split = str.split("\\.");
        if (str.endsWith(".")) {
            String[] strArr = new String[split.length + 1];
            System.arraycopy(split, 0, strArr, 0, split.length);
            strArr[split.length] = "";
            return strArr;
        }
        return split;
    }
}