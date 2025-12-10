package ch.qos.logback.core.util;

import okhttp3.internal.p026ws.WebSocketProtocol;

/* loaded from: classes.dex */
public class DefaultInvocationGate implements InvocationGate {

    /* renamed from: a */
    public volatile long f40164a;

    /* renamed from: b */
    public long f40165b;

    /* renamed from: c */
    public long f40166c;

    /* renamed from: d */
    public long f40167d;

    /* renamed from: e */
    public long f40168e;

    /* renamed from: f */
    public long f40169f;

    public DefaultInvocationGate() {
        this(100L, 800L, System.currentTimeMillis());
    }

    /* renamed from: a */
    public final void m51324a() {
        this.f40164a >>>= 2;
    }

    /* renamed from: b */
    public final void m51323b() {
        if (this.f40164a >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            return;
        }
        this.f40164a = (this.f40164a << 1) | 1;
    }

    /* renamed from: c */
    public final void m51322c(long j) {
        this.f40168e = this.f40166c + j;
        this.f40169f = j + this.f40167d;
    }

    public long getInvocationCounter() {
        return this.f40165b;
    }

    @Override // ch.qos.logback.core.util.InvocationGate
    public final boolean isTooSoon(long j) {
        long j2 = this.f40165b;
        this.f40165b = 1 + j2;
        boolean z = (j2 & this.f40164a) == this.f40164a;
        if (z) {
            if (j < this.f40168e) {
                m51323b();
            }
            m51322c(j);
        } else if (j > this.f40169f) {
            m51324a();
            m51322c(j);
            return false;
        }
        return !z;
    }

    public DefaultInvocationGate(long j, long j2, long j3) {
        this.f40164a = 15L;
        this.f40165b = 0L;
        this.f40166c = j;
        this.f40167d = j2;
        this.f40168e = j + j3;
        this.f40169f = j3 + j2;
    }
}
