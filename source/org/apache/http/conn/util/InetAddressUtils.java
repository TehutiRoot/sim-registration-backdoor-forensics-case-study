package org.apache.http.conn.util;

import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class InetAddressUtils {

    /* renamed from: a */
    public static final Pattern f73851a = Pattern.compile("^(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    /* renamed from: b */
    public static final Pattern f73852b = Pattern.compile("^::[fF]{4}:(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");

    /* renamed from: c */
    public static final Pattern f73853c = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");

    /* renamed from: d */
    public static final Pattern f73854d = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");

    public static boolean isIPv4Address(String str) {
        return f73851a.matcher(str).matches();
    }

    public static boolean isIPv4MappedIPv64Address(String str) {
        return f73852b.matcher(str).matches();
    }

    public static boolean isIPv6Address(String str) {
        if (!isIPv6StdAddress(str) && !isIPv6HexCompressedAddress(str)) {
            return false;
        }
        return true;
    }

    public static boolean isIPv6HexCompressedAddress(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ':') {
                i++;
            }
        }
        if (i > 7 || !f73854d.matcher(str).matches()) {
            return false;
        }
        return true;
    }

    public static boolean isIPv6StdAddress(String str) {
        return f73853c.matcher(str).matches();
    }
}
