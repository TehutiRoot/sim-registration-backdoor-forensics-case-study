package p000;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

/* renamed from: Eh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C17539Eh1 extends DataCharacter {

    /* renamed from: c */
    public final FinderPattern f1360c;

    /* renamed from: d */
    public int f1361d;

    public C17539Eh1(int i, int i2, FinderPattern finderPattern) {
        super(i, i2);
        this.f1360c = finderPattern;
    }

    /* renamed from: a */
    public int m68473a() {
        return this.f1361d;
    }

    /* renamed from: b */
    public FinderPattern m68472b() {
        return this.f1360c;
    }

    /* renamed from: c */
    public void m68471c() {
        this.f1361d++;
    }
}
