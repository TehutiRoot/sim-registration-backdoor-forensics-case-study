package com.google.firebase.installations.time;

/* loaded from: classes4.dex */
public class SystemClock implements Clock {

    /* renamed from: a */
    public static SystemClock f55568a;

    public static SystemClock getInstance() {
        if (f55568a == null) {
            f55568a = new SystemClock();
        }
        return f55568a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
