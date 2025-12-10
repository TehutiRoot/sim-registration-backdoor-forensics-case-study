package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes5.dex */
public final class CurrentParsingState {

    /* renamed from: a */
    public int f57937a = 0;

    /* renamed from: b */
    public State f57938b = State.NUMERIC;

    /* loaded from: classes5.dex */
    public enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int m33992a() {
        return this.f57937a;
    }

    /* renamed from: b */
    public void m33991b(int i) {
        this.f57937a += i;
    }

    /* renamed from: c */
    public boolean m33990c() {
        if (this.f57938b == State.ALPHA) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m33989d() {
        if (this.f57938b == State.ISO_IEC_646) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m33988e() {
        this.f57938b = State.ALPHA;
    }

    /* renamed from: f */
    public void m33987f() {
        this.f57938b = State.ISO_IEC_646;
    }

    /* renamed from: g */
    public void m33986g() {
        this.f57938b = State.NUMERIC;
    }

    /* renamed from: h */
    public void m33985h(int i) {
        this.f57937a = i;
    }
}