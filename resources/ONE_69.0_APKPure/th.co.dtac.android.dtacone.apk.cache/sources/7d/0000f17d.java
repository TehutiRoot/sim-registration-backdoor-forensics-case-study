package org.apache.http.conn.util;

import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public class DnsUtils {
    /* renamed from: a */
    public static boolean m24965a(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static String normalize(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i = 0;
        while (length > 0 && !m24965a(str.charAt(i))) {
            i++;
            length--;
        }
        if (length > 0) {
            StringBuilder sb = new StringBuilder(str.length());
            sb.append((CharSequence) str, 0, i);
            while (length > 0) {
                char charAt = str.charAt(i);
                if (m24965a(charAt)) {
                    sb.append((char) (charAt + TokenParser.f74644SP));
                } else {
                    sb.append(charAt);
                }
                i++;
                length--;
            }
            return sb.toString();
        }
        return str;
    }
}