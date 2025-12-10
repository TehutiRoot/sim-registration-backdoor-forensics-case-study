package ch.qos.logback.core.util;

import okhttp3.internal.p026ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class DefaultInvocationGate implements InvocationGate {

    /* renamed from: a */
    public volatile long f40162a;

    /* renamed from: b */
    public long f40163b;

    /* renamed from: c */
    public long f40164c;

    /* renamed from: d */
    public long f40165d;

    /* renamed from: e */
    public long f40166e;

    /* renamed from: f */
    public long f40167f;

    public DefaultInvocationGate() {
        this(100L, 800L, System.currentTimeMillis());
    }

    /* renamed from: a */
    public final void m51319a() {
        this.f40162a >>>= 2;
    }

    /* renamed from: b */
    public final void m51318b() {
        if (this.f40162a >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return;
        }
        this.f40162a = (this.f40162a << 1) | 1;
    }

    /* renamed from: c */
    public final void m51317c(long j) {
        this.f40166e = this.f40164c + j;
        this.f40167f = j + this.f40165d;
    }

    public long getInvocationCounter() {
        return this.f40163b;
    }

    @Override // ch.qos.logback.core.util.InvocationGate
    public final boolean isTooSoon(long j) {
        long j2 = this.f40163b;
        this.f40163b = 1 + j2;
        boolean z = (j2 & this.f40162a) == this.f40162a;
        if (z) {
            if (j < this.f40166e) {
                m51318b();
            }
            m51317c(j);
        } else if (j > this.f40167f) {
            m51319a();
            m51317c(j);
            return false;
        }
        return !z;
    }

    public DefaultInvocationGate(long j, long j2, long j3) {
        this.f40162a = 15L;
        this.f40163b = 0L;
        this.f40164c = j;
        this.f40165d = j2;
        this.f40166e = j + j3;
        this.f40167f = j3 + j2;
    }
}