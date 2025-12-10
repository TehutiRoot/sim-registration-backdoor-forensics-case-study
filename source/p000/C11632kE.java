package p000;

import com.google.zxing.FormatException;

/* renamed from: kE */
/* loaded from: classes5.dex */
public final class C11632kE extends AbstractC12205lE {

    /* renamed from: b */
    public final int f67843b;

    /* renamed from: c */
    public final int f67844c;

    public C11632kE(int i, int i2, int i3) {
        super(i);
        if (i2 >= 0 && i2 <= 10 && i3 >= 0 && i3 <= 10) {
            this.f67843b = i2;
            this.f67844c = i3;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: b */
    public int m28975b() {
        return this.f67843b;
    }

    /* renamed from: c */
    public int m28974c() {
        return this.f67844c;
    }

    /* renamed from: d */
    public boolean m28973d() {
        if (this.f67843b == 10) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m28972e() {
        if (this.f67844c == 10) {
            return true;
        }
        return false;
    }
}
