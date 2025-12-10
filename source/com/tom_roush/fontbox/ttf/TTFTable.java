package com.tom_roush.fontbox.ttf;

/* loaded from: classes5.dex */
public class TTFTable {

    /* renamed from: a */
    public String f59593a;

    /* renamed from: b */
    public long f59594b;

    /* renamed from: c */
    public long f59595c;

    /* renamed from: d */
    public long f59596d;
    protected final TrueTypeFont font;
    protected volatile boolean initialized;

    public TTFTable(TrueTypeFont trueTypeFont) {
        this.font = trueTypeFont;
    }

    /* renamed from: b */
    public void m32859b(long j) {
        this.f59594b = j;
    }

    /* renamed from: c */
    public void m32858c(long j) {
        this.f59596d = j;
    }

    /* renamed from: d */
    public void m32857d(long j) {
        this.f59595c = j;
    }

    /* renamed from: e */
    public void m32856e(String str) {
        this.f59593a = str;
    }

    public long getCheckSum() {
        return this.f59594b;
    }

    public boolean getInitialized() {
        return this.initialized;
    }

    public long getLength() {
        return this.f59596d;
    }

    public long getOffset() {
        return this.f59595c;
    }

    public String getTag() {
        return this.f59593a;
    }

    /* renamed from: a */
    public void mo32848a(TrueTypeFont trueTypeFont, AbstractC22790wQ1 abstractC22790wQ1) {
    }
}
