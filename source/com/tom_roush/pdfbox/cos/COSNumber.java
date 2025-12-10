package com.tom_roush.pdfbox.cos;

import java.io.IOException;
import org.apache.commons.cli.HelpFormatter;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public abstract class COSNumber extends COSBase {
    @Deprecated
    public static final COSInteger ZERO = COSInteger.ZERO;
    @Deprecated
    public static final COSInteger ONE = COSInteger.ONE;

    /* renamed from: b */
    public static boolean m32787b(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '.' || charAt == 'e') {
                return true;
            }
        }
        return false;
    }

    public static COSNumber get(String str) throws IOException {
        String substring;
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if ('0' <= charAt && charAt <= '9') {
                return COSInteger.get(charAt - 48);
            }
            if (charAt != '-' && charAt != '.') {
                throw new IOException("Not a number: " + str);
            }
            return COSInteger.ZERO;
        } else if (m32787b(str)) {
            return new COSFloat(str);
        } else {
            try {
                if (str.charAt(0) == '+') {
                    return COSInteger.get(Long.parseLong(str.substring(1)));
                }
                return COSInteger.get(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                if (!str.startsWith(Marker.ANY_NON_NULL_MARKER) && !str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
                    substring = str;
                } else {
                    substring = str.substring(1);
                }
                if (substring.matches("[0-9]*")) {
                    if (str.startsWith(HelpFormatter.DEFAULT_OPT_PREFIX)) {
                        return COSInteger.OUT_OF_RANGE_MIN;
                    }
                    return COSInteger.OUT_OF_RANGE_MAX;
                }
                throw new IOException("Not a number: " + str);
            }
        }
    }

    public abstract double doubleValue();

    public abstract float floatValue();

    public abstract int intValue();

    public abstract long longValue();
}
