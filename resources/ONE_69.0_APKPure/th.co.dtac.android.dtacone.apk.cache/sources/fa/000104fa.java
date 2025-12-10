package org.joda.time.p045tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.UTCProvider */
/* loaded from: classes5.dex */
public final class UTCProvider implements Provider {

    /* renamed from: a */
    public static final Set f76455a = Collections.singleton("UTC");

    @Override // org.joda.time.p045tz.Provider
    public Set<String> getAvailableIDs() {
        return f76455a;
    }

    @Override // org.joda.time.p045tz.Provider
    public DateTimeZone getZone(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return DateTimeZone.UTC;
        }
        return null;
    }
}