package io.opencensus.internal;

/* loaded from: classes5.dex */
public final class StringUtils {
    /* renamed from: a */
    public static boolean m30261a(char c) {
        return c >= ' ' && c <= '~';
    }

    public static boolean isPrintableString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!m30261a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
