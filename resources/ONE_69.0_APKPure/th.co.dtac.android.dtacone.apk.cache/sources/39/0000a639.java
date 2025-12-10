package com.google.api.client.testing.util;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Sleeper;

@Beta
/* loaded from: classes4.dex */
public class MockSleeper implements Sleeper {

    /* renamed from: a */
    public int f52280a;

    /* renamed from: b */
    public long f52281b;

    public final int getCount() {
        return this.f52280a;
    }

    public final long getLastMillis() {
        return this.f52281b;
    }

    @Override // com.google.api.client.util.Sleeper
    public void sleep(long j) throws InterruptedException {
        this.f52280a++;
        this.f52281b = j;
    }
}