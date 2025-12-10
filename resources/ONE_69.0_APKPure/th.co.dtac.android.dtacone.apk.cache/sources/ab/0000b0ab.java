package com.google.firebase.installations.time;

/* loaded from: classes4.dex */
public class SystemClock implements Clock {

    /* renamed from: a */
    public static SystemClock f55580a;

    public static SystemClock getInstance() {
        if (f55580a == null) {
            f55580a = new SystemClock();
        }
        return f55580a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}