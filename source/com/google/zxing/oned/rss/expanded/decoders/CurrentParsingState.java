package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes5.dex */
public final class CurrentParsingState {

    /* renamed from: a */
    public int f57925a = 0;

    /* renamed from: b */
    public State f57926b = State.NUMERIC;

    /* loaded from: classes5.dex */
    public enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int m34000a() {
        return this.f57925a;
    }

    /* renamed from: b */
    public void m33999b(int i) {
        this.f57925a += i;
    }

    /* renamed from: c */
    public boolean m33998c() {
        if (this.f57926b == State.ALPHA) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m33997d() {
        if (this.f57926b == State.ISO_IEC_646) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void m33996e() {
        this.f57926b = State.ALPHA;
    }

    /* renamed from: f */
    public void m33995f() {
        this.f57926b = State.ISO_IEC_646;
    }

    /* renamed from: g */
    public void m33994g() {
        this.f57926b = State.NUMERIC;
    }

    /* renamed from: h */
    public void m33993h(int i) {
        this.f57925a = i;
    }
}
