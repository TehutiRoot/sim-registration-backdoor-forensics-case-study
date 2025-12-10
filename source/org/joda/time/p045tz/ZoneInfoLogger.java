package org.joda.time.p045tz;

/* renamed from: org.joda.time.tz.ZoneInfoLogger */
/* loaded from: classes5.dex */
public class ZoneInfoLogger {

    /* renamed from: a */
    public static ThreadLocal f76399a = new C13033a();

    /* renamed from: org.joda.time.tz.ZoneInfoLogger$a */
    /* loaded from: classes5.dex */
    public static class C13033a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Boolean initialValue() {
            return Boolean.FALSE;
        }
    }

    public static void set(boolean z) {
        f76399a.set(Boolean.valueOf(z));
    }

    public static boolean verbose() {
        return ((Boolean) f76399a.get()).booleanValue();
    }
}
