package ch.qos.logback.core.util;

import org.bouncycastle.i18n.TextBundle;

/* loaded from: classes.dex */
public class ContentTypeUtil {
    public static String getSubType(String str) {
        int indexOf;
        int i;
        if (str == null || (indexOf = str.indexOf(47)) == -1 || (i = indexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i);
    }

    public static boolean isTextual(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(TextBundle.TEXT_ENTRY);
    }
}