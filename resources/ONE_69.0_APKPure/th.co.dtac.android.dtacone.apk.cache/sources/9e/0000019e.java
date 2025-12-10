package p000;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

/* renamed from: Bi1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C17374Bi1 extends DataCharacter {

    /* renamed from: c */
    public final FinderPattern f473c;

    /* renamed from: d */
    public int f474d;

    public C17374Bi1(int i, int i2, FinderPattern finderPattern) {
        super(i, i2);
        this.f473c = finderPattern;
    }

    /* renamed from: a */
    public int m69088a() {
        return this.f474d;
    }

    /* renamed from: b */
    public FinderPattern m69087b() {
        return this.f473c;
    }

    /* renamed from: c */
    public void m69086c() {
        this.f474d++;
    }
}