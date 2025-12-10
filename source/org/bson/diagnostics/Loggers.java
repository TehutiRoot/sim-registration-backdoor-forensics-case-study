package org.bson.diagnostics;

import org.bson.assertions.Assertions;

/* loaded from: classes6.dex */
public final class Loggers {
    public static final String PREFIX = "org.bson";

    /* renamed from: a */
    public static final boolean f75929a = m24196a();

    /* renamed from: a */
    public static boolean m24196a() {
        return true;
    }

    public static Logger getLogger(String str) {
        Assertions.notNull("suffix", str);
        if (!str.startsWith(".") && !str.endsWith(".")) {
            String str2 = "org.bson." + str;
            if (f75929a) {
                return new AC1(str2);
            }
            return new C17407Cg0(str2);
        }
        throw new IllegalArgumentException("The suffix can not start or end with a '.'");
    }
}
