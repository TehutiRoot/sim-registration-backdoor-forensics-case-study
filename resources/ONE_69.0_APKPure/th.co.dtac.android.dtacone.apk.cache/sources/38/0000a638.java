package com.google.api.client.testing.util;

import com.google.api.client.util.BackOff;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import java.io.IOException;

@Beta
/* loaded from: classes4.dex */
public class MockBackOff implements BackOff {

    /* renamed from: a */
    public long f52277a;

    /* renamed from: b */
    public int f52278b = 10;

    /* renamed from: c */
    public int f52279c;

    public final int getMaxTries() {
        return this.f52278b;
    }

    public final int getNumberOfTries() {
        return this.f52279c;
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() throws IOException {
        int i = this.f52279c;
        if (i < this.f52278b) {
            long j = this.f52277a;
            if (j != -1) {
                this.f52279c = i + 1;
                return j;
            }
        }
        return -1L;
    }

    @Override // com.google.api.client.util.BackOff
    public void reset() throws IOException {
        this.f52279c = 0;
    }

    public MockBackOff setBackOffMillis(long j) {
        boolean z;
        if (j != -1 && j < 0) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z);
        this.f52277a = j;
        return this;
    }

    public MockBackOff setMaxTries(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f52278b = i;
        return this;
    }
}