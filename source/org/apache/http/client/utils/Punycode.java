package org.apache.http.client.utils;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class Punycode {

    /* renamed from: a */
    public static final Idn f73735a;

    static {
        Idn rfc3492Idn;
        try {
            rfc3492Idn = new JdkIdn();
        } catch (Exception unused) {
            rfc3492Idn = new Rfc3492Idn();
        }
        f73735a = rfc3492Idn;
    }

    public static String toUnicode(String str) {
        return f73735a.toUnicode(str);
    }
}
